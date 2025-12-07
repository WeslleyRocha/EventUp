package com.EventUp.EventUp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

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

    @Column(name = "data_hora_inicio")
    private LocalDateTime dataHoraInicio;

    @Column(name = "data_hora_fim")
    private LocalDateTime dataHoraFim;

    @Column(name = "restricao_idade")
    private Integer restricaoIdade;

    @Column(name = "url_imagem_destaque")
    private String urlImagemDestaque;

    @Column(name = "gratuito")
    private Boolean gratuito = true;

    @Column(name = "valor_ingresso")
    private Double valorIngresso;

    @Column(name = "local_evento")
    private String local_evento;

    @Column(name = "evento_online")
    private Boolean evento_online = false;

    @Column(name = "link_evento_online")
    private String link_evento_online;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "numero")
    private String numero;

    @Column(name = "cep")
    private String cep;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "info_estacionamento")
    private String info_estacionamento;

    @Column(name = "info_transporte_publico")
    private String info_transporte_publico;

    @Column(name = "info_acessibilidade")
    private String info_acessibilidade;

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

    public Boolean getEvento_online() {
        return evento_online;
    }

    public void setEvento_online(Boolean evento_online) {
        this.evento_online = evento_online;
    }

    public String getLink_evento_online() {
        return link_evento_online;
    }

    public void setLink_evento_online(String link_evento_online) {
        this.link_evento_online = link_evento_online;
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

    public String getLocal_evento() {
        return local_evento;
    }

    public void setLocal_evento(String local_evento) {
        this.local_evento = local_evento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getInfo_estacionamento() {
        return info_estacionamento;
    }

    public void setInfo_estacionamento(String info_estacionamento) {
        this.info_estacionamento = info_estacionamento;
    }

    public String getInfo_transporte_publico() {
        return info_transporte_publico;
    }

    public void setInfo_transporte_publico(String info_transporte_publico) {
        this.info_transporte_publico = info_transporte_publico;
    }

    public String getInfo_acessibilidade() {
        return info_acessibilidade;
    }

    public void setInfo_acessibilidade(String info_acessibilidade) {
        this.info_acessibilidade = info_acessibilidade;
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