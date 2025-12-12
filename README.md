# 🚀 EventUp

> **Nunca mais vá sozinho!** Encontre eventos incríveis e conecte-se com quem também vai.

![Version](https://img.shields.io/badge/version-1.0.0-blue)
![Status](https://img.shields.io/badge/status-MVP-orange)
![Java](https://img.shields.io/badge/Java-Spring%20Boot-red)

## 📖 Sobre o Projeto

O **EventUp** é uma plataforma web desenvolvida para facilitar a descoberta e gestão de eventos. O objetivo principal é permitir que usuários encontrem eventos de seu interesse (Música, Tecnologia, Cultura, etc.), vejam detalhes e confirmem presença, criando uma comunidade em torno das experiências presenciais e online.

Este projeto foi desenvolvido como parte de um desafio técnico/acadêmico, focado na entrega de valor e funcionalidade completa (Full Stack) dentro de um **prazo extremamente curto**.

<div align="center">
  <img src="https://github.com/WeslleyRocha/EventUp/blob/main/EventLogo.png?raw=true" alt="Logo EventUp" width="300">
  <img src="https://github.com/WeslleyRocha/EventUp/blob/main/EventUpOn.png?raw=true" alt="Home EventUp" width="300">
  <img src="https://github.com/WeslleyRocha/EventUp/blob/main/UsuarioLogado.png?raw=true" alt="UsuarioEventUp" width="300">
  
</div>


---

## 🛠️ Tecnologias Utilizadas

O projeto foi construído utilizando uma arquitetura MVC (Model-View-Controller) robusta:

### Backend
- **Java 17+**
- **Spring Boot 3.5.8**: Framework principal.
- **Spring Data JPA**: Para persistência e manipulação de dados.
- **Hibernate**: ORM (Object-Relational Mapping).
- **Thymeleaf**: Template engine para renderização do lado do servidor (Server-Side Rendering).

### Frontend
- **HTML5 & CSS3**: Estrutura e estilização.
- **Bootstrap 5**: Framework CSS para layout responsivo, modais e componentes visuais.
- **JavaScript (ES6+)**: Manipulação do DOM, chamadas assíncronas (Fetch API) e lógica de interação (Modais, Botões).

### Banco de Dados
- **MySQL**: Banco de dados relacional.

### Ferramentas
- **Maven**: Gerenciamento de dependências.
- **IntelliJ IDEA**: IDE de desenvolvimento.
- **Git & GitHub**: Versionamento de código.

---

## 🎯 O Desafio e a Organização

Desenvolver o **EventUp** foi um exercício intenso de priorização e agilidade.

* **Cronograma:** O maior desafio foi traduzir o escopo mapeado e documentado em código funcional em pouquíssimo tempo.
* **Escopo Fechado:** Focamos nas funcionalidades essenciais (CRUD de Usuários, Visualização de Eventos, Inscrição) para garantir a entrega de um MVP funcional.
* **Integração Full Stack:** A equipe precisou atuar simultaneamente no Backend (Lógica de negócios, API REST e Controllers) e Frontend (Integração com Thymeleaf e JS), resolvendo conflitos de integração em tempo real.

---

## ✨ Funcionalidades da Versão 1.0 (MVP)

* ✅ **Cadastro e Login de Usuários:** Sistema de autenticação com validação.
* ✅ **Gestão de Perfil:** Edição de dados do usuário ("Meus Dados") e atualização de foto de perfil via URL.
* ✅ **Catálogo de Eventos:** Listagem de eventos com cards modernos e responsivos.
* ✅ **Filtros Inteligentes:** Filtragem de eventos por categorias (Música, Tech, Gastronomia, etc.).
* ✅ **Detalhamento:** Modal dinâmico com informações completas do evento (Data, Hora, Local/Online, Preço).
* ✅ **Interação:** Funcionalidade "Quero Ir" com contador de participantes em tempo real.

---

## 🚧 Desenvolvimento Futuro e Melhorias

Esta é a **primeira versão** do EventUp. Estamos cientes de que, para um ambiente de produção em larga escala, evoluções são necessárias. O roadmap futuro contempla:

1.  **Segurança Avançada (Spring Security):**
    * Implementação de JWT (JSON Web Tokens) ou OAuth2.
    * Criptografia de senhas (BCrypt) no banco de dados.
    * Controle de acesso baseado em Roles (ADMIN, USER).

2.  **Upload de Imagens:**
    * Substituir o uso de URLs externas e Base64 por armazenamento em nuvem (ex: AWS S3 ou Google Cloud Storage).

3.  **Usabilidade e UX:**
    * Melhoria nos fluxos de feedback para o usuário.
    * Painel administrativo para gestão de eventos.

4.  **Testes:**
    * Implementação de testes unitários (JUnit) e de integração.

---

## 🚀 Como Rodar o Projeto

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* MySQL Server rodando.
* Maven instalado.

### Passo a Passo

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/EventUp.git](https://github.com/seu-usuario/EventUp.git)
    ```

2.  **Configure o Banco de Dados:**
    * Crie um banco de dados MySQL chamado `eventup_db` (ou ajuste no `application.properties`).
    * Certifique-se de configurar seu usuário e senha no arquivo `src/main/resources/application.properties`.

3.  **Ajuste Importante (SQL):**
    * Para garantir que fotos de perfil funcionem corretamente, execute o seguinte comando no seu banco de dados:
    ```sql
    ALTER TABLE usuario MODIFY foto LONGTEXT;
    ```

4.  **Execute a aplicação:**
    * Abra o projeto no IntelliJ ou via terminal:
    ```bash
    mvn spring-boot:run
    ```

5.  **Acesse:**
    * Abra o navegador em: `http://localhost:8080`

---

## 🤝 Contribuição

Este projeto foi desenvolvido com dedicação e trabalho em equipe. Agradecemos a todos os envolvidos na concepção, documentação e desenvolvimento.

---

Developed 💜 by Equipe EventUp Rillary Lobo, Thaís Vieira, Weslley Rocha

