package com.EventUp.EventUp.Controller;

import com.EventUp.EventUp.Model.Usuario;
import com.EventUp.EventUp.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // LISTAR - GET /usuarios
    @GetMapping("/usuarios")
    public String listarUsuarios(Model model){
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "Usuario/lista"; // templates/Usuario/lista.html
    }

    // FORM NOVO - GET /usuarios/novo
    @GetMapping("/usuarios/novo")
    public String novoUsuario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "Usuario/form"; // templates/Usuario/form.html
    }

    // SALVAR (CREATE/UPDATE) - POST /usuarios/salvar
    @PostMapping("/usuarios/salvar")
    public String salvarUsuario(@ModelAttribute Usuario usuario){
        usuarioRepository.save(usuario);
        return "redirect:/usuarios";
    }

    // FORM EDITAR - GET /usuarios/editar/{id}
    @GetMapping("/usuarios/editar/{id_usuario}")
    public String editarUsuario(@PathVariable("id_usuario") Long id, Model model){
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuário inválido: " + id));

        model.addAttribute("usuario", usuario);
        return "Usuario/form";
    }

    // EXCLUIR - GET /usuarios/excluir/{id}
    @GetMapping("/usuarios/excluir/{id_usuario}")
    public String excluirUsuario(@PathVariable("id_usuario") Long id){
        usuarioRepository.deleteById(id);
        return "redirect:/usuarios";
    }
}
