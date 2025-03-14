# Lógica de programação: mergulhe em programação com JavaScript

- Exiba mensagens na tela de forma interativa
- Utilize variáveis no desenvolvimento de software
- Ingresse no mundo de desenvolvimento seguindo boas práticas de programação
- Desenvolva uma aplicação do início ao fim, inspirada no mundo real
- Aprenda a adaptar soluções desenvolvidas pela linguagem em seus programas de software

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Jogo do Número Secreto](https://gha-jogo-numero-secreto.vercel.app)

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
 Iniciando com JavaScript | <ul><li><p>Preparamos o ambiente de desenvolvimento com a instalação do Visual Studio Code para criar programas utilizando a linguagem JavaScript;</p></li><li><p>Entendemos o conceito de variável para guardar informações, como números ou palavras, para usar mais tarde no nosso programa;</p></li><li><p>Usamos o <code>alert</code> para exibir uma mensagem passando algumas instruções sobre o programa e usamos o <code>prompt</code> para interagir com a pessoa permitindo inserir um valor e armazenando em uma variável;</p></li><li><p>Criamos um <code>if</code>, que é uma instrução em programação que permite ao computador tomar decisões ao executar um bloco de código apenas se uma condição específica for verdadeira.</p></li></ul>
 Condicionais e concatenação | <ul><li><p>Utilizamos o console para testar e depurar nosso código, exibindo mensagens e valores durante a execução do programa;</p></li><li><p>Aprendemos a utilizar estruturas condicionais (if/else) para criar lógicas que permitem ao programa tomar decisões com base em condições específicas;</p></li><li><p>Implementamos um bloco de código para exibir uma mensagem caso o chute do usuário não seja igual ao número secreto;</p></li><li><p>Usamos template strings para concatenar o número secreto com o valor armazenado em uma variável e exibir uma mensagem personalizada.</p></li></ul>
 Loops e tentativas | <ul><li><p>Aprendemos a verificar se um número é maior ou menor do que outro utilizando estruturas condicionais (if/else) em nosso programa;</p></li><li><p>Utilizamos o loop "while" para repetir um bloco de código enquanto uma determinada condição for verdadeira, e permitir assim que o programa execute uma ação várias vezes;</p></li><li><p>Implementamos um contador de tentativas para acompanhar e exibir a quantidade de vezes que o usuário tentou adivinhar um número secreto. Podemos fazer isso, por exemplo, em um jogo de adivinhação.</p></li></ul>
 Boas práticas de programação | <ul><li><p>Aprendemos a evitar código duplicado utilizando estratégias para exibir a palavra "tentativas" no singular ou plural, dependendo do número de tentativas realizadas;</p></li><li><p>Analisamos a documentação e encontrar informações relevantes para o desenvolvimento do nosso programa;</p></li><li><p>Descobrimos como utilizar a função Math.random() para gerar um número aleatório, permitindo a criação de desafios e jogos mais dinâmicos e variados.</p></li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

<details>
<summary>Iniciando com JavaScript</summary>

1. Mostre um alerta com a mensagem "Boas vindas ao nosso site!".

```JavaScript
alert("Boas vindas ao nosso site!");
```

2. Declare uma variável chamada nome e atribua a ela o valor "Lua".

```JavaScript
let nome = "Lua";
```

3. Crie uma variável chamada idade e atribua a ela o valor 25.

```JavaScript
let idade = 25;
```

4. Defina uma variável numeroDeVendas e atribua a ela o valor 50.

```JavaScript
let numeroDeVendas = 50;
```

5. Defina uma variável saldoDisponivel e atribua a ela o valor 1000.

```JavaScript
let saldoDisponivel = 1000;
```

6. Exiba um alerta com o texto "Erro! Preencha todos os campos"

```JavaScript
alert("Erro! Preencha todos os campos.");
```

7. Declare uma variável chamada mensagemDeErro e atribua a ela o valor "Erro! Preencha todos os campos" Agora exiba um alerta com o valor da variável mensagemDeErro.

```JavaScript
let mensagemDeErro = "Erro! Preencha todos os campos.";
alert(mensagemDeErro);
```

8. Use um prompt para perguntar o nome do usuário e armazená-lo na variável nome.

```JavaScript
nome = prompt("Qual o seu nome");
```

9. Peça ao usuário para digitar sua idade usando um prompt e armazene-a na variável idade.

```JavaScript
idade = prompt("Preencha sua idade");
```

10. Agora, caso a idade seja maior ou igual que 18, exiba um alerta com a mensagem "Pode tirar a habilitação!".

```JavaScript
if (idade >= 18) {
    alert("Pode tirar a habilitação!");
}
```

</details>
<br>
<details>
<summary>Condicionais e concatenação</summary>

1. Pergunte ao usuário qual é o dia da semana. Se a resposta for "Sábado" ou "Domingo", mostre "Bom fim de semana!". Caso contrário, mostre "Boa semana!".

```JavaScript
let diaDaSemana = prompt('Qual é o dia da semana?');
if (diaDaSemana == 'Sábado') {
    alert('Bom fim de semana!');
} else if (diaDaSemana == 'Domingo') {
    alert('Bom fim de semana!');
} else {
    alert('Boa semana!');
}
```

2. Verifique se um número digitado pelo usuário é positivo ou negativo. Mostre um alerta informando.

```JavaScript
let numero = prompt('Digite um positivo ou negativo');
if (numero > 0) {
    alert('Número positivo!');
} else {
    alert('Número negativo!');
}
```

3. Crie um sistema de pontuação para um jogo. Se a pontuação for maior ou igual a 100, mostre "Parabéns, você venceu!". Caso contrário, mostre "Tente novamente para ganhar.".

```JavaScript
let pontuacao = 105;
if (pontuacao > 100) {
    console.log('Parabéns, você venceu!');
} else {
    console.log('Tente novamente para ganhar.');
}
```

4. Crie uma mensagem que informa o usuário sobre o saldo da conta, usando uma template string para incluir o valor do saldo.

```JavaScript
let saldoConta = 500;
alert(`Seu saldo é de R$${saldoConta}.`);
```

5. Peça ao usuário para inserir seu nome usando prompt. Em seguida, mostre um alerta de boas-vindas usando esse nome.

```JavaScript
let nome = prompt('Qual o seu nome?');
alert(`Boas vindas ${nome}`);
```

</details>
<br>
<details>
<summary>Loops e tentativas</summary>

1. Crie um contador que comece em 1 e vá até 10 usando um loop while. Mostre cada número.

```JavaScript
let contador = 1;
while (contador <= 10) {
    console.log(contador);
    contador++;
}
```

2. Crie um contador que começa em 10 e vá até 0 usando um loop while. Mostre cada número.

```JavaScript
let contador = 10;
while (contador >= 0) {
    console.log(contador);
    contador--;
}
```

3. Crie um programa de contagem regressiva. Peça um número e conte deste número até 0, usando um loop while no console do navegador.

```JavaScript
let numeroMaximo = prompt("Digite um número para a contagem regressiva:");

while (numeroMaximo >= 0) {
    console.log(numeroMaximo);
    numeroMaximo--;
}
```

4. Crie um programa de contagem progressiva. Peça um número e conte de 0 até esse número, usando um loop while no console do navegador.

```JavaScript
let numeroMaximo = prompt("Digite um número para a contagem progregressiva:");;
let contador = 0;

while (contador <= numeroMaximo) {
    console.log(contador);
    contador++
}
```

</details>
<br>
<details>
<summary>Boas práticas de programação</summary>

1. Crie um programa que utilize o console.log para exibir uma mensagem de boas-vindas.

```Javascript
console.log('Boas vindas');
```

2. Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o console.log para exibir a mensagem "Olá, [seu nome]!" no console do navegador.

```Javascript
let nome = 'Seu Nome';
console.log(`Olá, ${nome}!`);
```

3. Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o alert para exibir a mensagem 
"Olá, [seu nome]!".

```Javascript
let nome = 'Seu nome';
alert(`Olá, ${nome}!`);
```

4. Utilize o prompt e faça a seguinte pergunta: Qual a linguagem de programação que você mais gosta?. Em seguida, armazene a resposta em uma variável e mostre no console do navegador.

```Javascript
let linguagemPreferida = prompt('Qual  a linguagem de programação que você mais gosta?');
console.log(linguagemPreferida);
```

5. Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, realize a soma desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para mostrar a mensagem "A soma de [valor1] e [valor2] é igual a [resultado]." no console.

```Javascript
let valor1 = 42;
let valor2 = 8;
let resultado = valor1 + valor2;

console.log(`A soma de ${valor1} e ${valor2} é igual a ${resultado}.`)
```

6. Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, realize a subtração desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para mostrar a mensagem "A diferença entre [valor1] e [valor2] é igual a [resultado]." no console.

```Javascript
let valor1 = 10;
let valor2 = 8;
let resultado = valor1 - valor2;

console.log(`A diferença entre ${valor1} e ${valor2} é igual a ${resultado}.`);
```

7. Peça ao usuário para inserir sua idade com prompt. Com base na idade inserida, utilize um if para verificar se a pessoa é maior ou menor de idade, exibindo uma mensagem apropriada no console.

```Javascript
let idade = prompt('Digite a sua idade:');
if (idade > 17) {
    console.log('Você é maior de idade.');
} else {
    console.log('Você é menor de idade.');
}
```

8. Crie uma variável "numero" e peça um valor com prompt verifique se é positivo, negativo ou zero. Use if-else para imprimir a respectiva mensagem.

```Javascript
let numero = parseFloat(prompt("Digite um número:"));

if (numero > 0) {
    console.log("O número é positivo.");
} else if (numero < 0) {
    console.log("O número é negativo.");
} else {
    console.log("O número é zero.");
}
```

9. Use um loop while para imprimir os números de 1 a 10 no console.

```Javascript
let numero = 1;
while (numero <= 10) {
    console.log(numero);
    numero++;
}
```

10. Crie uma variável "nota" e atribua um valor numérico a ela. Use if-else para determinar se a nota é maior ou igual a 7 e exiba "Aprovado" ou "Reprovado" no console.

```Javascript
let nota = 8; // Substitua pelo valor da nota que deseja testar

if (nota >= 7) {
    console.log("Aprovado");
} else {
    console.log("Reprovado");
}
```

11. Use o Math.random para gerar qualquer número aleatório e exiba esse número no console.

```Javascript
let numeroAleatorio = Math.random();
console.log(numeroAleatorio);
```

12. Use o Math.random para gerar um número inteiro entre 1 e 10 e exiba esse número no console.

```Javascript
let numeroInteiroAleatorio = parseInt(Math.random() * 10) + 1;
console.log(numeroInteiroAleatorio);
```

13. Use o Math.random para gerar um número inteiro entre 1 e 1000 e exiba esse número no console.

```Javascript
let numeroInteiroAleatorio = parseInt(Math.random() * 1000) + 1;
let numeroInteiroAleatorio = parseInt(Math.random() * 1000) + 1;
console.log(numeroInteiroAleatorio);
```

</details>

## Links Úteis

[Voltar à Navegação](#navegação)

- [A documentação da linguagem de programação JavaScript](https://developer.mozilla.org/pt-BR/docs/Learn/JavaScript/First_steps/What_is_JavaScript)
- [Guia de JavaScript: o que é e como aprender a linguagem mais popular do mundo?](https://www.alura.com.br/artigos/javascript)

- [Ponto e vírgula - documentação](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Lexical_grammar#automatic_semicolon_insertion)
- [Ponto e vírgula - Stack Overflow](https://pt.stackoverflow.com/questions/3341/utilizar-ou-n%C3%A3o-ponto-e-v%C3%ADrgula-no-fim-das-linhas-em-javascript)

- [Como utilizar operadores de comparação em Javascript](https://www.alura.com.br/artigos/operadores-matematicos-em-javascript)

- [Como gerar um número aleatório](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Math/random)

- [W3Schools (W3S)](https://www.w3schools.com/js/default.asp)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
------------|-----------|--------
Lógica de Programação Crie seus primeiros programas usando Javascript e HTML | Este livro apresenta uma abordagem totalmente prática. Uma didática pensada no iniciante, com a qual os conceitos são apresentados com motivações práticas, através do surgimento da necessidade para depois mostrar a solução. | [ACESSAR](https://www.casadocodigo.com.br/products/livro-programacao?_pos=1&_sid=4661f8240&_ss=r)
Lógica de programação com Portugol | Neste livro, Joice Mendes e Rafael Muniz apresentam todos os conceitos necessários para a criação da lógica de programação e dos algoritmos. Você vai aprimorar sua percepção lógica e aprender a aplicá-la na programação, cobrindo tópicos desde a sintaxe do Portugol, variáveis, comandos, estruturas condicionais, operadores relacionais e lógicos, estruturas de repetição, até vetores, matrizes e funções. O material é recheado com 85 exemplos de código, 55 exercícios de fixação com gabarito e um projeto prático ao longo do aprendizado. Todos os capítulos contam com um vídeo complementar disponibilizado na internet. | [ACESSAR](https://www.casadocodigo.com.br/products/livro-portugol?_pos=2&_sid=4661f8240&_ss=r)
Estruturas de Dados e Algoritmos com JavaScript | Este livro aborda de forma detalhada as estruturas de dados e algoritmos mais comuns, fornecendo exemplos práticos em JavaScript. | [ACESSAR](https://www.google.com.br/books/edition/Estruturas_de_dados_e_algoritmos_com_Jav/0nWKDwAAQBAJ?hl=pt-BR&gbpv=1&dq=estrutura+de+dados+javascript&printsec=frontcover)
MDN Web Docs | A documentação oficial da Mozilla Developer Network (MDN) é uma excelente fonte de informações sobre JavaScript. Lá você encontrará explicações detalhadas sobre a sintaxe, recursos da linguagem e exemplos de código. | [ACESSAR](https://developer.mozilla.org/pt-BR/)
Eloquent JavaScript 3rd edition | Este é um livro sobre JavaScript, programação e as maravilhas do mundo digital. Um guia essencial para toda a pessoa desenvolvedora web. Em inglês. | [ACESSAR](https://eloquentjavascript.net/)
Algoritmos - Teoria e Prática, Thomas H. Cormen | Este livro apresenta um texto abrangente sobre o moderno estudo de algoritmos para computadores. É uma obra clássica, cuja primeira edição tornou-se amplamente adotada nas melhores universidades em todo o mundo, bem como padrão de referência para profissionais da área. | [ACESSAR](https://books.google.com.br/books/about/Algoritmos_Teoria_e_Pr%C3%A1tica.html?id=6iA4LgEACAAJ&source=kp_book_description&redir_esc=y)
JavaScript: O Guia Definitivo | Referência completa para programadores, JavaScript: O guia definitivo fornece uma ampla descrição da linguagem JavaScript básica e das APIs JavaScript do lado do cliente definidas pelos navegadores Web. Recomendado para programadores experientes que desejam aprender a linguagem de programação da Web e para programadores JavaScript que desejam ampliar seus conhecimentos e dominar a linguagem, este é o guia do programador e manual de referência de JavaScript completo e definitivo. | [ACESSAR](https://www.amazon.com.br/JavaScript-Guia-Definitivo-David-Flanagan/dp/856583719X/ref=sr_1_1?keywords=javascript&qid=1701835643&sr=8-1&ufe=app_do%3Aamzn1.fos.6121c6c4-c969-43ae-92f7-cc248fc6181d)
HTML5 e CSS3 Domine a web do futuro | Neste livro você irá aprender a criar páginas elegantes de forma simples! HTML e CSS, quando bem utilizados, podem ser o sucesso de um projeto e, com os novos recursos, muito do que antes era trabalhoso agora não é mais. Aprenda as melhores técnicas para escrever seu site por meio de exemplos práticos de funcionalidades úteis do cotidiano. Construa menus, aplique efeitos, estilize elementos visuais, melhore a semântica da sua página e muito mais! | [ACESSAR](https://www.casadocodigo.com.br/products/livro-html-css?_pos=2&_sid=ee24eb627&_ss=r)
Guia Front-End: O caminho das pedras para ser um dev Front-End | Neste livro, Diego Eis nos guia sobre o mundo de desenvolvimento web por meio de uma análise franca e objetiva de diversas tecnologias adotadas, necessidades do mercado e postura profissional. Você não vai aprender diretamente sobre essas tecnologias aqui, mas certamente vai desenvolver um senso mais apurado e uma nova forma de olhar para elas, o que é fundamental nesse mundo de aprendizado não linear. | [ACESSAR](https://www.casadocodigo.com.br/products/livro-guia-frontend?_pos=5&_sid=ee24eb627&_ss=r)
Como utilizar operadores de comparação em Javascript | Neste artigo de Rafa Ballerini você aprenderá as diferenças entre operadores de comparação em JavaScript e como utilizá-los | [ACESSAR](https://www.alura.com.br/artigos/operadores-matematicos-em-javascript?_gl=1*1dp3zv3*_ga*NzU2NTAyMDMyLjE2ODcxOTg5NTE.*_ga_1EPWSW3PCS*MTcwMTgzNTcwNC4zMTIuMS4xNzAxODM3NzE1LjAuMC4w*_fplc*RWNyYmRncFY3MFF2ajR3U3dGQ1hWUEFsUDVSS1VnRklHYlpIbXMwNzlaaXk4RGdGYVVwSVR1RlhROHQydXJqSU5jMW12U3MwYjdOamJZb2NuNGdZRFBqJTJGOVZycDFmYUt5UyUyRloyMkJ2aWFKUTc5YVppNyUyQjJDV0lNb0NQV3J3JTNEJTNE)
Documentação MDN: O que é JavaScript? | Neste primeiro artigo há uma análise profunda da linguagem, respondendo questões como "O que é JavaScript?", e "O que ele faz?", para você se sentir confortável com a proposta da linguagem. | [ACESSAR](https://developer.mozilla.org/pt-BR/docs/Learn/JavaScript/First_steps/What_is_JavaScript)
JavaScript Tutorial - Documentação W3Schools | Este tutorial ensina JavaScript do básico ao avançado. Em Inglês | [ACESSAR](https://www.w3schools.com/js/default.asp)
Guia de JavaScript: o que é e como aprender a linguagem mais popular do mundo? | Neste artigo, você vai conhecer o que é JavaScript, para que serve e como utilizá-lo. | [ACESSAR](https://www.alura.com.br/artigos/javascript?_gl=1*7i282i*_ga*NzU2NTAyMDMyLjE2ODcxOTg5NTE.*_ga_1EPWSW3PCS*MTcwMTgzNTcwNC4zMTIuMS4xNzAxODM3ODE5LjAuMC4w*_fplc*RWNyYmRncFY3MFF2ajR3U3dGQ1hWUEFsUDVSS1VnRklHYlpIbXMwNzlaaXk4RGdGYVVwSVR1RlhROHQydXJqSU5jMW12U3MwYjdOamJZb2NuNGdZRFBqJTJGOVZycDFmYUt5UyUyRloyMkJ2aWFKUTc5YVppNyUyQjJDV0lNb0NQV3J3JTNEJTNE)
