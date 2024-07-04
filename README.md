# Descrição do Sistema

## Aviso

Este é um projeto da disciplina de engenharia de software 1 do qual eu e meus colegas desenvolvemos um site de gestão de projetos com backend (Spring boot), frontend (HTML, CSS e JavaScript) e banco de dados (MariaDB). Como este é um fork do projeto original, para ver mais informações sobre os outros membros do grupo acesse o link acima junto ao nome do projeto.

## Sobre a Minha Participação nesse Projeto

Nesse projeto eu atuei na parte do backend e fui responsável por desenvolver o diagrama do banco de dados utilizado. Esse projeto foi o meu primeiro contato com Spring boot, já tinha experiência com a linguagem de programação Java, mas tive que aprender do zero como funciona o Spring boot. Neste projeto, fui responsável pela:

- Criação das classes entities que representam as tabelas do banco de dados.
  
- Criação das conexões entre as classes entities conforme o banco de dados.
  
- Criação das classes controller, que apresentam os caminhos URL utilizando o padrão REST para a realização de cada ação dentro do backend, e que foram essenciais para a conexão do banco de dados e do backend com o frontend.
  
- Criação das classes service, que são classes que contém as funcionalidades dos controllers, deixando assim as classes controllers mais simples e fáceis de entender.

- Criação das classes repository, que são classes que realizam a conexão com o Spring para o uso de determinadas funções, que foram usadas nas classes service.

## Chain: Sistema de Gerenciamento de Projetos

O Chain é uma plataforma completa projetada para otimizar a gestão de projetos e equipes de desenvolvimento de software. Inspirado na ideia de conectar pessoas como elos de uma corrente, o Chain oferece uma experiência intuitiva e eficiente para colaboração e organização.

## Recursos Principais

- Página Inicial Atraente: Uma interface visualmente atraente dá as boas-vindas aos usuários, destacando a proposta do sistema e oferecendo fácil acesso à tela de login.

- Autenticação Segura: Com o Chain, os usuários podem criar uma conta ou fazer login de forma segura, garantindo acesso personalizado às funcionalidades do sistema.

- Perfil do Usuário: Após o login, os usuários são redirecionados para sua página de perfil, onde podem visualizar e acessar facilmente o calendário de atividades e os projetos aos quais estão vinculados. Além disso, eles têm a opção de criar novos projetos conforme necessário.

-  Gestão de Projetos Eficiente: Como administrador ou criador de projeto, os usuários têm a capacidade de convidar membros da equipe, atribuir atividades com datas de início e término e designar responsáveis por cada tarefa. Isso promove uma gestão eficaz do progresso do projeto e da distribuição de tarefas.

- Organização de Links e Comentários: O Chain oferece uma lista dedicada para adicionar links relevantes ao projeto, permitindo que os membros da equipe compartilhem recursos importantes e comentários sobre eles. Essa funcionalidade melhora a colaboração e a comunicação dentro do projeto.

- Comentários no Calendário: Os usuários podem adicionar comentários diretamente ao calendário, fornecendo informações contextuais adicionais sobre atividades específicas ou eventos importantes. Isso facilita a comunicação e o acompanhamento do progresso do projeto.

- LogOut Seguro: Para garantir a privacidade e segurança dos usuários, o Chain oferece uma opção de logout fácil de usar na tela de perfil, permitindo que os usuários encerrem sua sessão quando desejarem.

O Chain é uma solução abrangente para organizar, criar e gerenciar projetos de forma eficiente, proporcionando uma colaboração harmoniosa entre os membros da equipe. Com sua interface amigável e recursos poderosos, o Chain eleva a produtividade e o sucesso dos projetos de desenvolvimento de software.
# Diagrama de Casos de Uso

<p align="center">
<img src="imagens/DiagramaDeCasoDeUso.png" width="500px" />
</p>

# Diagrama de Classes do Sistema

<p align="center">
<img src="imagens/DiagramaUML.png" width="500px" />
</p>

# Modelo Relacional 

<p align="center">
<img src="brModelo/Modelo_Conceitual.png" width="500px" />
</p>

# HomePage

<p align="center">
<img src="imagens/HomePage.png" width="500px" />
</p>

# Perfil

<p align="center">
<img src="imagens/Perfil.png" width="500px" />
</p>

# Projeto

<p align="center">
<img src="imagens/Projeto.png" width="500px" />
</p>

