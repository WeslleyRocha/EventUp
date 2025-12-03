package com.EventUp.EventUp.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name = "UsuariosInteresse")
public class UsuariosInteresse implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarios_interesse")
    private Long id_usuarios_interesse;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_interesse", nullable = false)
    private Interesse Interesse;


}
