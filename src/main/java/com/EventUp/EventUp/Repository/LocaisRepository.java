package com.EventUp.EventUp.Repository;

import com.EventUp.EventUp.Model.Locais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaisRepository  extends CrudRepository<Locais, Long> {
}