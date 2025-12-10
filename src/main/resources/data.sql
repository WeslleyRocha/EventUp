INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (01, 'Música');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (02, 'Tecnologia');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (03, 'Cultura');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (04, 'Esportes');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (05, 'Online');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (06, 'Educação');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (07, 'Gastronomia');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (08, 'Viagens');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (09, 'Games');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (10, 'Arte');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (11, 'Pets');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (12, 'Negócios');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (13, 'Inovação');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (14, 'Saúde');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (15, 'Decoração');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (16, 'Fotografia');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (17, 'Outros');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (18, 'Meio Ambiente');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (19, 'Automóveis');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (20, 'Bem-estar');
INSERT IGNORE INTO categorias (id_categoria, nome_categoria) VALUES (21, 'Filmes e Séries');

INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES (1, 'Lucas', 'Mendes', '1990-05-15', 'lucas.mendes@exemplo.com.br', 'Bygefy', '(11) 98765-4321', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-gratis/homem-afro-americano-com-camiseta-branca_273609-14647.jpg', 'Aventureiro e amante da natureza, sempre em busca da próxima trilha ou acampamento. Fotografia é seu hobby e adora registrar paisagens.', 'São Paulo', 'Masculino','SP') ;
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES (2, 'Isabela', 'Costa', '1992-08-22', 'isabela.costa@exemplo.com.br', 'Buuift', '(21) 99876-5432', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-gratis/retrato-de-uma-mulher-loira-com-cabelo-encaracolado-mostrando-um-gesto-de-paz-em-uma-camiseta-verde-e-olhando-confiante-para-a-frente_176474-112443.jpg?semt=ais_se_enriched&w=740&q=80', 'Apaixonada por livros e café. Adora passar as tardes em livrarias e discutir filosofia. Escritora nas horas vagas, sonha em publicar um romance.', 'Rio de Janeiro', 'Feminino','RJ') ;
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES (3, 'Pedro', 'Almeida', '1985-03-10', 'pedro.almeida@exemplo.com.br', 'BGFytwqr', '(31) 97654-3210', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-gratis/homem-de-meia-idade-com-cabelos-grisalhos-na-camisa-de-cor-escura-olhando-para-a-camera-sendo-descontente-fazendo-boca-torta-cruzando-as-maos-no-peito-ofendido-em-pe-sobre-fundo-azul_141793-133734.jpg?semt=ais_hybrid&w=740&q=80', 'Desenvolvedor apaixonado por tecnologia e inovação. Gosta de programar projetos open-source e participar de hackathons. Gamer nas horas de folga.', 'Belo Horizonte', 'Masculino','MG') ;
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES (4, 'Sofia', 'Martins', '1998-11-01', 'sofia.martins@exemplo.com.br', 'Bygvtrere', '(41) 96543-2109', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-gratis/retrato-em-close-de-uma-jovem-atraente-isolada_273609-35720.jpg?semt=ais_hybrid&w=740&q=80', 'Estudante de moda e influenciadora digital. Adora criar looks, viajar e experimentar novas culturas. Defende a sustentabilidade no vestuário.', 'Curitiba', 'Feminino','PR');
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES (5, 'Carlos', 'Pereira', '1978-01-29', 'carlos.pereira@exemplo.com.br', 'VTyfwe8o', '(51) 95432-1098', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-gratis/jovem-caucasiano-sorridente-vestindo-uma-camisa-verde-mostrando-um-gesto-de-paz-em-um-fundo-verde-isolado_141793-38585.jpg?semt=ais_se_enriched&w=740&q=80', 'Cozinheiro de mão cheia e apreciador de vinhos. Sonha em abrir seu próprio bistrô. Adora receber amigos para jantares e criar novos pratos.', 'Porto Alegre', 'Masculino','RS');
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES (6, 'Ana', 'Ribeiro', '1995-07-03', 'ana.ribeiro@exemplo.com.br', 'Vufer8og', '(61) 94321-0987', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-gratis/linda-mulher-morena-feliz-encaracolada-em-branco_176420-39925.jpg?semt=ais_se_enriched&w=740&q=80', 'Professora de educação física e atleta amadora. Ama esportes ao ar livre, principalmente corrida e ciclismo. Motiva seus alunos a ter uma vida saudável.', 'Brasília', 'Feminino','DF');
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES (7, 'Felipe', 'Gomes', '1980-04-12', 'felipe.gomes@exemplo.com.br', 'BYg9o4y', '(71) 93210-9876', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-gratis/retrato-de-um-homem-africano-casual-feliz-olhando_171337-7358.jpg?semt=ais_se_enriched&w=740&q=80', 'Músico e produtor cultural. Toca violão e piano, e adora explorar novos ritmos. Promove eventos artísticos locais e valoriza a cultura nordestina.', 'Salvador', 'Masculino','BA');
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES (8, 'Laura', 'Santana', '2000-09-18', 'laura.santana@exemplo.com.br', 'HBcqwr3t', '(81) 92109-8765', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-gratis/retrato-de-um-homem-africano-casual-feliz-olhando_171337-7358.jpg?semt=ais_se_enriched&w=740&q=80', 'Estudante de veterinária e defensora dos animais. Voluntária em abrigos e sonha em abrir sua própria clínica. Ama todos os tipos de pets.', 'Recife', 'Feminino','BA');
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES (9, 'Gustavo', 'Nunes', '1987-02-25', 'gustavo.nunes@exemplo.com.br', 'BuwfT7QR', '(85) 91098-7654', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-gratis/atrativo-mestico-com-sorriso-positivo-mostra-dentes-brancos-mantem-as-maos-na-barriga-estando-em-alto-astral-veste-camisa-branca-alegra-momentos-positivos-na-vida-conceito-de-pessoas-e-emocoes_273609-15527.jpg?semt=ais_se_enriched&w=740&q=80', 'Arquiteto e urbanista com foco em construções sustentáveis. Acredita que a boa arquitetura pode transformar vidas. Adora viajar para conhecer novas cidades.', 'Fortaleza', 'Masculino','CE') ;
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade,genero, estado) VALUES(10, 'Julia', 'Dias', '1993-06-07', 'julia.dias@exemplo.com.br', 'GFTeuwt', '(92) 90987-6543', CURRENT_TIMESTAMP, 'https://img.freepik.com/fotos-premium/jovem-filipina-com-longos-cabelos-negros-em-estudio-sorrindo-confiante-com-bracos-cruzados_1187-408585.jpg?semt=ais_se_enriched&w=740&q=80', 'Jornalista investigativa e entusiasta de podcasts. Busca a verdade e ama contar histórias. Adora documentários e um bom mistério para resolver.', 'Manaus', 'Feminino','AM');
INSERT IGNORE INTO Usuario (id_usuario, nome, sobrenome, data_nascimento, email, senha, telefone, data_criacao, foto, bio, cidade, genero,estado) VALUES (11, 'Pedro', 'Sampaio', '1990-01-01', 'teste@teste.com', '123456', '(99) 99999-9999', CURRENT_TIMESTAMP, 'https://s2-gq.glbimg.com/nc5xb-GXsfh5yWgiQ9dyj9vJ_vQ=/0x0:1440x1795/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_71a8fe14ac6d40bd993eb59f7203fe6f/internal_photos/bs/2024/R/B/cyGy9BSXuaKzBxOKxbZQ/pedrosampaio-1725140988-3447054910921476033-200231439.jpg', 'PE-DRO-SAM-PA-IO! 🗣️🔊 DJ, produtor e cantor que mistura funk, pop e eletrônico como ninguém. O dono dos hits virais e da energia que não deixa ninguém parado.', 'Rio de Janeiro', 'Masculino', 'RJ');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim,restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento)
VALUES (1, 'Festival de Rock Indie', 'As melhores bandas da cena indie nacional e internacional.', '2025-11-15 14:00:00', '2025-11-15 23:00:00', 18, 'https://rollingstone.com.br/wp-content/uploads/2024/09/rockfestivalnovaiguacu_1726338706_3457102091854092099_58237951751.jpg', false, 150.00, 'Arena de Shows', false, 1, 1,'76287-383','Rua Jorginho peão', 38,'Casa');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim, restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento)
VALUES (2, 'Conferência de IA e Futuro', 'Palestras com especialistas em Machine Learning, Ética em IA e tendências do setor.', '2025-12-05 09:00:00', '2025-12-06 18:00:00', 16, 'https://media-manager.noticiasaominuto.com.br/960/naom_676d8d87982ac.webp', false, 499.90, 'Centro de Convenções Tech', false, 2, 2,'01046-010','Avenida da Ciência', 1200,'Auditório Principal');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim, restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento, info_estacionamento, info_transporte_publico, info_acessibilidade )
VALUES (3, 'Feira de Artesanato Local', 'Exposição, venda e oficinas rápidas de artesãos locais. Valorize o pequeno produtor.', '2025-10-12 10:00:00', '2025-10-12 18:00:00', 0, 'https://prefeitura.rio/wp-content/uploads/2021/10/WhatsApp-Image-2021-10-23-at-17.06.39.jpeg', true, 0.00, 'Praça Central', false, 3, 3,'80010-000','Praça das Artes', 100,'Ao lado do coreto','Sim - R$40','Sim - Ponto de tranporte da praça central','Nao');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim, restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento)
VALUES (4, 'Webinar: Marketing Digital', 'Aprenda as últimas tendências e ferramentas para alavancar seu negócio nas mídias sociais.', '2025-09-20 19:30:00', '2025-09-20 21:00:00', 10, 'https://static.dinamize.com.br/dinamizeszmsdg3x/uploads/2024/06/webinar-como-o-que-e-e-como-criar.png', true, 0.00, 'Plataforma Zoom', true, 12, 4,'99999-999','N/A', 0,'N/A');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim, restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento)
VALUES (5, 'Campeonato de E-Sports (LoL)', 'Grande final do torneio regional de League of Legends. Transmissão ao vivo.', '2025-11-01 18:00:00', '2025-11-01 23:59:00', 12, 'https://fastcompanybrasil.com/wp-content/uploads/2023/10/campeonato-de-LoL.jpg', false, 35.00, 'Twitch/Youtube', true, 9, 5,'99999-999','N/A', 0,'N/A');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim,restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento)
VALUES (6, 'Trilha Ecológica Cânion', 'Caminhada guiada por trilha de nível moderado. Requer atestado médico.', '2025-10-27 08:00:00', '2025-10-27 16:00:00', 10, 'https://epulari.cdn.magazord.com.br/img/2022/07/blog/9153/1/destaques-inferiores/blog-como-se-preparar-para-fazer-trilha-capa.png', false, 80.00, 'Parque Estadual da Serra', false, 14, 6,'12940-000','Estrada do Cânion', 500,'Ponto de Encontro');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim, restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento)
VALUES (7, 'Degustação de Vinhos Finos', 'Noite de degustação com 5 rótulos de vinhos importados, orientada por um sommelier.', '2025-12-10 20:00:00', '2025-12-10 22:30:00', 18, 'https://www.viavini.com.br/blog-de-vinhos/wp-content/uploads/2020/01/comprar-vinhos-para-grandes-eventos-1200x900.jpg', false, 250.00, 'Wine Bar Central', false, 7, 7,'22010-000','Rua do Sabor', 100,'Fundos');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim, restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento)
VALUES (8, 'Curso de Fotografia Básica', 'Curso online e interativo, focado em composição, luz e edição pelo celular.', '2025-11-08 10:00:00', '2025-11-08 17:00:00', 14, 'https://blog.picsize.com.br/wp-content/uploads/2019/07/Curso-de-Fotografia-1.jpg', false, 99.90, 'Plataforma EAD', true, 16, 8,'99999-999','N/A', 0,'N/A');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim, restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento, info_estacionamento, info_transporte_publico, info_acessibilidade)
VALUES (9, 'Lançamento de Livro de Poesia', 'Sessão de autógrafos e leitura de poemas do livro "Versos Esquecidos" do autor João Silva.', '2025-10-05 16:00:00', '2025-10-05 18:00:00', 0, 'https://areademulher.r7.com/wp-content/uploads/2020/05/livros-de-romance-12-livros-de-romance-que-voce-deve-ler.jpg', true, 0.00, 'Livraria Cultura', false, 3, 9,'70070-700','Setor de Livros', 50,'Mezanino','Não','Sim - Ponto de transporte pubico na frente da livraria','Sim  - intérprete de libras, tradutor');

