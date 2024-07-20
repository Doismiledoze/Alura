# Lógica de programação: praticando com desafios

- Pratique lógica de programação com diferentes desafios
- Utilize seus conhecimentos para implementar soluções
- Reforce seus conhecimentos em lógica de programação
- Desenvolva projetos para compor seu portfolio
- Melhore suas habilidades em programação

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Sorteador de Números]()
- [Alugames]()
- [Ingresso Online]()
- [Amigo Secreto]()

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Projeto Sorteador de números | <ul><li><p>Analisar o código de uma página HTML para entender sua estrutura e planejar o código de sua funcionalidade;</p></li><li><p>Declarar variáveis no JavaScript para armazenar elementos recuperados da página;</p></li><li><p>Recuperar elementos da página com JavaScript, com o uso da função <code>document.getElementById()</code>;</p></li><li><p>Recuperar valores digitados em campos de um formulário na página, via propriedade <strong>value</strong>;</p></li><li><p>Utilizar o recurso de <em><strong>Template String</strong></em>, do JavaScript, para concatenar valores de variáveis em String.</p></li><li><p>Utilizar a função <code>parseInt</code>, no JavaScript, para converter um valor do tipo String para um número inteiro;</p></li><li><p>Fazer uma estrutura de repetição utilizando <strong>for</strong> para gerar números aleatórios no sorteador;</p></li><li><p>Declarar uma variável do tipo <strong>array</strong> para representar uma lista;</p></li><li><p>Adicionar um elemento a um array com a função <code>push</code>;</p></li><li><p>Utilizar um código já desenvolvido por terceiros para realizar o sorteio de um número aleatório dentro de um intervalo.</p></li><li><p>Declarar um bloco condicional <strong>if/else</strong> para implementar a funcionalidade de alterar o status do botão <strong>Reiniciar</strong>.</p></li><li><p>Acessar a lista de classes que um elemento da página possui, via propriedade <strong>classList</strong>;</p></li><li><p>Verificar se um elemento da página possui uma determinada classe CSS, via função <code>classList.contains()</code>;</p></li><li><p>Remover uma classe CSS de um elemento da página, via função <code>classList.remove()</code>;</p></li><li><p>Adicionar uma classe CSS a um elemento da página, via função <code>classList.add()</code>;</p></li><li><p>Modificar o código HTML de um elemento na página, via propriedade <code>innerHTML</code>.</p></li></ul>
Projeto Alugames | <ul><li><p>Analisar o código de uma página HTML para entender sua estrutura e planejar o código de sua funcionalidade;</p></li><li><p>Recuperar elementos da página com JavaScript, com o uso das funções <code>document.querySelector()</code> e <code>document.getElementById()</code>;</p></li><li><p>Declarar variáveis no JavaScript para armazenar elementos recuperados da página;</p></li><li><p>Acessar a lista de classes que um elemento da página possui, via propriedade <strong>classList</strong>;</p></li><li><p>Verificar se um elemento da página possui uma determinada classe CSS, via função <code>classList.contains()</code>;</p></li><li><p>Remover uma classe CSS de um elemento da página, via função <code>classList.remove()</code>;</p></li><li><p>Adicionar uma classe CSS a um elemento da página, via função <code>classList.add()</code>;</p></li><li><p>Alterar o texto de um elemento da página, via propriedade <strong>textContent</strong>;</p></li><li><p>Declarar um bloco condicional <strong>if/else</strong>, para implementar a funcionalidade de alterar o status de um jogo.</p></li></ul>
Projeto Carrinho de Compras | <ul><li><p>Utilizar a função <code>split()</code> no JavaScript, para separar trechos de uma String por um determinado delimitador;</p></li><li><p>Recuperar valores digitados em campos de um formulário na página, via propriedade <code>value</code>;</p></li><li><p>Modificar o código HTML de um elemento na página, via propriedade `innerHTML;</p></li><li><p>Utilizar o recurso de <em>Template String</em> do JavaScript, para concatenar valores de variáveis em String.</p></li></ul>
Projeto Ingresso Online | <ul><li><p>Utilizar a função <code>parseInt</code> no JavaScript, para converter um valor do tipo String para um número inteiro;</p></li><li><p>Escrever o código de funcionalidades em funções separadas;</p></li><li><p>Utilizar um bloco condicional para determinar qual função deve ser chamada, de acordo com o valor armazenado em uma variável.</p></li></ul>
Projeto Amigo Secreto | <ul><li><p>Declarar uma variável do tipo array para representar uma lista;</p></li><li><p>Adicionar um elemento a um array com a função <code>push</code>;</p></li><li><p>Utilizar um código já desenvolvido por terceiros, para realizar o embaralhamento de elementos em um array.</p></li></ul>
Desafios Complementares | <ul><li><p>Realizar validações das informações, com o uso de condicionais;</p></li><li><p>Interromper a execução de uma função, com o uso do <code>return</code>;</p></li><li><p>Obter o número de elementos em um array, com a propriedade <code>length</code>;</p></li><li><p>Checar se um elemento existe em um array, com o uso da função <code>includes</code>.</p></li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

<details>
<summary>Projeto Sorteador de números</summary>

> Exercícios foram implementados no código do projeto [Sorteador de Números](#projeto)

1. Ao efetuar mais testes em nossa aplicação Sorteador de Números, você observará que está sendo permitido colocar um valor no campo “Do número” maior que o valor informado no campo “Até o número”, o que não é recomendável. O ideal é emitir um alerta para que o usuário reveja se inseriu os dados corretamente. Implemente uma proteção dentro da função sortear para que esse alerta seja exibido.

2. O que acontece se o usuário escolher uma quantidade de números para sortear superior aos números de um determinado intervalo? Isso vai gerar um loop infinito, pois a execução ficará presa o tempo inteiro na repetição while e o sorteio não será realizado. Como podemos proteger essa situação? Podemos verificar se a quantidade de números escolhidos no campo “Quantidade de números” é igual ou inferior ao intervalo de números entre os campos “Do número” e “Até o número”. Isso irá prevenir que esse erro aconteça. Implemente uma proteção dentro da função sortear para que esse cenário seja evitado.

</details>
<br>
<details>
<summary>Projeto Alugames</summary>

> Exercícios 1 e 2 foram implementados no código do projeto [Alugames](#projeto)

1. No projeto Alugames, uma confirmação ao devolver um jogo, solicitando ao usuário que confirme a devolução antes que ela seja concluída. Isso pode ajudar a evitar devoluções acidentais.

2. No projeto Alugames, crie uma função para imprimir no console a informação sobre quantos jogos foram alugados.

3. Crie um programa que verifica se uma palavra ou frase é um palíndromo.


```Javascript
    function essaPalavraEUmPalindromo(palavra){
    //let palavra = "rever";
    let separandoAsLetrasDaPalavra = palavra.split("");
    let palavraInvertida = separandoAsLetrasDaPalavra.reverse();
    palavraInvertida = palavraInvertida.join("");
    if(palavra == palavraInvertida){
        console.log(`A palavra ${palavra} é um palíndromo!`);
    } else {
        console.log(`A palavra ${palavra} não é um palíndromo!`);
    }
}
```

4. Crie um programa com uma função que receba três números como argumentos e os retorne em ordem crescente. Exiba os números ordenados.

```Javascript
    function ordenarNumeros(a, b, c) {
    const numerosOrdenados = [a, b, c].sort((x, y) => x - y);
    console.log(`Números ordenados: ${numerosOrdenados.join(', ')}`);
}

