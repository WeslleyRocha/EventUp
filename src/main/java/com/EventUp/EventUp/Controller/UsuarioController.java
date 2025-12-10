package com.EventUp.EventUp.Controller;

import com.EventUp.EventUp.Model.Usuario;
import com.EventUp.EventUp.Repository.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    // --- NOVO: MÉTODO DE LOGIN ---
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha, HttpSession session, RedirectAttributes attributes) {
        // 1. Busca o usuário pelo email
        Usuario usuario = usuarioRepository.findByEmail(email).orElse(null);;

        // 2. Verifica se existe e se a senha bate
        if (usuario != null && usuario.getSenha().equals(senha)) {
            session.setAttribute("usuarioLogado", usuario);
            return "redirect:/"; // Sucesso: Vai pra Home
        } else {
            // Erro: Manda mensagem para o pop-up vermelho
            attributes.addFlashAttribute("erro", "E-mail ou senha incorretos!");
            return "redirect:/"; // Volta pra Home com o erro
        }
    }

    //MÉTODOS EXISTENTES

    @GetMapping("/sair")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        logger.info("Recebida requisição para criar usuário: " + usuario);
        try {
            Usuario novoUsuario = usuarioRepository.save(usuario);
            logger.info("Usuário criado com sucesso com ID: " + novoUsuario.getId_usuario());
            // Removemos a senha do retorno por segurança
            // novoUsuario.setSenha(null); // Comentei para evitar NullPointer se necessário depois
            return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Erro ao salvar o usuário no banco de dados.", e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // MÉTODO DE ATUALIZAR
    @PostMapping("/atualizar")
    public String atualizarDados(Usuario usuarioFormulario, HttpSession session, RedirectAttributes attributes) {

        Usuario usuarioSessao = (Usuario) session.getAttribute("usuarioLogado");
        if (usuarioSessao == null) return "redirect:/";

        // Busca o usuário original no banco
        Usuario usuarioBanco = usuarioRepository.findById(usuarioSessao.getId_usuario()).orElse(null);

        if (usuarioBanco != null) {
            // ATUALIZAÇÃO DOS DADOS BÁSICOS
            usuarioBanco.setNome(usuarioFormulario.getNome());
            usuarioBanco.setSobrenome(usuarioFormulario.getSobrenome());
            usuarioBanco.setTelefone(usuarioFormulario.getTelefone());
            usuarioBanco.setData_nascimento(usuarioFormulario.getData_nascimento());
            usuarioBanco.setGenero(usuarioFormulario.getGenero());

            // ATUALIZAÇÃO DE ENDEREÇO E BIO
            usuarioBanco.setCidade(usuarioFormulario.getCidade());
            usuarioBanco.setEstado(usuarioFormulario.getEstado());
            usuarioBanco.setBio(usuarioFormulario.getBio());
            usuarioBanco.setFoto(usuarioFormulario.getFoto());

            // ATUALIZAÇÃO DE SENHA
            if (usuarioFormulario.getSenha() != null && !usuarioFormulario.getSenha().isEmpty()) {
                usuarioBanco.setSenha(usuarioFormulario.getSenha());
            }

            usuarioRepository.save(usuarioBanco);
            session.setAttribute("usuarioLogado", usuarioBanco);
            attributes.addFlashAttribute("mensagem", "Dados atualizados com sucesso!");
        }

        return "redirect:/";
    }
}