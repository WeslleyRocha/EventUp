package com.EventUp.EventUp.Model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "eventos") // Nome da tabela no plural, boa prática
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento") // Garante que o nome da coluna seja id_evento
    private Long id;

    @Column(name = "nome_evento", nullable = false) // nullable=false torna obrigatório
    private String nomeEvento;

    @Column(name = "descricao_detalhada", columnDefinition = "TEXT")
    private String descricaoDetalhada;

    @Column(name = "data_hora_inicio", nullable = false)
    private LocalDateTime dataHoraInicio;

    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;

    @Column(name = "restricao_idade")
    private Integer restricaoIdade; // Usar Integer permite nulo, int não.

    @Column(name = "url_imagem_destaque")
    private String urlImagemDestaque;

    @Column(name = "gratuito")
    private Boolean gratuito;

    @Column(name = "valor_ingresso")
    private Double valorIngresso;


    //Ligação com LOCAIS (Parte da Rillary)
    @ManyToOne // Muitos Eventos podem ser no mesmo Local
    @JoinColumn(name = "id_local", nullable = false) // A coluna no banco será id_local
    private Locais local;

    //Ligação com CATEGORIA
    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    //Ligação com USUARIO (Criador)
    @ManyToOne
    @JoinColumn(name = "id_usuario_criador", nullable = false)
    private Usuario usuarioCriador;


    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Integer getRestricaoIdade() {
        return restricaoIdade;
    }

    public void setRestricaoIdade(Integer restricaoIdade) {
        this.restricaoIdade = restricaoIdade;
    }

    public String getUrlImagemDestaque() {
        return urlImagemDestaque;
    }

    public void setUrlImagemDestaque(String urlImagemDestaque) {
        this.urlImagemDestaque = urlImagemDestaque;
    }

    public Boolean getGratuito() {
        return gratuito;
    }

    public void setGratuito(Boolean gratuito) {
        this.gratuito = gratuito;
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Locais getLocal() {
        return local;
    }

    public void setLocal(Locais local) {
        this.local = local;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuarioCriador() {
        return usuarioCriador;
    }

    public void setUsuarioCriador(Usuario usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


}