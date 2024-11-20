# Java: persistência de dados e consultas com Spring Data JPA

- Aprenda a utilizar os repositórios do Spring Data JPA
- Entenda como mapear classes para o banco de dados com ORM
- Modele corretamente os relacionamentos entre entidades
- Conheça as diversas formas consultar o banco em uma aplicação Java
- Utilize variáveis de ambiente para deixar seu código mais seguro
- Integre sua aplicação com a API do ChatGPT

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Screen Match](https://github.com/Doismiledoze/Alura/tree/main/Java%20Web%20crie%20aplica%C3%A7%C3%B5es%20usando%20Spring%20Boot/Java%20persist%C3%AAncia%20de%20dados%20e%20consultas%20com%20Spring%20Data%20JPA/Screen%20Match)
- [Screen Sound](https://github.com/Doismiledoze/Alura/tree/main/Java%20Web%20crie%20aplica%C3%A7%C3%B5es%20usando%20Spring%20Boot/Java%20persist%C3%AAncia%20de%20dados%20e%20consultas%20com%20Spring%20Data%20JPA/Screen%20Sound)

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Evoluindo o projeto ScreenMatch | <ul><li>Buscar várias séries na API. Criamos um loop que encerra somente quando o usuário escolhe sair do menu, sendo capaz de buscar várias séries na API sem parar.</li><li>Métodos privados. Vimos que, se apenas uma classe irá acessar um método, não precisamos deixá-lo público, podemos declará-lo como privado. Isso é essencial para o encapsulamento das nossas classes.</li><li>Adicionar mais informações aos dados buscados. Revisamos como realizar o mapeamento entre atributos da API e atributos da nossa record.</li><li>Converter os dados que vêm da API para a sua própria classe. Criamos nossa própria classe Serie para representar melhor nossos dados. Para isso, foi necessário utilizar vários métodos de conversão.</li><li>Utilizar um “if reduzido”. Utilizamos a classe OptionalDouble para lidar com valores decimais e seus possíveis erros, utilizando os métodos of e orElse, que lembram muito o código de um if reduzido, e são muito úteis para evitar que ocorram Exceptions.</li><li>Criar um Enum. Percebemos que seria excelente poder categorizar nossas séries por gênero. Criamos um enum para isso, e vimos como criar métodos personalizados em enums.</li><li>Consumir a API do ChatGPT. Utilizamos a API do ChatGPT para traduzir nossos dados, adicionamos todas as dependências necessárias e configuramos a classe de consumo.</li></ul>
Persistindo os dados da série | <ul><li>Configurar seu ambiente Postgres. Fizemos a instalação desse banco de dados relacional e vimos a diferença entre bancos relacionais e outros tipos de bancos de dados, além de criar nosso banco de séries no Postgres.</li><li>Preparar sua aplicação para trabalhar com banco de dados. Adicionamos a dependência da JPA ao pom.xml e as configurações do banco de dados no application.properties.</li><li>Utilizar anotações do Hibernate para mapear suas entidades. Usamos anotações como @Entity, @Transient e @Column na classe Serie, indicando como seriam as configurações da tabela correspondente no banco de dados.</li><li>Manipular interfaces do tipo Repository. Para fazer operações básicas no banco de dados, como um CRUD, precisamos de uma interface do tipo Repository com o nosso tipo de dados. No nosso caso, criamos a SerieRepository.</li><li>Injetar dependências. Vimos que não podemos instanciar uma interface do tipo Repository em qualquer lugar. Elas precisam ser declaradas em classes gerenciadas pelo Spring, precedidas de um @Autowired, indicando que está sendo realizada uma injeção de dependências.</li><li>Trabalhar com variáveis de ambiente. Utilizamos variáveis de ambiente para proteger dados sensíveis da conexão com o banco de dados e com a API.</li></ul>
Mapeando relacionamentos | <ul><li>Mapear relacionamentos entre entidades da JPA. Conhecemos o uso das anotações @OneToMany e @ManyToOne para identificar o relacionamento ”um para muitos” de séries e episódios.</li><li>Conhecer diversos tipos de relacionamento: Identificamos qual era o relacionamento presente na nossa aplicação, além de ter conhecimento dos vários tipos de relacionamento em banco de dados.</li><li>Associar chaves estrangeiras. Entendemos o conceito de chave estrangeira, que é como o banco de dados identifica e configura relacionamentos.</li><li>Trabalhar com os tipos de Cascade. Como o nosso fluxo de salvamento de dados era salvar séries e depois episódios, foi preciso configurar isso utilizando o atributo Cascade.</li><li>Identificar como os dados são carregados. Trabalhamos também com o atributo fetch, que fala sobre carregar os dados de forma “preguiçosa” (lazy) ou “ansiosa” (eager).</li><li>Configurar relacionamentos bidirecionais. Vimos a importância de relacionamentos bidirecionais e deixamos as modificações aparecendo dos dois lados da relação, fazendo tanto setEpisodios() na Série quanto setSerie() nos Episodios.</li></ul>
Buscando informações do banco | <ul><li>Criar queries derivadas com a JPA. Conhecemos o recurso padrão da JPA para fazer buscas utilizando palavras-chave em métodos na classe Repository.</li><li>Comparar streams e buscas no banco de dados. Percebemos as mudanças em utilizar streams e as derived queries na nossa aplicação.</li><li>Conhecer diversas palavras-chave para criar seus métodos. Aprofundamos nas palavras-chave e em como utilizá-las, reforçando a prática.</li><li>Discutir os vários tipos de retorno ao realizar as buscas. Conversamos sobre as diferenças entre retornar uma série, uma lista de séries ou um Optional de séries.</li><li>Ler dados dinamicamente e armazenar em um Enum. Vimos como fazer a correspondência entre o que está sendo digitado e um campo no enum.</li></ul>
Utilizando a linguagem de consulta da JPA | <ul><li>Diferenciar os tipos de consulta da JPA. Vimos que podemos trabalhar com derived queries, com queries nativas usando o nativequery e a JPQL, que é a linguagem de buscas da JPA.</li><li>Criar métodos totalmente personalizados e mais legíveis. Vimos que utilizar a JPQL pode auxiliar na escrita de métodos mais legíveis. Para isso, basta escrever o nome do método e anotá-lo com @Query.</li><li>Aprofundar em linguagem SQL. Conhecemos várias expressões utilizadas em SQL, como LIKE, ORDER e LIMIT.</li><li>Recuperar informações secundárias. Conseguimos buscar informações relacionadas a episódios a partir da série, utilizando o recurso das junções (JOIN).</li><li>Comparar recursos SQL e Java. Percebemos que, assim como o Java tem uma API de datas, o SQL também tem sua forma de lidar com datas. No nosso caso, utilizamos a função YEAR do SQL.</li></ul>
Consolidando conhecimentos | <ul><li>Mapeamento da classe Série com JPA: Utilização de várias anotações do JPA para mapear a classe.</li><li>Mapeamento de Enum: Como mapear um enum em JPA, destacando a diferença de processo e as anotações necessárias.</li><li>Uso da API do ChatGPT: Integração da API do ChatGPT para realizar a tradução da sinopse.</li><li>Métodos Estáticos: Estudo sobre a aplicação e uso de métodos estáticos.</li><li>Relacionamento entre Episódios e Séries: Mapeamento do relacionamento entre essas duas entidades no banco de dados (Postgres).</li><li>Manipulação de Dados com Repository: Criação de uma classe Repository que herda de JpaRepository para manipular os dados.</li><li>Consultas com Derived Queries e JPQL: Utilização de consultas derivadas e JPQL, além da anotação @Query para construir métodos de consulta eficientes.</li><li>Aprofundamento em Java e JPA: Aprendizado avançado sobre Java, JPA e integração com APIs.</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

## Links Úteis

[Voltar à Navegação](#navegação)

- [OpenAI](https://openai.com/)
- [MyMemory](https://mymemory.translated.net/doc/spec.php)
- [Documentação MyMemory](https://mymemory.translated.net/doc/usagelimits.php)
- [Postgres](https://www.postgresql.org/download/)
- [Documentação Hibernate](https://hibernate.org/orm/documentation/6.3/)
- [Documentação de anotações do Hibernate](https://docs.jboss.org/hibernate/stable/annotations/reference/en/html/)
- [Como configurar variáveis de ambiente no Windows, Linux e macOS](https://www.alura.com.br/artigos/configurar-variaveis-ambiente-windows-linux-macos)
- [Documentação da Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- [Join e seus tipos](https://www.alura.com.br/artigos/join-e-seus-tipos)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)
