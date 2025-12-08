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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/eventos")
public class EventoController {

    public static final Logger logger = LoggerFactory.getLogger(EventoController.class);

    @Autowired
    private EventoRepository eventoRepository;

    @PostMapping
    @ResponseBody
    public ResponseEntity<Evento> criarEvento(@RequestBody Evento evento, HttpSession session) {
        logger.info("Recebida requisição para criar evento:" + evento);
        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");

        if (usuarioLogado == null) {
            logger.warn("Tentativa de criação de evento por usuário não logado.");
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        try {
            evento.setUsuarioCriador(usuarioLogado);
            Evento novoEvento = eventoRepository.save(evento);
            logger.info("Evento " + novoEvento.getNomeEvento() + " criado com sucesso pelo usuário ID: " + usuarioLogado.getId_usuario());
            return new ResponseEntity<>(novoEvento, HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Erro ao salvar o evento no banco de dados.", e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public String detalhesEventoPagina(@PathVariable("id") Long id, Model model) {
        Optional<Evento> eventoOpt = eventoRepository.findById(id);
        if (eventoOpt.isEmpty()) {
            return "redirect:/";
        }
        model.addAttribute("evento", eventoOpt.get());
        return "Evento/detalhes-evento"; 
    }

    @GetMapping("/api/{id}")
    @ResponseBody
    public ResponseEntity<Evento> getEventoDados(@PathVariable("id") Long id) {
        Optional<Evento> eventoOpt = eventoRepository.findById(id);
        return eventoOpt.map(evento -> new ResponseEntity<>(evento, HttpStatus.OK))
                      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}