# Power BI: DAX contextos e iteração

- Aprenda como criar colunas calculadas e medidas
- Entenda como lidar com erros no DAX
- Reconheça quando deve utilizar uma coluna calculada ou medida
- Compreenda o conceito de agregação
- Conheça o contexto de filtro e de linha
- Compreenda as funções iteradoras no DAX
- Aprenda a utilizar variáveis

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Entendendo as Formulas DAX]()
- [Entendendo as Formulas DAX - Exercícios Extras]()

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Conhecendo o projeto | <ul><li>Conectar a um arquivo CSV;</li><li>Entender a base de dados.</li></ul>
Linguagem DAX | <ul><li>Entender o conceito por trás do DAX;</li><li>Compreender os conceitos;</li><li>Criar Colunas calculadas e medidas.</li></ul>
Colunas calculadas e medidas | <ul><li>Compreender os conceitos e as diferenças entre colunas calculadas e medidas;</li><li>Quando utilizar uma coluna calculada ou uma medida;</li><li>Criar colunas calculadas e medidas no Power BI.</li></ul>
Iteradores | <ul><li>Compreender e utilizar variáveis;</li><li>Utilizar iteradores para criar medidas.</li></ul>
Contextos no DAX | <ul><li>Identificar e tratar erros no DAX;</li><li>Utilizar funções para converter tipo de dados;</li><li>Utilizar funções para valores em branco, como BLANK.</li></ul>
Categorizando dados | <ul><li>Utilizar funções lógicas, como IF e SWITCH.</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

1. <strong>Paulo precisou criar uma nova coluna na tabela registro_vendas, pois queria adicionar a palavra capital ao lado da cidade de entrega. Para isso ele tentou a sintaxe:</strong><br>

    ```text
        Data nova = 'registro_vendas'[Cidade_Entrega] + SP
    ```

    Porém, obteve um erro como retorno. Por que esse erro aconteceu e como ele pode construir essa coluna de forma correta?

2. <strong>Crie uma classificação para o preço de custo de cada livro. Se ele é abaixo de R$30,00 classifique como "custo baixo". Se custar mais que R$30,00 classifique como "custo alto".</strong><br>

3. <strong>Acrescente agora uma classificação intermediária, com o nome de "preço médio". Essa classificação agora deve funcionar com os seguintes parâmetros:<br>
Preço de custo menor do que R$30,00 como "preço baixo",<br> entre R$30,00 e R$40,00 como preço médio,<br> e maior ou igual a R$40,00 como preço alto.</strong>

4. <strong>Queremos saber agora qual é o faturamento mínimo. Para isso, é necessário criar uma medida que utiliza uma função iteradora. Como podemos fazer?</strong>


## Links Úteis

[Voltar à Navegação](#navegação)

- [Power BI: aplicando DAX ao negócio](https://cursos.alura.com.br/course/power-bi-aplicando-dax-negocio)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
------------|-----------|--------
The Definitive Guide to DAX|Este livro é um guia completo e definitivo sobre a linguagem DAX para Power BI, Analysis Services e Power Pivot no Excel. O livro auxilia no desenvolvimento de habilidades necessárias para dominar a programação em DAX, oferecendo exemplos práticos, além de um aprofundamento teórico.|[ACESSAR](https://www.google.com.br/books/edition/The_Definitive_Guide_to_DAX/ZvSfDwAAQBAJ?hl=pt-BR&gbpv=0)
Microsoft Learn DAX|Site da Microsoft com um conjunto de textos e tutoriais sobre a linguagem DAX (Data Analysis Expressions) de maneira gratuita. Os tutoriais são estruturados em módulos que visam, de maneira prática e progressiva, aprimorar os conhecimentos do usuário nas diversas funcionalidades do DAX.|[ACESSAR](https://learn.microsoft.com/pt-br/dax/)
Business Intelligence: Implantação e Gestão de Ambientes OLAP|Este livro da Casa do Código apresenta de maneira clara e direta os principais conceitos de Business Intelligence, assim como a implantação e gestão de ambientes OLAP. Um excelente recurso para quem deseja se aprofundar nesta área, seja você um profissional de TI ou gestor.|[ACESSAR](https://www.casadocodigo.com.br/products/livro-business-intelligence)