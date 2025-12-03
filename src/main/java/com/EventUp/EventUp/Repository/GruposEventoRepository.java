package com.EventUp.EventUp.Repository;

import com.EventUp.EventUp.Model.GruposEvento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GruposEventoRepository extends CrudRepository<GruposEvento, Long> {
}