ordenarNumeros(3, 1, 5); // Deve exibir "Números ordenados: 1, 3, 5"
```

</details>
<br>
<details>
<summary>Projeto Carrinho de Compras</summary>

> Exercício 1 foi implementado no código do projeto [Carrinho de Compras](#projeto)

1. Adicione validações no código para garantir que o usuário só consiga adicionar produtos ao carrinho se tiver selecionado um produto válido e inserido uma quantidade válida. Se a entrada não for válida, exiba uma mensagem de erro apropriada.

2. Crie um formulário simples com campos de entrada e utilize JavaScript para recuperar os valores digitados nos campos usando a propriedade value. Exiba os valores no console e na tela.

```html
    <html>
        <body>
            <form id="meuForm">
                <label for="campoNome">Nome:</label>
                <input type="text" id="campoNome" name="nome">
                <label for="campoIdade">Idade:</label>
                <input type="text" id="campoIdade" name="idade">
                <button type="button" onclick="capturarValores()">Capturar Valores</button>
                <div id='mostraNome'><span>Seu nome e idade irão aparecer aqui.</span></div>
            </form>
            <script src="script.js"></script>
        </body>
    </html>
```

```JavaScript
    function capturarValores() {
        const nome = document.getElementById('campoNome').value;
        const idade = document.getElementById('campoIdade').value;
        document.getElementById('mostraNome').textContent = `Nome: ${nome}, Idade: ${idade}`;
        console.log(`Nome: ${nome}, Idade: ${idade}`);
    }
