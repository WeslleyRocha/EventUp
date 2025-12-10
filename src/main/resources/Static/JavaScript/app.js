// 1. INICIALIZAÇÃO AO CARREGAR A PÁGINA
document.addEventListener('DOMContentLoaded', () => {

    // Referências aos elementos
    const modalLoginEl = document.getElementById('modalLogin');
    const modalCadastroEl = document.getElementById('modalCadastro');

    // Inicializa os Modais do Bootstrap se eles existirem na página
    // Isso é útil para manipulação via JS, mas o data-bs-toggle do HTML já faz o básico
    const modalLogin = modalLoginEl ? new bootstrap.Modal(modalLoginEl) : null;
    const modalCadastro = modalCadastroEl ? new bootstrap.Modal(modalCadastroEl) : null;

    console.log("EventUp App.js carregado e DOM pronto!");
});

// 2. FUNÇÕES GLOBAIS (FORA DO DOMContentLoaded PARA O HTML ENXERGAR)

// FUNÇÃO PARA O BOTÃO QUERO IR
function registrarInteresse(idEvento) {
    const url = '/quero-ir';

    fetch(url, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ id_evento: idEvento })
    })
    .then(response => {
        if (response.status === 401) {
            alert("Você precisa fazer login para confirmar presença!");
            // Opcional: Abrir modal de login automaticamente
            const modalLogin = new bootstrap.Modal(document.getElementById('modalLogin'));
            modalLogin.show();
            return null;
        }
        if (!response.ok) throw new Error('Erro na requisição');
        return response.json();
    })
    .then(data => {
        if (data && data.novaContagem !== undefined) {
            // Atualiza o contador na tela (+X vão)
            const contador = document.getElementById('contador-' + idEvento);
            if (contador) {
                contador.innerText = '+' + data.novaContagem + ' vão';
            }
            // Feedback visual rápido (opcional)
            // alert(data.message);
        }
    })
    .catch(error => console.error('Erro no processamento:', error));
}

// FUNÇÃO PARA ABRIR O MODAL DE DETALHES
function abrirDetalhes(botao) {
    // 1. Pega os dados dos atributos do botão (data-...)
    const titulo = botao.getAttribute('data-titulo');
    const img = botao.getAttribute('data-img');
    const cat = botao.getAttribute('data-cat');
    const data = botao.getAttribute('data-data');
    const hora = botao.getAttribute('data-hora');
    const local = botao.getAttribute('data-local');
    const valor = botao.getAttribute('data-valor');
    const desc = botao.getAttribute('data-desc');
    const criador = botao.getAttribute('data-criador');

    // 2. Preenche os elementos do Modal com esses dados
    // Verifica se o elemento existe antes de tentar preencher para evitar erro null
    if(document.getElementById('detalheTitulo')) document.getElementById('detalheTitulo').innerText = titulo;

    const imgElement = document.getElementById('detalheImagem');
    if(imgElement) {
        // Usa imagem padrão se vier vazio
        imgElement.src = img && img.trim() !== '' ? img : 'https://placehold.co/600x400/purple/white?text=Evento';
    }

    if(document.getElementById('detalheCategoria')) document.getElementById('detalheCategoria').innerText = cat || 'Geral';
    if(document.getElementById('detalheData')) document.getElementById('detalheData').innerText = data;
    if(document.getElementById('detalheHora')) document.getElementById('detalheHora').innerText = hora;
    if(document.getElementById('detalheLocal')) document.getElementById('detalheLocal').innerText = local;
    if(document.getElementById('detalheValor')) document.getElementById('detalheValor').innerText = valor;
    if(document.getElementById('detalheDescricao')) document.getElementById('detalheDescricao').innerText = desc;
    if(document.getElementById('detalheCriador')) document.getElementById('detalheCriador').innerText = criador;

    // 3. Abre o Modal
    const modalElement = document.getElementById('modalDetalhes');
    if (modalElement) {
        const modal = new bootstrap.Modal(modalElement);
        modal.show();
    } else {
        console.error("Erro: Modal de detalhes não encontrado no HTML.");
    }
}