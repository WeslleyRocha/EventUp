package com.EventUp.EventUp.Model;

import jakarta.persistence.*;

@Entity
@Table (name = "Locais")
public class Locais {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_local", nullable = false)
    private Long id_local;
    
	@Column(name = "nome_local", nullable = false)
	private String nome_local;
    
    @Column(name = "endereco_completo", nullable = false)
    private String endereco_completo;

    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Column(name = "longitude", nullable = false)
    private Double longitude;

    @Column(name = "info_estacionamento")
    private String info_estacionamento;

    @Column(name = "info_transporte_publico")
    private String info_transporte_publico;

    @Column(name = "info_acessibilidade")
    private String info_acessibilidade;


    public Long getId_local() {
        return id_local;
    }
    public void setId_local(Long id_local) {
        this.id_local = id_local;
    }

    public String getNome_local() {
        return nome_local;
    }
    public void setNome_local(String nome_local) {
        this.nome_local = nome_local;
    }

    public String getEndereco_completo() {
        return endereco_completo;
    }
    public void setEndereco_completo(String endereco_completo) {
        this.endereco_completo = endereco_completo;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude; }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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
}
