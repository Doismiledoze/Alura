# Java: criando sua primeira API e conectando ao front

- Crie uma API REST utilizando o Spring Framework
- Entenda a estrutura MVC no desenvolvimento de aplicações Web
- Utilize anotações do Spring para mapear rotas
- Aplique boas práticas com o uso de DTO e outros conceitos
- Conecte os dados do back-end a uma aplicação front-end
- Trate erros de CORS na disponibilização de dados

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Screen Match](https://github.com/Doismiledoze/Alura/tree/main/Java%20Web%20crie%20aplica%C3%A7%C3%B5es%20usando%20Spring%20Boot/Java%20criando%20sua%20primeira%20API%20e%20conectando%20ao%20front/Screen%20Match)
- [Screen Match Frases](https://github.com/Doismiledoze/Alura/tree/main/Java%20Web%20crie%20aplica%C3%A7%C3%B5es%20usando%20Spring%20Boot/Java%20criando%20sua%20primeira%20API%20e%20conectando%20ao%20front/Screen%20Match%20Frases)
- [Screen Match Front](https://github.com/Doismiledoze/Alura/tree/main/Java%20Web%20crie%20aplica%C3%A7%C3%B5es%20usando%20Spring%20Boot/Java%20criando%20sua%20primeira%20API%20e%20conectando%20ao%20front/Front%20Screen%20Match)
- [Screen Match Front - Mão na Massa](https://github.com/Doismiledoze/Alura/tree/main/Java%20Web%20crie%20aplica%C3%A7%C3%B5es%20usando%20Spring%20Boot/Java%20criando%20sua%20primeira%20API%20e%20conectando%20ao%20front/Front%20M%C3%A3o%20na%20Massa)
- [Screen Match Frases Front](https://github.com/Doismiledoze/Alura/tree/main/Java%20Web%20crie%20aplica%C3%A7%C3%B5es%20usando%20Spring%20Boot/Java%20criando%20sua%20primeira%20API%20e%20conectando%20ao%20front/Front%20Screen%20Match%20Frases)

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Transformando a aplicação em API | <ul><li>Conectar o back-end ao front-end. Vimos que o front-end esperava buscar dados de uma url específica, que era localhost:8080, que é onde subimos nosso servidor.</li><li>Configurar uma aplicação web com o Spring Boot. Conhecemos a dependência starter-web do Spring, que baixa várias outras dependências e configura automaticamente um servidor na porta localhost:8080, ou em alguma outra que configuremos na nossa aplicação.</li><li>Organizar um projeto MVC. Aprendemos como estruturar o projeto em várias camadas e como conectá-las.</li><li>Retornar uma informação no navegador. Criamos nosso primeiro controller e nossa primeira rota da API, utilizando anotações como @RestController e @GetMapping.</li></ul>
Fornecendo dados para o front  | <ul><li>Devolver os dados do nosso banco para o navegador. Trabalhamos devolvendo os dados do nosso banco no Controller, devidamente serializados.</li><li>Tratar serialização circular. Vimos os problemas que ocorrem ao tentar serializar entidades mapeadas de forma bidirecional e como resolvê-los.</li><li>Utilizar o padrão DTO. Para evitar a serialização circular e principalmente para seguir boas práticas, criamos nossos DTOs. Assim, nossos dados ficaram mais seguros e foram devolvidos de forma personalizada.</li><li>Lidar com o erro de CORS. Conhecemos o erro entre a comunicação entre rotas de origens diferentes e pudemos tratá-lo, criando a classe CorsConfiguration.</li><li>Configurar o Live Reload. Para que a aplicação não precise ser parada e reinicializada sempre que houver mudanças, usamos o Devtools e mudamos as configurações necessárias no Intellij.</li></ul>
Mapeando a página inicial do Screenmatch | <ul><li>Deixar o código mais limpo e organizado. Vimos que a única responsabilidade de um controlador é tratar da comunicação e das rotas da API. Assim, ele não deve conter regras de negócio. E para fazer essa divisão, criamos uma classe de serviços, a SerieService.</li><li>Utilizar boas práticas de extração de métodos Aplicamos princípios da orientação a objetos, extraindo métodos que eram comuns no código, facilitando a manutenção.</li><li>Criar uma url fixa para o Controller. Usamos o @RequestMapping para que todas as urls mapeadas pelo controlador de séries tenham como prefixo o “/series”.</li><li>Retornar os dados de uma única série. Para buscar uma série, precisamos que seu id seja passado como parâmetro. Conhecemos o @PathVariable, que nos auxilia nesse objetivo.</li></ul>
Detalhando o Screenmatch | <ul><li>Trabalhar de forma colaborativa. Vimos que é importante sempre testar exaustivamente o código, principalmente com registros diferentes. Somente assim temos a confirmação de que nossas buscas estão corretas.</li><li>Passar parâmetros na url. Usamos novamente a anotação @PathVariable e vimos que ela pode ser utilizada tanto com números quanto com strings. Para que ela funcione, basta que passemos o nome do parâmetro entre chaves na url do @GetMapping, exatamente como ele está declarado na função.</li><li>Comparar streams e buscas no banco de dados. Aprendemos que podemos utilizar tanto streams quanto consultas do banco de dados, não precisamos nos restringir ao uso exclusivo de um deles. Basta que analisemos a complexidade das buscas, filtros e operações que faremos.</li><li>Desenvolver uma aplicação de forma incremental. Ao trabalhar na integração do front com o back-end, identificamos, ao longo do tempo, os requisitos necessários para tudo funcionar em conjunto. O trabalho incremental é muito comum no ambiente de desenvolvimento.</li></ul>
Consolidando conhecimentos | <ul><li>Implementação da camada de serviço conectada ao banco de dados.</li><li>Divisão de responsabilidades na aplicação utilizando o padrão MVC (Model-View-Controller).</li><li>Importância de uma arquitetura bem estruturada para facilitar manutenção, legibilidade e escalabilidade do código.</li><li>Necessidade de configurar o CORS para permitir o acesso de front-ends externos à API.</li><li>Compreensão dos desafios relacionados à segurança e permissões de acesso em aplicações web.</li><li>Entendimento do papel dos DTOs na transferência de dados entre diferentes camadas da aplicação.</li><li>Série e episódio dedicados ao uso e benefícios dos DTOs.</li><li>Criação de aplicações web a partir de uma aplicação terminal.</li><li>Disponibilização do front-end, integração com back-end e mapeamento de rotas e endpoints necessários.</li><li>Planejamento e projeção para atender às expectativas do front-end em relação aos dados e funcionalidade.</li><li>Evolução de uma aplicação de terminal para uma aplicação web funcional.</li><li>Consolidação da base necessária para criar aplicações web e aprofundar os conhecimentos em desenvolvimento full-stack.</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

## Links Úteis

[Voltar à Navegação](#navegação)

- [Curso HTTP: entendendo a web por baixo dos panos](https://cursos.alura.com.br/course/http-entendendo-web-por-baixo-dos-panos)
- [O que é CORS e como resolver um erro de Cross-Origin Resource Sharing (CORS)?](https://www.alura.com.br/artigos/como-resolver-erro-de-cross-origin-resource-sharing)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)