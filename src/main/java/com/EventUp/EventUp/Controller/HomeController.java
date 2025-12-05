package com.EventUp.EventUp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Este método diz: "Quando acessar localhost:8080/ (a raiz), mostre o index2"
    @GetMapping("/")
    public String home() {
        return "index2"; // O Spring busca automaticamente "index2.html" na pasta templates
    }
}