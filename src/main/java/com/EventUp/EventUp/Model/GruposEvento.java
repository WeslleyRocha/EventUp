package com.EventUp.EventUp.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "GruposEvento")
public class GruposEvento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo")
    private Long id_grupo;

    @ManyToOne
    @JoinColumn(name = "id_evento", nullable = false)
    private Evento evento;

    @Column(name = "nome_grupo")
    private String nome_grupo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "limite_participantes")
    private int limite_participantes;

    @CreationTimestamp
    @Column (name = "data_criacao")
    private LocalDateTime data_criacao;

    public Long getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(Long id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getNome_grupo() {
        return nome_grupo;
    }

    public void setNome_grupo(String nome_grupo) {
        this.nome_grupo = nome_grupo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getLimite_participantes() {
        return limite_participantes;
    }

    public void setLimite_participantes(int limite_participantes) {
        this.limite_participantes = limite_participantes;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }
}
