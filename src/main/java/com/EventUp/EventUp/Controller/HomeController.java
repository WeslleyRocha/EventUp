package com.EventUp.EventUp.Controller;

import com.EventUp.EventUp.Repository.CategoriaRepository;
import com.EventUp.EventUp.Repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; // Importante ser apenas @Controller
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("/") // Mapeia a URL raiz (localhost:8080/)
    public String index(
            @RequestParam(value = "categoriaId", required = false) Long categoriaId,
            @RequestParam(value = "busca", required = false) String busca,
            Model model) {

        // 1. Lógica de Filtro e Busca
        if (busca != null && !busca.isEmpty()) {
            model.addAttribute("eventos", eventoRepository.findByNomeEventoContainingIgnoreCase(busca));
        }
        else if (categoriaId != null) {
            model.addAttribute("eventos", eventoRepository.findByCategoria_Id(categoriaId));
        }
        else {
            model.addAttribute("eventos", eventoRepository.findAll());
        }

        // 2. Carrega as categorias para os botões
        model.addAttribute("categorias", categoriaRepository.findAll());

        return "index2"; // Retorna o arquivo index.html
    }
}