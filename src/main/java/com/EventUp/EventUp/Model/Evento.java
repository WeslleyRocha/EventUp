package com.EventUp.EventUp.Model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Eventos")
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Long id;

    @Column(name = "nome_evento", nullable = false)
    private String nomeEvento;

    @Column(name = "descricao_detalhada", columnDefinition = "TEXT")
    private String descricaoDetalhada;

    @Column(name = "data_hora_inicio", nullable = false)
    private LocalDateTime dataHoraInicio;

    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;

    @Column(name = "restricao_idade")
    private Integer restricaoIdade;

    @Column(name = "url_imagem_destaque")
    private String urlImagemDestaque;

    @Column(name = "gratuito")
    private Boolean gratuito;

    @Column(name = "valor_ingresso")
    private Double valorIngresso;

    @ManyToOne
    @JoinColumn(name = "id_local", nullable = false)
    private Locais local;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

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