```

3. Tenha um elemento HTML na página (por exemplo, um parágrafo) e utilize JavaScript para modificar seu conteúdo usando a propriedade textContent.

```html
    <html>
        <body>
            <p id="meuParagrafo">Texto original</p>
            <button onclick="modificarConteudo()">Modificar Conteúdo</button>
            <script src="script.js"></script>
        </body>
    </html>
```

```Javascript
    function modificarConteudo() {
        const paragrafo = document.getElementById('meuParagrafo');
        paragrafo.textContent = 'Novo texto modificado dinamicamente!';
    }
```

4. Faça a soma de duas variáveis numéricas e apresente no console com uma mensagem amigável em Template String.

```Javascript
    const numero1 = 10;
    const numero2 = 20;
    const soma = numero1 + numero2;
    const mensagem = `A soma de ${numero1} e ${numero2} é ${soma}.`;

    console.log(mensagem);
```

5. Receba, no mínimo, duas sentenças como uma string e utilize split() para quebrá-la em frases menores com base em um ponto e vírgula como delimitador.

```Javascript
    const duasSentencas = "Criar o que não existe ainda deve ser a pretensão de todo sujeito que está vivo; A tarefa mais importante de uma pessoa que vem ao mundo é criar algo"
    const frasesSeparadas = duasSentencas.split(';');

    console.log(frasesSeparadas);
```

6. Receba uma string contendo números separados por vírgulas. Utilize split() para separar os números e exibi-los no console.

```Javascript
    const numerosSeparados = "10,20,30,40,50";
    const arrayNumeros = numerosSeparados.split(',');
    console.log(arrayNumeros);
```

</details>
<br>
<details>
<summary>Projeto Ingresso Online</summary>

> Exercício 1 foi implementado no código do projeto [Ingresso Online](#projeto)

1. Adicione uma verificação para garantir que a quantidade inserida pelo usuário seja um número positivo. Se o valor não for válido, exiba uma mensagem de erro adequada.

2. Crie uma função que aceite uma string como parâmetro, utilize a função parseInt para converter essa string em um número inteiro e retorne o resultado.

```Javascript
function converterParaInteiro(valorString) {
    return parseInt(valorString);
}

let valorString = "42";
let valorInteiro = converterParaInteiro(valorString);
console.log(valorInteiro);  // Saída esperada: 42
```

3. Escreva um programa de calculadora simples com funções separadas para adição, subtração, multiplicação e divisão. Utilize um bloco condicional para determinar qual função executar com base em uma variável que representa a operação desejada.

```Javascript
function adicao(a, b) {
    return a + b;
}

