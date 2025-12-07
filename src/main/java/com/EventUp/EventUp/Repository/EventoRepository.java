package com.EventUp.EventUp.Repository;

import com.EventUp.EventUp.Model.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Long> {
    // Filtro por Categoria (Você já tem)
    List<Evento> findByCategoria_Id(Long id);

    // Filtro por Texto
    List<Evento> findByNomeEventoContainingIgnoreCase(String nome);

}


