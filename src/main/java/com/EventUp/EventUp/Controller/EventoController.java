package com.EventUp.EventUp.Controller;

import com.EventUp.EventUp.Model.Evento;
import com.EventUp.EventUp.Model.Usuario;
import com.EventUp.EventUp.Repository.EventoRepository;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    public static final Logger logger = LoggerFactory.getLogger(EventoController.class);

    @Autowired
    private EventoRepository eventoRepository;

    @PostMapping
    public ResponseEntity<Evento> criarEvento (@RequestBody Evento evento, HttpSession session){

        logger.info("Recebida requisição para criar evento:" + evento);

        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");

        if (usuarioLogado == null) {
            logger.warn("Tentativa de criação de evento por usuário não logado.");

            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        try {
            evento.setUsuarioCriador(usuarioLogado);

            Evento novoEvento = eventoRepository.save(evento);
            logger.info("Evento" + novoEvento.getNomeEvento() + " criado com sucesso pelo usuário ID:" + usuarioLogado.getId_usuario());

            return new ResponseEntity<>(novoEvento, HttpStatus.CREATED);

        } catch (Exception e){
            logger.error("Erro ao salvar o evento no banco de dados.", e);

            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
