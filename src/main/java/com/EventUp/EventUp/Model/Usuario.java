package com.EventUp.EventUp.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(name = "nome_completo", nullable = false)
    private String nome_completo;

    @Column(name = "data_nascimento", nullable = false)
    private Date data_nascimento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "email", nullable = false)
    private String email;

    @Column (name = "senha", nullable = false)
    private String senha;

    @Column (name = "telefone", nullable = false)
    private String telefone;

    @Column (name = "cidade")
    private String cidade;

    @Column (name = "estado")
    private String estado;

    @Column (name = "bio")
    private String bio;

    @Column (name = "foto")
    private String foto;

    @CreationTimestamp
    @Column (name = "data_criacao")
    private LocalDateTime data_criacao;

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id) {
        this.id_usuario = id_usuario;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }
}
