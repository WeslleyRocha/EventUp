package com.EventUp.EventUp.Repository;

import com.EventUp.EventUp.Model.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Long> {

}