INSERT IGNORE INTO Eventos (id_evento, nome_evento, descricao_detalhada, data_hora_inicio, data_hora_fim, restricao_idade, url_imagem_destaque, gratuito, valor_ingresso, local_evento, evento_online, id_categoria, id_usuario_criador,CEP, endereco,numero, complemento )
VALUES (10, 'Maratona da Cidade (42km)', 'A 35ª edição da Maratona de São Paulo. Largada e chegada no Parque Ibirapuera.', '2025-12-01 06:00:00', '2025-12-01 13:00:00', 18, 'https://sportlife.com.br/wp-content/uploads/2022/01/primeira-maratona-1.jpg', false, 120.00, 'Parque Ibirapuera', false, 4, 10,'04001-001','Avenida Pedro Álvares Cabral', 200,'Portão 10');

INSERT IGNORE INTO quero_ir (id_usuario, id_evento) VALUES
-- Usuário 1 (em todos os eventos)
(1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (1, 6), (1, 7), (1, 8), (1, 9), (1, 10), (1, 11),
-- Usuário 2
(2, 1), (2, 2), (2, 3), (2, 4), (2, 5), (2, 6), (2, 7), (2, 8), (2, 9), (2, 10), (2, 11),
-- Usuário 3
(3, 1), (3, 2), (3, 3), (3, 4), (3, 5), (3, 6), (3, 7), (3, 8), (3, 9), (3, 10), (3, 11),
-- Usuário 4
(4, 1), (4, 2), (4, 3), (4, 4), (4, 5), (4, 6), (4, 7), (4, 8), (4, 9), (4, 10), (4, 11),
-- Usuário 5
(5, 1), (5, 2), (5, 3), (5, 4), (5, 5), (5, 6), (5, 7), (5, 8), (5, 9), (5, 10), (5, 11),
-- Usuário 6
(6, 1), (6, 2), (6, 3), (6, 4), (6, 5), (6, 6), (6, 7), (6, 8), (6, 9), (6, 10), (6, 11),
-- Usuário 7
(7, 1), (7, 2), (7, 3), (7, 4), (7, 5), (7, 6), (7, 7), (7, 8), (7, 9), (7, 10), (7, 11),
-- Usuário 8
(8, 1), (8, 2), (8, 3), (8, 4), (8, 5), (8, 6), (8, 7), (8, 8), (8, 9), (8, 10), (8, 11),
-- Usuário 9
(9, 1), (9, 2), (9, 3), (9, 4), (9, 5), (9, 6), (9, 7), (9, 8), (9, 9), (9, 10), (9, 11),
-- Usuário 10
(10, 1), (10, 2), (10, 3), (10, 4), (10, 5), (10, 6), (10, 7), (10, 8), (10, 9), (10, 10), (10, 11);