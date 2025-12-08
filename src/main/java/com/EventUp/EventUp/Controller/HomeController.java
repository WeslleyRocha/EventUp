package com.EventUp.EventUp.Controller;

import com.EventUp.EventUp.Model.QueroIr;
import com.EventUp.EventUp.Model.Usuario;
import com.EventUp.EventUp.Repository.CategoriaRepository;
import com.EventUp.EventUp.Repository.EventoRepository;
import com.EventUp.EventUp.Repository.QueroIrRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private QueroIrRepository queroIrRepository;

    @GetMapping("/")
    public String index(
            @RequestParam(value = "categoriaId", required = false) Long categoriaId,
            @RequestParam(value = "busca", required = false) String busca,
            Model model,
            HttpSession session) {

        // 1. Lógica de Filtro e Busca
        if (busca != null && !busca.isEmpty()) {
            model.addAttribute("eventos", eventoRepository.findByNomeEventoContainingIgnoreCase(busca));
        } else if (categoriaId != null) {
            model.addAttribute("eventos", eventoRepository.findByCategoria_Id(categoriaId));
        } else {
            model.addAttribute("eventos", eventoRepository.findAll());
        }

        // 2. Carrega as categorias para os botões
        model.addAttribute("categorias", categoriaRepository.findAll());

        // 3. Lógica para buscar interesses do usuário
        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");
        Set<Long> eventosInteresseIds;

        if (usuarioLogado != null) {
            // Se o usuário está logado, busca os evento que ele vai
            List<QueroIr> interesses = queroIrRepository.findByUsuario(usuarioLogado);

            // Extrai apenas os IDs dos eventos e coloca em um Set
            eventosInteresseIds = interesses.stream()
                                            .map(interesse -> interesse.getEvento().getId())
                                            .collect(Collectors.toSet());
        } else {
            // Se não há usuário logado, cria um conjunto vazio
            eventosInteresseIds = Collections.emptySet();
        }

        // Adiciona o conjunto de IDs ao modelo
        model.addAttribute("eventosInteresseIds", eventosInteresseIds);

        return "index2";
    }
}