function subtracao(a, b) {
    return a - b;
}

function multiplicacao(a, b) {
    return a * b;
}

function divisao(a, b) {
    if (b !== 0) {
        return a / b;
    } else {
        return "Erro: divisão por zero.";
    }
}

function calculadora(operacao, a, b) {
    switch (operacao) {
        case 'soma':
            return adicao(a, b);
        case 'subtracao':
            return subtracao(a, b);
        case 'multiplicacao':
            return multiplicacao(a, b);
        case 'divisao':
            return divisao(a, b);
        default:
            return "Operação inválida.";
    }
}

let resultado = calculadora('soma', 5, 3);
console.log(resultado);  // Saída esperada: 8
```

4. Implemente uma função que aceite um número como parâmetro e utilize um bloco condicional para determinar se o número é par ou ímpar.

```Javascript
function verificarParOuImpar(numero) {
    if (numero % 2 === 0) {
        return "Par";
    } else {
        return "Ímpar";
    }
}

let numero = 7;
let resultadoParOuImpar = verificarParOuImpar(numero);
console.log(resultadoParOuImpar);  // Saída esperada: Ímpar
```

5. Crie uma função que converta a temperatura de Celsius para Fahrenheit e vice-versa. Utilize uma variável para indicar a escala desejada e um bloco condicional para determinar qual conversão realizar

```javascript
function converterTemperatura(valor, escala) {
    if (escala.toLowerCase() === 'celsius') {
        return (valor * 9/5) + 32;  // Celsius para Fahrenheit
    } else if (escala.toLowerCase() === 'fahrenheit') {
        return (valor - 32) * 5/9;  // Fahrenheit para Celsius
    } else {
        return "Escala inválida";
    }
}

let temperaturaCelsius = 25;
let temperaturaFahrenheit = converterTemperatura(temperaturaCelsius, 'celsius');
console.log(temperaturaFahrenheit);  // Saída esperada: 77
```

</details>
<br>
<details>
<summary>Projeto Amigo Secreto</summary>

> Exercício 1 foi implementado no código do projeto [Amigo Secreto](#projeto)

1. Criar uma funcionalidade no Projeto Amigo Secreto que permita ao usuário clicar em um amigo na lista e removê-lo. Atualizar a visualização da lista após a remoção.

2. Adicione os números 1,2,3 em uma variável chamada minhaLista e armazene os números 4, 5 e 6 separadamente em outra variável. Use o método concat() para combinar as sequências de valores em uma nova lista chamadanovaLista. Imprima novaLista no console.

```javascript
// Declarando uma variável do tipo array
let minhaLista = [];

// Adicionando elementos com push
minhaLista.push(1, 2, 3);
console.log("Adicionando elementos:", minhaLista);

// Criando uma nova variável
let outrosNumeros = [4, 5, 6];

// Concatenando arrays
let novaLista = minhaLista.concat(outrosNumeros);
console.log("Juntando Arrays:", novaLista);
```

3. Remova o último elemento de novaLista. Imprima novaLista após a remoção.

```javascript
// Removendo o último elemento
novaLista.pop();
console.log("Nova lista:", novaLista);
```

4. Utilize o algoritmo de Fisher-Yates (também conhecido como Knuth Shuffle) para embaralhar os elementos em novaLista. Pesquise e adapte o código para realizar o embaralhamento.

```javascript
function embaralharArray(array) {
    for (let i = array.length - 1; i > 0; i--) {
      const j = Math.floor(Math.random() * (i + 1));
      [array[i], array[j]] = [array[j], array[i]];
    }
    return array;
}

// Embaralhando novaLista
novaLista = embaralharArray(novaLista);
console.log("Embaralhando a Lista:", novaLista);
```

5. Crie uma função chamada removerDuplicatas que aceita um array como parâmetro e retorna um novo array sem elementos duplicados. Teste a função com novaLista e imprima o array resultante.

```javascript
// Função para remover duplicatas de um array
function removerDuplicatas(array) {
    return [...new Set(array)];
  }
  
