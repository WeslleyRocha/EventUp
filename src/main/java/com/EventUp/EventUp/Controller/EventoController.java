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

@Controller //@Controller para poder carregar páginas HTML
@RequestMapping("/eventos")
public class EventoController {

    public static final Logger logger = LoggerFactory.getLogger(EventoController.class);

    @Autowired
    private EventoRepository eventoRepository;

    // --- MÉTODO 1: API PARA CRIAR EVENTO ---
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


    // --- MÉTODO 2: PÁGINA DE DETALHES (HTML) ---
    @GetMapping("/{id}")
    public String detalhesEvento(@PathVariable("id") Long id, Model model) {

        // 1. Busca o evento no banco pelo ID
        Optional<Evento> eventoOpt = eventoRepository.findById(id);

        // 2. Se não achar (ex: ID 999), volta para a home
        if (eventoOpt.isEmpty()) {
            return "redirect:/";
        }

        // 3. Se achar, manda o evento para a view
        model.addAttribute("evento", eventoOpt.get());

        return "detalhes-evento"; // Vai abrir o arquivo detalhes-evento.html
    }

}