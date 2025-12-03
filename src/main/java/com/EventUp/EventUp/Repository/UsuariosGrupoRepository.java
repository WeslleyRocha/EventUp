package com.EventUp.EventUp.Repository;

import com.EventUp.EventUp.Model.UsuariosGrupo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosGrupoRepository  extends CrudRepository<UsuariosGrupo,Integer> {
}