// Testando a função com novaLista
let novaListaSemDuplicatas = removerDuplicatas(novaLista);
console.log("Remover duplicatas:", novaListaSemDuplicatas);
```

</details>
<br>
<details>
<summary>Desafios Complementares</summary>

1. Crie uma função que valide se um número é positivo, negativo ou zero.

```javascript
function validarNumero(numero) {
    if (numero > 0) {
        return "Positivo";
    } else if (numero < 0) {
        return "Negativo";
    } else {
        return "Zero";
    }
}

console.log(validarNumero(-1))
```

2. Implemente uma função que verifique se uma pessoa é maior de idade.

```javascript
function verificarIdade(idade) {
    return idade >= 18 ? "Maior de idade" : "Menor de idade";
}

console.log(verificarIdade(18))
```

3. Desenvolva uma função que valide se uma string é vazia ou não.

```javascript
function validarString(texto) {
    return texto === "" ? "String vazia" : "String não vazia";
}

console.log(validarString("Aqui há um texto?"))
console.log(validarString(""))
```

4. Crie uma função que determine se um ano é bissexto

```javascript
function verificarAnoBissexto(ano) {
    if ((ano % 4 === 0 && ano % 100 !== 0) || ano % 400 === 0) {
        return "Ano bissexto";
    } else {
        return "Não é bissexto";
    }
}

console.log(verificarAnoBissexto(2025))
```

5. Implemente uma função que calcule a média de dois números, interrompendo a execução se algum dos números não for válido.

```javascript
function calcularMedia(num1, num2) {
    if (isNaN(num1) || isNaN(num2)) {
        return "Um dos números não é válido.";
    }
    return (num1 + num2) / 2;
}

console.log(calcularMedia(8,5))
```

6. Desenvolva uma função que receba um array como parâmetro e retorne o seu tamanho.

```javascript
function obterTamanhoArray(arr) {
    return arr.length;
}

const minhaLista = [1,2,3,4,5,6,7,8,9,10]

console.log(obterTamanhoArray(minhaLista))
```

7. Crie um array e utilize a função includes para verificar se um elemento específico está presente

```javascript
const meuArray = [10, 20, 30, 40, 50];
console.log("O array contém o número 30?", meuArray.includes(30));
//saída esperada: "O array contém o número 30?" true
```

8. Implemente uma função que receba um array e um elemento, e retorne se o elemento está presente no array.

```javascript
// Função que verifica se um elemento está presente no array
function verificarElementoNoArray(arr, elemento) {
    return arr.includes(elemento);
}

// Exemplo de uso
const meuArray = [10, 20, 30, 40, 50];
const elementoProcurado = 30;

// Utilizando a função para verificar a presença do elemento no array
const elementoEstaPresente = verificarElementoNoArray(meuArray, elementoProcurado);

// Exibindo o resultado
if (elementoEstaPresente) {
    console.log(`O elemento ${elementoProcurado} está presente no array.`);
} else {
    console.log(`O elemento ${elementoProcurado} não está presente no array.`);
}
```

9. Crie um array de strings e utilize includes para verificar se uma determinada string está presente.

```javascript
const palavras = ["apple", "banana", "orange", "grape"];
console.log("A palavra 'banana' está no array?", palavras.includes("banana"));

//saída esperada: "A palavra 'banana' está no array?" true
```

10. Desenvolva uma função que receba um array de objetos representando estudantes de um curso e um objeto que representa um estudante procurado. Depois retorne se o objeto está presente no array.

```javascript
// Função que verifica se um objeto está presente no array
function verificarObjetoNoArray(arr, objeto) {
    return arr.some(item => JSON.stringify(item) === JSON.stringify(objeto));
}

