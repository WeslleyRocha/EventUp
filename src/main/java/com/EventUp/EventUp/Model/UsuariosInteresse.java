package com.EventUp.EventUp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table (name = "UsuariosInteresse")
public class UsuariosInteresse implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_interesse", nullable = false)
    private Interesse Interesse;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Interesse getInteresse() {
        return Interesse;
    }

    public void setInteresse(Interesse interesse) {
        Interesse = interesse;
    }
}
