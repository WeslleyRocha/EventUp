document.addEventListener('DOMContentLoaded', () => {
    // Referências aos elementos
    const modalLoginEl = document.getElementById('modalLogin');
    const modalCadastroEl = document.getElementById('modalCadastro');

    // Inicializa os Modais do Bootstrap se eles existirem na página
    const modalLogin = modalLoginEl ? new bootstrap.Modal(modalLoginEl) : null;
    const modalCadastro = modalCadastroEl ? new bootstrap.Modal(modalCadastroEl) : null;

    // Lógica para alternar entre modais (ex: clicar em "Criar conta" dentro do Login)
    const btnOpenCadastro = document.querySelector('[data-bs-target="#modalCadastro"]');
    if(btnOpenCadastro) {
        btnOpenCadastro.addEventListener('click', () => {
            // Se o modal de login estiver aberto, fecha ele primeiro (opcional)
            if (modalLoginEl && modalLoginEl.classList.contains('show')) {
                modalLogin.hide();
            }
        });
    }

    console.log("EventUp App.js carregado com sucesso!");
});