package com.EventUp.EventUp.Controller;

import com.EventUp.EventUp.Model.Evento;
import com.EventUp.EventUp.Model.QueroIr;
import com.EventUp.EventUp.Model.Usuario;
import com.EventUp.EventUp.Repository.QueroIrRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/quero-ir")
public class QueroIrController {

    @Autowired
    private QueroIrRepository queroIrRepository;

    @PostMapping
    public ResponseEntity<?> registrarInteresse(@RequestBody Map<String, Long> payload, HttpSession session) {
        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");
        if (usuarioLogado == null) {
            return new ResponseEntity<>(Map.of("message", "Usuário não autenticado."), HttpStatus.UNAUTHORIZED);
        }

        Long idEvento = payload.get("id_evento");
        if (idEvento == null) {
            return new ResponseEntity<>(Map.of("message", "O ID do evento é obrigatório."), HttpStatus.BAD_REQUEST);
        }

        QueroIr novoInteresse = new QueroIr();
        novoInteresse.setUsuario(usuarioLogado);
        Evento evento = new Evento();
        evento.setId(idEvento);
        novoInteresse.setEvento(evento);
        queroIrRepository.save(novoInteresse);

        long novaContagem = queroIrRepository.countByEvento_Id(idEvento);

        return new ResponseEntity<>(Map.of(
                "message", "Interesse registrado com sucesso!",
                "novaContagem", novaContagem
        ), HttpStatus.CREATED);
    }

    @DeleteMapping("/{eventoId}")
    public ResponseEntity<?> cancelarInteresse(@PathVariable Long eventoId, HttpSession session) {
        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");
        if (usuarioLogado == null) {
            return new ResponseEntity<>(Map.of("message", "Usuário não autenticado."), HttpStatus.UNAUTHORIZED);
        }

        try {
            queroIrRepository.deleteByUsuarioAndEvento_Id(usuarioLogado, eventoId);
            
            long novaContagem = queroIrRepository.countByEvento_Id(eventoId);

            return new ResponseEntity<>(Map.of(
                    "message", "Interesse cancelado com sucesso!",
                    "novaContagem", novaContagem
            ), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("message", "Erro ao cancelar o interesse."), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}