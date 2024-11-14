# Power BI: aprofundando na linguagem DAX

- Aprenda como criar colunas calculadas e medidas
- Entenda como o contexto é afetado pelos filtros
- Crie medida com a função CALCULATE
- Combinar a função CALCULATE para obter medidas elaboradas
- Entenda como a função CALCULATE sobrescreve ou agrega com outros filtros

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Power BI aprofundando na linguagem DAX](https://github.com/Doismiledoze/Alura/blob/main/Power%20BI/Power%20BI%20aprofundando%20na%20linguagem%20DAX/Power%20BI%20aprofundando%20na%20linguagem%20DAX.pbix)
- [Power BI aprofundando na linguagem DAX - Desafios](https://github.com/Doismiledoze/Alura/blob/main/Power%20BI/Power%20BI%20aprofundando%20na%20linguagem%20DAX/Power%20BI%20aprofundando%20na%20linguagem%20DAX%20-%20Desafios.pbix)

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Funções básicas de tabela | <ul><li>Carregar a base de dados no PowerBI;</li><li>Criar um relacionamento entre as tabelas;</li><li>Conhecer nossos dados;</li><li>Criar uma coluna calculada (RELATED);</li><li>Calcular o número de vendas combinando funções DAX (VAR, FILTER e COUNTROWS).</li></ul>
Combinando funções | <ul><li>Utilizar funções iteradoras para criar medidas;</li><li>Mudar o contexto da medida utilizando a função ALL;</li><li>Alterando o contexto com a visualização.</li></ul>
Função calculate | <ul><li>Aplicar a função CALCULATE;</li><li>Combinar a função CALCULATE com a FILTER e a ALL;</li><li>Entender como a mudança de contexto afeta o resultado da CALCULATE.</li></ul>
Transformando contexto com calculate | <ul><li>Combinar o CALCULATE com outras funções DAX;</li><li>Entender como o contexto afeta e é afetado na função CALCULATE;</li><li>Utilizar KeepFilter e o operador IN.</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)
 <details>
 <summary>Transformando contexto com calculate</summary>

1. Explique o funcionamento da função RELATED e qual a vantagem de utilizar em uma coluna calculada.

```text
A função RELATED no DAX (Data Analysis Expressions) do Power BI estabelece uma relação entre tabelas. Quando aplicada a uma coluna calculada, como em uma tabela relacionada, ela recupera valores da tabela relacionada com base em uma correspondência na coluna relacionada. A vantagem é a simplificação de cálculos, permitindo acesso fácil a dados relacionados sem a necessidade de mesclar tabelas. Isso melhora o desempenho e a legibilidade do código, facilitando a criação de medidas e análises mais eficientes e intuitivas. Além disso, essa nova coluna criada com RELATED fica disponível na visualização e também pode ser utilizada para criar métricas, medidas e outras colunas calculadas.
```

2. O que é filtro de contexto do Power BI? Explique seus tipos e cite exemplos de aplicação.

```text
O termo "filtro de contexto" no contexto do Power BI e de fórmulas DAX (Data Analysis Expressions) refere-se aos filtros que são automaticamente aplicados a uma fórmula com base no contexto em que ela está sendo avaliada.
Existem dois tipos principais de filtros de contexto:

a) Filtro de Linha (Row Context): ocorre ao avaliar a fórmula em um nível de linha específico, como uma linha em uma tabela. Operações são realizadas individualmente para cada linha, levando em consideração as condições dessa linha.

b) Filtro de Coluna (Filter Context): ocorre ao avaliar a fórmula em um conjunto de dados ou em uma coluna específica. Operações são realizadas considerando as condições aplicadas às colunas relevantes. Por exemplo, ao somar valores em uma coluna, o filtro de coluna define quais linhas devem ser incluídas na soma.

Podemos citar esse exemplo:

Suponha que você tenha uma tabela chamada "Vendas" com colunas "Produto", "Quantidade" e "Ano". Se você criar uma medida para calcular a soma da quantidade de vendas, a fórmula estará sujeita a filtros de contexto. Se você estiver visualizando os dados para o ano de 2023, apenas as vendas desse ano contribuirão para a soma. Nesse caso, o "Ano" atua como um filtro de contexto.

    SomaQuantidade = SUM('Vendas'[Quantidade])

O filtro de contexto é fundamental para garantir que as análises reflitam as condições específicas em que os dados estão sendo visualizados ou analisados. A função CALCULATE é frequentemente utilizada para modificar ou substituir esses filtros de contexto, permitindo maior flexibilidade e controle sobre as operações realizadas nas fórmulas DAX.
```

3. Explique o funcionamento da função CALCULATE(\<expressão\>, \<filtros\>), se possível cite em um contexto de negócio.

```text
A função CALCULATE no Power BI é utilizada para modificar ou substituir o filtro de contexto aplicado a uma expressão. Sua sintaxe básica é CALCULATE(<expressão>, <filtros>), onde <expressão> é a medida ou cálculo que você deseja avaliar, e <filtros> são as condições que modificam o contexto de avaliação.

Em um contexto de negócios, imagine que você tem uma tabela de vendas com informações sobre produtos e regiões. Ao calcular a receita total, você pode usar CALCULATE para ajustar o filtro de contexto, considerando apenas as vendas de um produto específico ou de uma região específica. Isso oferece flexibilidade na análise, permitindo focar em segmentos específicos de dados para tomadas de decisão mais precisas.
```

 </details>

## Links Úteis

[Voltar à Navegação](#navegação)

- [Documentação função ISBLANK](https://learn.microsoft.com/pt-br/dax/isblank-function-dax)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
------------|-----------|--------
The Definitive Guide to DAX | "The Definitive Guide to DAX" é uma referência essencial para qualquer desenvolvedor que trabalhe com Power BI, PowerPivot, ou SQL Server Analysis Services (SSAS). Nestas plataformas, DAX é a linguagem principal para criar modelos de negócios mais eficazes, capazes de analisar qualquer tipo de dados. | [ACESSAR](https://www.google.com.br/books/edition/The_Definitive_Guide_to_DAX/ZvSfDwAAQBAJ?hl=pt-BR&gbpv=0)
DAX | Este é um guia sobre a Linguagem DAX (Data Analysis Expressions) da Microsoft. Trata-se de uma fórmula de linguagem de expressões de dados que serve para dar vida aos seus dados com diversas maneiras de manipulá-los. Com ele você vai aprender a resumir dados, descobrir perfis, encontrar as respostas para sua análise de negócios e criar suas próprias fórmulas. | [ACESSAR](https://learn.microsoft.com/pt-br/dax/)
Business Intelligence | O livro "Business Intelligence" é um guia prático para quem deseja aprender sobre a área de inteligência de negócios e como implantar um projeto de BI em uma empresa. O autor, Ricardo Rabelo, detalha as etapas do processo de criação de um projeto de BI utilizando a ferramenta Pentaho. | [ACESSAR](https://www.casadocodigo.com.br/products/livro-business-intelligence)
