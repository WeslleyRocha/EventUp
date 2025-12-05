package com.EventUp.EventUp.Service;

import com.EventUp.EventUp.Model.Usuario;
import com.EventUp.EventUp.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

        @Autowired
        private UsuarioRepository usuarioRepository;

        public Usuario verificarLogin(String email, String senha) {
            Optional<Usuario> usuarioOpt = usuarioRepository.findByEmail(email);

            if (usuarioOpt.isPresent()) {
                Usuario usuario = usuarioOpt.get();
                if (usuario.getSenha().equals(senha)) {
                    return usuario;
                }
            }
            return null;
        }
}