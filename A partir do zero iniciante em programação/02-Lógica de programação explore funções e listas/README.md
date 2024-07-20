# Lógica de programação: explore funções e listas

- Aprenda o que são funções e como usar o JavaScript para manipular elementos na tela
- Desenvolva ainda mais sua lógica de programação inspirado num projeto real
- Saiba como usar o Github e Vercel para publicar seus projetos
- Descubra como utilizar listas, uma das principais estruturas de dados no mundo da programação
- Crie manipulações de palavras e números de forma dinâmica com JavaScript

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Jogo do Número Secreto 2.0](https://gha-jogo-numero-secreto-v2.vercel.app/)
- [Desafio JS](https://gha-desafio-js.vercel.app)

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Interagindo com HTML | <ul><li><p>Carregamos o projeto com o HTML e o CSS para criar a estrutura e o estilo da página que utilizaremos durante o curso;</p>
</li><li><p>Aprendemos a manipular o conteúdo dos elementos HTML, como o H1 e o parágrafo (p), utilizando JavaScript para alterar dinamicamente o texto exibido na página;</p>
</li><li><p>Entendemos a importância da interação entre o HTML e o JavaScript para criar páginas web dinâmicas e interativas.</p>
</li></ul>
Funções | <ul><li><p>Criamos uma função em JavaScript que recebe 2 parâmetros para gerar um número aleatório e entendemos como usar a estrutura de uma função para encapsular um trecho de código reutilizável;</p>
</li><li><p>Utilizamos a palavra-chave "return" dentro da função para retornar o valor do número aleatório gerado e criamos outra função chamada <code>exibirMensagemInicialNaTela</code> que não possui retorno nem parâmetros;</p>
</li><li><p>Compreendemos a diferença entre funções com retorno e funções sem retorno e aprendemos como chamar e invocar a função para exibir uma mensagem inicial na tela;</p>
</li><li><p>Vimos como os parâmetros e retornos são importantes para a comunicação entre funções e o restante do programa.</p>
</li></ul>
Reiniciando o jogo | <ul><li><p>Aprendemos como criar um programa para verificar se o “chute” inserido é igual ao número secreto definido. Utilizamos estruturas condicionais para tomar decisões com base no resultado dessa comparação;</p>
</li><li><p>Criamos uma variável para armazenar a quantidade de tentativas realizadas pelo usuário;</p>
</li><li><p>Vimos a importância de consultar a documentação da linguagem e das bibliotecas utilizadas no desenvolvimento do programa. A documentação é uma fonte valiosa de informações que nos auxilia na compreensão de conceitos e no uso correto das funcionalidades disponíveis.</p>
</li></ul>
Listas | <ul><li>Aprendemos a melhorar o código existente, tornando-o mais eficiente e legível. Neste caso, refatoramos a função que realiza o sorteio do número secreto, tornando-a mais robusta e garantindo que o número sorteado não seja repetido;</li></ul>
Publicando o projeto | <ul><li>Aprendemos a publicar nosso projeto no Github e disponibilizá-lo para outras pessoas através de um link pelo serviço Vercel;</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

<details>

<summary>Interagindo com HTML</summary>

> A implementação dos exercícios abaixo foi realizada no projeto [Desafio JS](#projeto)

1. Faça o download de outro projeto `(Desafio-1.zip)` e abra no Visual Studio Code.

2. Altere o conteúdo da tag h1 com document.querySelector e atribua o seguinte texto: Hora do Desafio.

3. Crie uma função que exiba no console a mensagem O botão foi clicado sempre que o botão Console for pressionado.

4. Crie uma função que exiba um alerta com a mensagem: Eu amo JS, sempre que o botão Alerta for pressionado.

5. Crie uma função que é executada quando o botão prompt é clicado, perguntando o nome de uma cidade do Brasil. Em seguida, exiba um alerta com a mensagem concatenando a resposta com o texto: Estive em {cidade} e lembrei de você.

6. Ao clicar no botão soma, peça 2 números inteiros e exiba o resultado da soma em um alerta.

</details>
<br>
<details>
<summary>Funções</summary>

1. Criar uma função que exibe "Olá, mundo!" no console.

```JavaScript
function exibirOla() {
    console.log("Olá, mundo!");
}

exibirOla();
```

2. Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.

```JavaScript
function exibirOlaNome(nome) {
    console.log(`Olá, ${nome}!`);
}

exibirOlaNome("Alice");
```

3. Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.

```JavaScript
function calcularDobro(numero) {
    return numero * 2;
}

let resultadoDobro = calcularDobro(5);
console.log(resultadoDobro);
```

4. Criar uma função que recebe três números como parâmetros e retorna a média deles.

```JavaScript
function calcularMedia(a, b, c) {
    return (a + b + c) / 3;
}

let media = calcularMedia(4, 7, 10);
console.log(media);
```

5. Criar uma função que recebe dois números como parâmetros e retorna o maior deles.

```JavaScript
function encontrarMaior(a, b) {
    return a > b ? a : b;
}

let maiorNumero = encontrarMaior(15, 9);
console.log(maiorNumero);
```

6. Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo

```JavaScript
function quadrado(numero) {
    return numero * numero;
}

let resultado = quadrado(2);
console.log(resultado);
```

</details>
<br>
<details>
<summary>Reiniciando o Jogo</summary>

1. Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.

```JavaScript
function calculaIMC(altura, peso){
    let imc = peso / (alturaMetros * alturaMetros);
  }
```

2. Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.

```JavaScript
function calcularFatorial(numero) {
    if (numero === 0 || numero === 1) {
      return 1;
    }
  
    let fatorial = 1;
    for (let i = 2; i <= numero; i++) {
      fatorial *= i;
    }
  
    return fatorial;
  }
  
  let numero = 5;
  let resultado = calcularFatorial(numero);
  console.log(`O fatorial de ${numero} é ${resultado}`);

```

3. Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. Para isso, considere a cotação do dólar igual a R$4,80.

```JavaScript
function converterDolarParaReal(valorEmDolar) {
    let cotacaoDolar = 4.80;
    let valorEmReais = valorEmDolar * cotacaoDolar;
    return valorEmReais.toFixed(2);
  }
  
  let valorEmDolar = 50;
  let valorEmReais = converterDolarParaReal(valorEmDolar);
  console.log(`${valorEmDolar} dólares equivalem a R$ ${valorEmReais}`);
```

4. Crie uma função que mostre na tela a área e o perímetro de uma sala retangular, utilizando altura e largura que serão dadas como parâmetro.

```JavaScript
function calcularAreaPerimetroSalaRetangular(altura, largura) {
    let area = altura * largura;
    let perimetro = 2 * (altura + largura);
    
    console.log(`Área da sala: ${area} metros quadrados`);
    console.log(`Perímetro da sala: ${perimetro} metros`);
  }
  
  let altura = 3;
  let largura = 5;
  calcularAreaPerimetroSalaRetangular(altura, largura);
```  

5. Crie uma função que mostre na tela a área e o perímetro de uma sala circular, utilizando seu raio que será fornecido como parâmetro. Considere Pi = 3,14.

```JavaScript
function calcularAreaPerimetroSalaCircular(raio) {
    let area = Math.PI * raio * raio;
    let perimetro = 2 * Math.PI * raio;
    
    console.log(`Área da sala circular: ${area.toFixed(2)} metros quadrados`);
    console.log(`Perímetro da sala circular: ${perimetro.toFixed(2)} metros`);
  }
  
  let raio = 4;
  calcularAreaPerimetroSalaCircular(raio);
```

6. Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.

```JavaScript
function mostrarTabuada(numero) {
    for (let i = 1; i <= 10; i++) {
      let resultado = numero * i;
      console.log(`${numero} x ${i} = ${resultado}`);
    }
  }
  
  let numero = 7;
  mostrarTabuada(numero);
```

</details>
<br>
<details>
<summary></summary>

1. Crie uma lista vazia, com o nome listaGenerica.

```JavaScript
let listaGenerica = [];
```

2. Crie uma lista de linguagens de programação chamada linguagensDeProgramacao com os seguintes elementos: 'JavaScript','C','C++', 'Kotlin' e 'Python'.

```JavaScript
let linguagensDeProgramacao = ['JavaScript', 'C', 'C++', 'Kotlin', 'Python'];
```

3. Adicione à lista linguagensDeProgramacao os seguintes elementos: 'Java', 'Ruby' e 'GoLang'.

```JavaScript
linguagensDeProgramacao.push('Java', 'Ruby', 'GoLang');
// Lista ao final: ['JavaScript', 'C', 'C++', 'Kotlin', 'Python', 'Java', 'Ruby', 'GoLang']
```

4. Crie uma lista com 3 nomes e exiba no console apenas o primeiro elemento.

```JavaScript
nomes = ['JavaScript', 'Python', 'Go'];
console.log(nomes[0]);
```

5. Crie uma lista com 3 nomes e exiba no console apenas o segundo elemento.

```JavaScript
nomes = ['JavaScript', 'Python', 'Go'];
console.log(nomes[1]);
```

6. Crie uma lista com 3 nomes e exiba no console apenas o último elemento.

```JavaScript
nomes = ['JavaScript', 'Python', 'Go'];
console.log(nomes[2]);
```

</details>

## Links Úteis

[Voltar à Navegação](#navegação)

- [Diferenças entre HTML, CSS e JavaScript](https://www.alura.com.br/artigos/html-css-e-js-definicoes)

- [Documentação sobre Arrays JS](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
------------|-----------|--------
Lógica de Programação Crie seus primeiros programas usando Javascript e HTML | Este livro apresenta uma abordagem totalmente prática. Uma didática pensada no iniciante, com a qual os conceitos são apresentados com motivações práticas, através do surgimento da necessidade para depois mostrar a solução. | [ACESSAR](https://www.casadocodigo.com.br/products/livro-programacao?_pos=1&_sid=4661f8240&_ss=r)
Lógica de programação com Portugol | Neste livro, Joice Mendes e Rafael Muniz apresentam todos os conceitos necessários para a criação da lógica de programação e dos algoritmos. Você vai aprimorar sua percepção lógica e aprender a aplicá-la na programação, cobrindo tópicos desde a sintaxe do Portugol, variáveis, comandos, estruturas condicionais, operadores relacionais e lógicos, estruturas de repetição, até vetores, matrizes e funções. O material é recheado com 85 exemplos de código, 55 exercícios de fixação com gabarito e um projeto prático ao longo do aprendizado. Todos os capítulos contam com um vídeo complementar disponibilizado na internet. | [ACESSAR](https://www.casadocodigo.com.br/products/livro-portugol?_pos=2&_sid=4661f8240&_ss=r)
Livro: "Estruturas de Dados e Algoritmos com JavaScript" | Este livro aborda de forma detalhada as estruturas de dados e algoritmos mais comuns, fornecendo exemplos práticos em JavaScript. | [ACESSAR](https://www.google.com.br/books/edition/Estruturas_de_dados_e_algoritmos_com_Jav/0nWKDwAAQBAJ?hl=pt-BR&gbpv=1&dq=estrutura+de+dados+javascript&printsec=frontcover)
Site: MDN Web Docs | A documentação oficial da Mozilla Developer Network (MDN) é uma excelente fonte de informações sobre JavaScript. Lá você encontrará explicações detalhadas sobre a sintaxe, recursos da linguagem e exemplos de código. | [ACESSAR](https://developer.mozilla.org/pt-BR/)
Eloquent JavaScript 3rd edition | Este é um livro sobre JavaScript, programação e as maravilhas do mundo digital. Um guia essencial para toda a pessoa desenvolvedora web. Em inglês. | [ACESSAR](https://eloquentjavascript.net/)
Algoritmos - Teoria e Prática, Thomas H. Cormen | Este livro apresenta um texto abrangente sobre o moderno estudo de algoritmos para computadores. É uma obra clássica, cuja primeira edição tornou-se amplamente adotada nas melhores universidades em todo o mundo, bem como padrão de referência para profissionais da área. | [ACESSAR](https://books.google.com.br/books/about/Algoritmos_Teoria_e_Pr%C3%A1tica.html?id=6iA4LgEACAAJ&source=kp_book_description&redir_esc=y)
JavaScript: O Guia Definitivo | Referência completa para programadores, JavaScript: O guia definitivo fornece uma ampla descrição da linguagem JavaScript básica e das APIs JavaScript do lado do cliente definidas pelos navegadores Web. Recomendado para programadores experientes que desejam aprender a linguagem de programação da Web e para programadores JavaScript que desejam ampliar seus conhecimentos e dominar a linguagem, este é o guia do programador e manual de referência de JavaScript completo e definitivo. | [ACESSAR](https://www.amazon.com.br/JavaScript-Guia-Definitivo-David-Flanagan/dp/856583719X/ref=sr_1_1?keywords=javascript&qid=1701835643&sr=8-1&ufe=app_do%3Aamzn1.fos.6121c6c4-c969-43ae-92f7-cc248fc6181d)
HTML5 e CSS3 Domine a web do futuro | Neste livro você irá aprender a criar páginas elegantes de forma simples! HTML e CSS, quando bem utilizados, podem ser o sucesso de um projeto e, com os novos recursos, muito do que antes era trabalhoso agora não é mais. | [ACESSAR](https://www.casadocodigo.com.br/products/livro-html-css?_pos=2&_sid=ee24eb627&_ss=r)
Guia Front-End O caminho das pedras para ser um dev Front-End | Neste livro, Diego Eis nos guia sobre o mundo de desenvolvimento web por meio de uma análise franca e objetiva de diversas tecnologias adotadas, necessidades do mercado e postura profissional. Você não vai aprender diretamente sobre essas tecnologias aqui, mas certamente vai desenvolver um senso mais apurado e uma nova forma de olhar para elas, o que é fundamental nesse mundo de aprendizado não linear. | [ACESSAR](https://www.casadocodigo.com.br/products/livro-guia-frontend?_pos=5&_sid=ee24eb627&_ss=r)