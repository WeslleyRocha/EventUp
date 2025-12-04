package com.EventUp.EventUp.Controller;

import com.EventUp.EventUp.Model.Usuario;
import com.EventUp.EventUp.Repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {

        logger.info("Recebida requisição para criar usuário: {}", usuario);

        try {
            Usuario novoUsuario = usuarioRepository.save(usuario);
            logger.info("Usuário criado com sucesso com ID: {}", novoUsuario.getId_usuario());

            novoUsuario.setSenha(null);
            return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);

        } catch (Exception e) {

            logger.error("Erro ao salvar o usuário no banco de dados.", e);

            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
