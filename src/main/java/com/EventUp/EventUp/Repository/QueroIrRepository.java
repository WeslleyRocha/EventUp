package com.EventUp.EventUp.Repository;

import com.EventUp.EventUp.Model.QueroIr;
import com.EventUp.EventUp.Model.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QueroIrRepository extends JpaRepository<QueroIr, Long> {

    List<QueroIr> findByUsuario(Usuario usuario);

    @Transactional
    void deleteByUsuarioAndEvento_Id(Usuario usuario, Long eventoId);

    long countByEvento_Id(Long eventoId);
}