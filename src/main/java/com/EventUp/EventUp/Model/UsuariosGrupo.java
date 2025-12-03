package com.EventUp.EventUp.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "UsuariosGrupo")
public class UsuariosGrupo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_usuario")
    private Long id_usuario;

    @Column (name = "id_grupo")
    private Long id_grupo;

    @CreationTimestamp
    @Column (name = "data_ingresso")
    private LocalDateTime data_ingresso;


    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(Long id_grupo) {
        this.id_grupo = id_grupo;
    }

    public LocalDateTime getData_ingresso() {
        return data_ingresso;
    }

    public void setData_ingresso(LocalDateTime data_ingresso) {
        this.data_ingresso = data_ingresso;
    }
}