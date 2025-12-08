package com.EventUp.EventUp.Repository;

import com.EventUp.EventUp.Model.QueroIr;
import com.EventUp.EventUp.Model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface QueroIrRepository extends CrudRepository<QueroIr, Long> {

    List<QueroIr> findByUsuario(Usuario usuario);

    @Transactional
    void deleteByUsuarioAndEvento_Id(Usuario usuario, Long eventoId);
}