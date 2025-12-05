package com.EventUp.EventUp.Controller;

import com.EventUp.EventUp.Model.Usuario;
import com.EventUp.EventUp.Service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String logar(@RequestParam String email,
                        @RequestParam String senha,
                        HttpSession session,
                        Model model) {

        System.out.println("--- TENTATIVA DE LOGIN ---");
        System.out.println("Email recebido do front: " + email);
        System.out.println("Senha recebida do front: " + senha);

        Usuario usuarioLogado = loginService.verificarLogin(email, senha);

        if (usuarioLogado != null) {
            System.out.println("Sucesso! Usuário encontrado: " + usuarioLogado.getNome());
        } else {
            System.out.println("Falha! Usuário é NULL (não achou no banco ou senha errada).");
        }

        if (usuarioLogado != null) {
            session.setAttribute("usuarioLogado", usuarioLogado);
            return "redirect:/";
        } else {
            model.addAttribute("erro", "E-mail ou senha inválidos!");
            return "index2";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}