// Array de objetos representando alunos
const alunos = [
    { id: 1, nome: 'João', idade: 20 },
    { id: 2, nome: 'Maria', idade: 22 },
    { id: 3, nome: 'Pedro', idade: 21 },
    { id: 4, nome: 'Ana', idade: 19 }
];

// Objeto que queremos verificar se está presente no array
const alunoProcurado = { id: 2, nome: 'Maria', idade: 22 };

// Utilizando a função para verificar a presença do objeto no array
const objetoEstaPresente = verificarObjetoNoArray(alunos, alunoProcurado);

// Exibindo o resultado
if (objetoEstaPresente) {
    console.log('O aluno está presente no array.');
} else {
    console.log('O aluno não está presente no array.');
}
```

11. Crie uma função que receba um array de números e retorne a soma dos elementos pares e o produto dos elementos ímpares.

```javascript
function calcularSomaProduto(array) {
    let somaPares = 0;
    let produtoImpares = 1;

    for (let numero of array) {
        if (numero % 2 === 0) {
            somaPares += numero;
        } else {
            produtoImpares *= numero;
        }
    }

    return {
        somaPares,
        produtoImpares
    };
}

const numeros = [1, 2, 3, 4, 5];
const resultado = calcularSomaProduto(numeros);
console.log("Soma dos pares:", resultado.somaPares);
console.log("Produto dos ímpares:", resultado.produtoImpares);
```

</details>
<br>
## Links Úteis

[Voltar à Navegação](#navegação)

- [Diferenças entre HTML, CSS e JS](https://cursos.alura.com.br/course/logica-programacao-funcoes-listas/task/137213)
- [O que é o DOM?](https://www.alura.com.br/artigos/o-que-e-o-dom)
- [A função Math.random() no JavaScript na criação de números pseudoaleatórios,](https://www.alura.com.br/artigos/funcao-math-random-javascript-numeros-pseudoaleatorios)
- [Funções no JavaScript que você precisa conhecer](https://cursos.alura.com.br/extra/alura-mais/funcoes-no-javascript-que-voce-precisa-conhecer-c1503)
- [Como embaralhar arrays com o algoritmo Fisher–Yates](http://cangaceirojavascript.com.br/como-embaralhar-arrays-algoritmo-fisher-yates/)

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
Alura+ Funções no JavaScript que você precisa conhecer | Neste Alura+, o instrutor Luan Alves ensina as especificidades das funções: function declaration e function expression no JavaScript, realizando um desafio de checagem de palavras palíndromas. | [ACESSAR](https://cursos.alura.com.br/extra/alura-mais/funcoes-no-javascript-que-voce-precisa-conhecer-c1503)
Algoritmos - Teoria e Prática, Thomas H. Cormen | Este livro apresenta um texto abrangente sobre o moderno estudo de algoritmos para computadores. É uma obra clássica, cuja primeira edição tornou-se amplamente adotada nas melhores universidades em todo o mundo, bem como padrão de referência para profissionais da área. | [ACESSAR](https://books.google.com.br/books/about/Algoritmos_Teoria_e_Pr%C3%A1tica.html?id=6iA4LgEACAAJ&source=kp_book_description&redir_esc=y)
JavaScript: O Guia Definitivo | Referência completa para programadores, JavaScript: O guia definitivo fornece uma ampla descrição da linguagem JavaScript básica e das APIs JavaScript do lado do cliente definidas pelos navegadores Web. Recomendado para programadores experientes que desejam aprender a linguagem de programação da Web e para programadores JavaScript que desejam ampliar seus conhecimentos e dominar a linguagem, este é o guia do programador e manual de referência de JavaScript completo e definitivo. | [ACESSAR](https://www.amazon.com.br/JavaScript-Guia-Definitivo-David-Flanagan/dp/856583719X/ref=sr_1_1?keywords=javascript&qid=1701835643&sr=8-1&ufe=app_do%3Aamzn1.fos.6121c6c4-c969-43ae-92f7-cc248fc6181d)