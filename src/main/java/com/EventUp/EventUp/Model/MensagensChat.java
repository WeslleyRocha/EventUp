package com.EventUp.EventUp.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "MensagensChat")
public class MensagensChat  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensagem")
    private Long id_mensagem;

    @ManyToOne
    @JoinColumn(name = "id_grupo", nullable = false)
    private GruposEvento grupoEvento;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "conteudo_mensagem")
    private String conteudo_mensagem;

    @CreationTimestamp
    @Column (name = "data_criacao")
    private LocalDateTime data_criacao;

    public Long getId_mensagem() {
        return id_mensagem;
    }

    public void setId_mensagem(Long id_mensagem) {
        this.id_mensagem = id_mensagem;
    }

    public GruposEvento getGrupoEvento() {
        return grupoEvento;
    }

    public void setGrupoEvento(GruposEvento grupoEvento) {
        this.grupoEvento = grupoEvento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getConteudo_mensagem() {
        return conteudo_mensagem;
    }

    public void setConteudo_mensagem(String conteudo_mensagem) {
        this.conteudo_mensagem = conteudo_mensagem;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }
}