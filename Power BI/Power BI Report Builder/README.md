# Power BI: Report Builder

- Aprenda a instalar o Power BI Report Builder e identificar os principais painéis de costumizações disponíveis no software
- Conheça como conectar uma fonte de dados ao seu relatório e iniciar um relatório do começo
- Saiba como filtrar e ordenar informações específicas no relatório
- Entenda como utilizar o painel Propriedades para personalizar os itens do relatório
- Conheça como personalizar de forma automática um relatório usando expressões
- Saiba como ocultar e exibir informações do relatório adicionando recursos interativos
- Realize a exportação do relatório paginado em formatos como PDF e Word e integre relatórios distintos em um único arquivo

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Lotus](https://github.com/Doismiledoze/Alura/blob/main/Power%20BI/Power%20BI%20Report%20Builder/Lotus.pbix)
- [Lotus - Crachas](https://github.com/Doismiledoze/Alura/blob/main/Power%20BI/Power%20BI%20Report%20Builder/Lotus%20-%20Crachas.rdl)
- [Lotus - Relatório Detalhado](https://github.com/Doismiledoze/Alura/blob/main/Power%20BI/Power%20BI%20Report%20Builder/Lotus%20-%20Relatório%20Detalhado.rdl)
- [Lotus - Relatório Detalhado - Exercícios Extras](https://github.com/Doismiledoze/Alura/blob/main/Power%20BI/Power%20BI%20Report%20Builder/Lotus%20-%20Relatório%20Detalhado%20-%20Exercícios%20Extras.rdl)
- [Relatório de Atividades Individual](https://github.com/Doismiledoze/Alura/blob/main/Power%20BI/Power%20BI%20Report%20Builder/Relatório%20de%20Atividades%20Individual.rdl)

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Conhecendo a ferramenta | <ul><li>Diferenciar utilidades entre relatório e dashboard;</li><li>Criar uma conta Power BI através de uma conta corporativa;</li><li>Instalar o Power BI Report Builder;</li><li>Ocultar e visualizar os painéis de customizações de itens: Dados de Relatório (Report Data), Parâmetros (Parameters), Agrupamento (Groups), Propriedades (Properties) e Régua (Rules);</li><li>Conectar com uma fonte de dados;</li><li>Identificar os tipos de dados compatíveis para conexão com o Report Builder.</li></ul>
Criando relatório | <ul><li>Abrir um relatório em branco;</li><li>Extrair um conjunto de dados da fonte de dados conectada;</li><li>Criar uma lista que permite repetir as informações do conjunto de dados;</li><li>Filtrar as informações que apareceram na lista inserida no relatório;</li><li>Ordenar as informações que apareceram na lista inserida no relatório;</li><li>Criar uma tabela e inserir dados em sua coluna;</li><li>Identificar o cabeçalho e as informações em uma tabela;</li><li>Editar e configurar o texto do cabeçalho da tabela;</li><li>Utilizar o painel Propriedades para personalizar itens do relatório;</li><li>Adicionar totais na tabela;</li><li>Inserir itens avulsos para organizar os dados, como linha e caixa de texto;</li><li>Alterar a formatação de uma célula para representar valores monetários;</li><li>Personalizar de forma automática um relatório usando expressões;</li><li>Inserir uma expressão em uma caixa de texto;</li><li>Alterar a escala de medida de um número para milhões.</li></ul>
Customizando | <ul><li>Criar um agrupamento que permitiu unir as pessoas vendedoras pela sua respectiva região;</li><li>Editar um grupo de colunas e um grupo de linhas;</li><li>Acrescentar o somatório por agrupamento;</li><li>Criar uma coluna capaz de calcular informações baseado em expressões;</li><li>Identificar expressões simples e complexas;</li><li>Usar a função SWITCH() para aplicar alterações a partir de várias condições;</li><li>Inserir parâmetros para filtrar informações que serão exibidas no relatório;</li><li>Adicionar recursos interativos que permite ocultar e exibir informações do relatório.</li></ul>
Layout do relatório | <ul><li>Configurar o corpo do relatório: orientação, tamanho e margem da página;</li><li>Identificar o tamanho útil do corpo do relatório subtraindo a largura da página e suas margens;</li><li>Utilizar a régua para medir o tamanho dos itens do relatório;</li><li>Adicionar um cabeçalho e um rodapé no relatório;</li><li>Inserir no relatório uma imagem avulsa;</li><li>Numerar páginas do relatório usando a expressão =Globals!PageNumber;</li><li>Identificar o número total de páginas com a expressão =Globals!TotalPages;</li><li>Concatenar textos usando o símbolo &;</li><li>Visualizar o relatório em formato A4.</li></ul>
Publicando | <ul><li>Exportar o relatório paginado em diferentes formatos;</li><li>Identificar os formatos disponíveis para exportação dos relatórios;</li><li>Adquirir uma conta Power BI Premium;</li><li>Transformar um workspace comum em um workspace premium no PBI Serviços;</li><li>Publicar os relatórios gerados até agora no Power BI Serviços;</li><li>Integrar dois relatórios distintos em um único arquivo usando Sub-relatórios.</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

<details>
<summary>Publicando</summary>

1. Explique a diferença entre relatório e relatório paginados do Power BI.

    ```text
    Os relatórios interativos no Power BI são projetados para análise visual e exploração dinâmica de dados, permitindo a criação de dashboards interativos. Eles são desenvolvidos no Power BI Desktop e são ideais para descobrir insights e compartilhar informações em tempo real.

    Já os relatórios paginados são mais estruturados e se assemelham a relatórios tradicionais, sendo desenvolvidos no Power BI Report Builder. São mais adequados para situações em que a formatação precisa ser em páginas, resultando em arquivos prontos para serem impressos ou compartilhados em um formato mais estruturado de página.
    ```

2. Foi solicitado um relatório que analise a diferentes linhas de cadeiras de escritório. Para isso adicione um novo conjunto de dados no RelatorioDetalhado.rdl que contenha os campos: Linha, Cor, Faturamento e QuantidadeDistinta. Não esqueça de definir um nome prático.

3. Ainda no arquivo RelatorioDetalhado.rdl editado no item anterior, crie uma tabela que mostre o faturamento por cor e linha de cadeira, não se esqueça de editar o formato do faturamento.

4. Para trazer uma tabela mais simplificada, adicione no projeto alterado anteriormente um grupo com as diferentes linhas de cadeiras de escritório. Priorize um layout que facilite a leitura da tabela e evite a repetição do nome das linhas para cada cor.

5. Formate a tabela desenvolvida anteriormente para trazer mais destaque ao cabeçalho e a coluna mesclada, explique suas escolhas de formatação.

    ```text
    a) Para o cabeçalho ter mais destaque a cor do preenchimento foi alterada para verde, a fonte também ganhou alteração, com o tamanho 11, em negrito, de cor branca.

    b) Já para a coluna "Linha", que tem o aspecto mesclado, foi definido o preenchimento na cor cinza claro com uma fonte em negrito. A linha sobressalente criada no processo de grupos foi excluída para melhor legibilidade.

    c) Todos os elementos da tabela foram centralizados verticalmente.
    ```

6. Defina sub-relatórios no Power BI Report Builder e cite situações vantajosas para sua utilização.

    ```text
    Os sub-relatórios no Power BI Report Builder são relatórios incorporados dentro de outros relatórios, permitindo uma abordagem modular na criação de relatórios mais complexos, resultando em projetos mais flexíveis, fáceis de manter e adaptáveis a diferentes necessidades e contextos. Aqui estão três situações vantajosas em utilizar sub-relatórios:

    Organização e Modularidade: Vantagem: Os sub-relatórios ajudam na organização e modularidade do projeto, permitindo que você quebre um relatório grande em partes menores e mais gerenciáveis. Exemplo: Se você estiver criando um relatório abrangente com várias seções ou áreas de interesse, cada seção pode ser desenvolvida como um sub-relatório separado. Isso facilita a manutenção e atualização de partes específicas do relatório.

    Desenvolvimento Colaborativo: Vantagem: Sub-relatórios facilitam o desenvolvimento colaborativo, permitindo que diferentes equipes ou membros trabalhem em partes específicas do relatório sem interferir nas outras áreas.

    Exemplo: Se uma equipe é responsável por criar um relatório de vendas e outra equipe é responsável pelos dados financeiros, cada equipe pode desenvolver seu próprio sub-relatório. Posteriormente, esses sub-relatórios podem ser combinados para criar um relatório completo.
    ```

</details>

## Links Úteis

[Voltar à Navegação](#navegação)

- [Power BI: Diferença entre dashboards e relatórios](https://www.alura.com.br/artigos/dashboards-vs-relatorios)
- [Parâmetros de URL em relatórios paginados no Power BI](https://learn.microsoft.com/pt-br/power-bi/paginated-reports/report-builder-url-parameters)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
-----------|-----------|-------
Relatórios Paginados no Power BI | Este é um guia fornecido pela Microsoft ensinando como criar relatórios paginados no Power BI. O guia explica o básico de como utilizar o Power BI Report Builder, uma ferramenta para criar relatórios paginados que você pode publicar no Power BI. | [ACESSAR](https://learn.microsoft.com/pt-br/power-bi/paginated-reports/report-builder-power-bi)
Microsoft Report Builder para SQL Server 2016 | Esta é a página de download do Microsoft Report Builder para SQL Server 2016. Esta ferramenta permite criar relatórios paginados eficazes com visualizações de dados interativas. | [ACESSAR](https://www.microsoft.com/pt-pt/download/details.aspx?id=58158)
Criar relatórios paginados no Power BI | Este tutorial da Microsoft ajuda a criar relatórios paginados no Power BI Report Builder. Ele fornece informações para conectar, projetar e visualizar relatórios. | [ACESSAR](https://learn.microsoft.com/pt-br/power-bi/paginated-reports/paginated-reports-report-builder-power-bi)
Diferença entre Dashboards e Relatórios | Artigo da Alura demonstrando as diferenças entre dashboards e relatórios. Explica de que maneira eles são utilizados na análise de dados e o impacto deles na tomada de decisões nas empresas. | [ACESSAR](https://www.alura.com.br/artigos/dashboards-vs-relatorios)
Relatórios paginados no Report Builder | Tutorial da Microsoft sobre como criar e trabalhar com relatórios paginados no Report Builder, explicando detalhes sobre a interface e as funcionalidades disponíveis. | [ACESSAR](https://learn.microsoft.com/pt-br/power-bi/paginated-reports/paginated-reports-report-design-view)
Expressões de relatório e SSRS | Tutorial completo sobre o uso de expressões em relatórios usando Report Builder e SQL Server Reporting Services. | [ACESSAR](https://learn.microsoft.com/pt-br/sql/reporting-services/report-design/expression-uses-in-reports-report-builder-and-ssrs?view=sql-server-ver16)
Planejamento de relatórios no Power BI | Um guia da Microsoft sobre planejamento de relatórios no Power BI. Aborda questões como coleta de requisitos, decisões sobre layout de relatório e planejamento de fontes de dados. | [ACESSAR](https://learn.microsoft.com/pt-br/power-bi/paginated-reports/report-builder-planning-report)
FAQ de relatórios paginados | Uma lista de perguntas frequentes elaborada pela Microsoft sobre relatórios paginados no Power BI. | [ACESSAR](https://learn.microsoft.com/pt-br/power-bi/paginated-reports/paginated-reports-faq)
Utilizações de relatórios paginados | Uma visualização da categoria de decisões e onde os relatórios paginados se encaixam para fornecer soluções eficazes. | [ACESSAR](https://learn.microsoft.com/pt-br/power-bi/guidance/report-paginated-image)
Criando relatórios com o Power BI Desktop | Este é um vídeo da equipe da Microsoft que mostra como criar relatórios no Power BI Desktop. Ele é parte de uma série de dez vídeos que cobrem diferentes tópicos no Power BI. | [ACESSAR](https://www.youtube.com/watch?v=OFXG7sl5L2o&list=PL1N57mwBHtN1icIhpjQOaRL8r9G-wytpT&index=10&ab_channel=MicrosoftPowerBI)
Relatórios Power BI com o Report Builder | Este artigo da Informatec descreve como o Power BI Report Builder pode ser usado para criar e publicar relatórios no Power BI Service. | [ACESSAR](https://www.informatec.com/en/reporting-power-bi-report-builder)
Parâmetros URL para relatórios paginados | Este artigo da Microsoft fornece uma visão detalhada de como usar parâmetros URL em relatórios paginados. Ensina como anexar parâmetros ao URL para filtrar e classificar relatórios. | [ACESSAR](https://learn.microsoft.com/pt-br/power-bi/paginated-reports/report-builder-url-parameters)