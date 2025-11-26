package com.EventUp.EventUp.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id;

    @Column(name = "nome_categoria ", nullable = false)
    private String nomeCategoria ;
}