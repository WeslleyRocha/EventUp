package com.EventUp.EventUp.Repository;

import com.EventUp.EventUp.Model.UsuariosInteresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosInteresseRepository extends JpaRepository<UsuariosInteresse, Long> {

}