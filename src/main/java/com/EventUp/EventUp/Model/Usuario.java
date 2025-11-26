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
    private Long id;

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


}
