package com.EventUp.EventUp.Model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Interesses")
public class Interesse implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_interesse")
    private Long id;

    @Column(name = "nome_interesse", nullable = false)
    private String nomeInteresse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeInteresse() {
        return nomeInteresse;
    }

    public void setNomeInteresse(String nomeInteresse) {
        this.nomeInteresse = nomeInteresse;
    }
}

