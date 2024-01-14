//AULA 01
// No projeto Alugames, implemente uma confirmação de devolução.
//IMPLEMENTADO
// No projeto Alugames, crie uma função para imprimir no console a informação sobre quantos jogos foram alugados.
//IMPLEMENTADO
// Crie um programa que verifica se uma palavra ou frase é um palíndromo.
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
// Crie um programa com uma função que receba três números como argumentos e os retorne em ordem crescente. Exiba os números ordenados.
function ordenarNumeros(a, b, c) {
    const numerosOrdenados = [a, b, c].sort((x, y) => x - y);
    console.log(`Números ordenados: ${numerosOrdenados.join(', ')}`);
}

// Exemplo de uso:
ordenarNumeros(3, 1, 5); // Deve exibir "Números ordenados: 1, 3, 5"

//AULA 02
// Adicione validações no código para garantir que o usuário só consiga adicionar produtos ao carrinho se tiver selecionado um produto válido e inserido uma quantidade válida. Se a entrada não for válida, exiba uma mensagem de erro apropriada.
//IMPLEMENTADO
// Crie um formulário simples com campos de entrada e utilize JavaScript para recuperar os valores digitados nos campos usando a propriedade value. Exiba os valores no console e na tela.
/*
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
*/
function capturarValores() {
    const nome = document.getElementById('campoNome').value;
    const idade = document.getElementById('campoIdade').value;

 document.getElementById('mostraNome').textContent = `Nome: ${nome}, Idade: ${idade}`;
    console.log(`Nome: ${nome}, Idade: ${idade}`);
}

// Tenha um elemento HTML na página (por exemplo, um parágrafo) e utilize JavaScript para modificar seu conteúdo usando a propriedade textContent.
/*
<html>
    <body>
<p id="meuParagrafo">Texto original</p>
<button onclick="modificarConteudo()">Modificar Conteúdo</button>

<script src="script.js"></script>
  </body>
</html>
*/
function modificarConteudo() {
    const paragrafo = document.getElementById('meuParagrafo');
    paragrafo.textContent = 'Novo texto modificado dinamicamente!';
}

// Faça a soma de duas variáveis numéricas e apresente no console com uma mensagem amigável em Template String.
const numero1 = 10;
const numero2 = 20;

const soma = numero1 + numero2;
const mensagem = `A soma de ${numero1} e ${numero2} é ${soma}.`;

console.log(mensagem);

// Receba, no mínimo, duas sentenças como uma string e utilize split() para quebrá-la em frases menores com base em um ponto e vírgula como delimitador.
const duasSentencas = "Criar o que não existe ainda deve ser a pretensão de todo sujeito que está vivo; A tarefa mais importante de uma pessoa que vem ao mundo é criar algo"
const frasesSeparadas = duasSentencas.split(';');

console.log(frasesSeparadas);

// Receba uma string contendo números separados por vírgulas. Utilize split() para separar os números e exibi-los no console.
const numerosSeparados = "10,20,30,40,50";
const arrayNumeros = numerosSeparados.split(',');
console.log(arrayNumeros);

//AULA 03
// Adicione uma verificação para garantir que a quantidade inserida pelo usuário seja um número positivo. Se o valor não for válido, exiba uma mensagem de erro adequada.
//IMPLEMENTADO
// Crie uma função que aceite uma string como parâmetro, utilize a função parseInt para converter essa string em um número inteiro e retorne o resultado.
function converterParaInteiro(valorString) {
    return parseInt(valorString);
}

// Exemplo de uso
let valorString = "42";
let valorInteiro = converterParaInteiro(valorString);
console.log(valorInteiro);  // Saída esperada: 42

// Escreva um programa de calculadora simples com funções separadas para adição, subtração, multiplicação e divisão. Utilize um bloco condicional para determinar qual função executar com base em uma variável que representa a operação desejada.
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

// Exemplo de uso
let resultado = calculadora('soma', 5, 3);
console.log(resultado);  // Saída esperada: 8

// Implemente uma função que aceite um número como parâmetro e utilize um bloco condicional para determinar se o número é par ou ímpar.
function verificarParOuImpar(numero) {
    if (numero % 2 === 0) {
        return "Par";
    } else {
        return "Ímpar";
    }
}

// Exemplo de uso
let numero = 7;
let resultadoParOuImpar = verificarParOuImpar(numero);
console.log(resultadoParOuImpar);  // Saída esperada: Ímpar

// Crie uma função que converta a temperatura de Celsius para Fahrenheit e vice-versa. Utilize uma variável para indicar a escala desejada e um bloco condicional para determinar qual conversão realizar
function converterTemperatura(valor, escala) {
    if (escala.toLowerCase() === 'celsius') {
        return (valor * 9/5) + 32;  // Celsius para Fahrenheit
    } else if (escala.toLowerCase() === 'fahrenheit') {
        return (valor - 32) * 5/9;  // Fahrenheit para Celsius
    } else {
        return "Escala inválida";
    }
}

// Exemplo de uso
let temperaturaCelsius = 25;
let temperaturaFahrenheit = converterTemperatura(temperaturaCelsius, 'celsius');
console.log(temperaturaFahrenheit);  // Saída esperada: 77

//AULA 04
// Criar uma funcionalidade no Projeto Amigo Secreto que permita ao usuário clicar em um amigo na lista e removê-lo. Atualizar a visualização da lista após a remoção.
//IMPLEMENTADO
// Adicione os números 1,2,3 em uma variável chamada minhaLista e armazene os números 4, 5 e 6 separadamente em outra variável. Use o método concat() para combinar as sequências de valores em uma nova lista chamadanovaLista. Imprima novaLista no console.
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

// Remova o último elemento de novaLista. Imprima novaLista após a remoção.
// Removendo o último elemento
novaLista.pop();
console.log("Desafio 4:", novaLista);

// Utilize o algoritmo de Fisher-Yates (também conhecido como Knuth Shuffle) para embaralhar os elementos em novaLista. Pesquise e adapte o código para realizar o embaralhamento.
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
  
// Crie uma função chamada removerDuplicatas que aceita um array como parâmetro e retorna um novo array sem elementos duplicados. Teste a função com novaLista e imprima o array resultante.
// Função para remover duplicatas de um array
function removerDuplicatas(array) {
    return [...new Set(array)];
  }
  
  // Testando a função com novaLista
  let novaListaSemDuplicatas = removerDuplicatas(novaLista);
  console.log("Remover duplicatas:", novaListaSemDuplicatas);
  
  //AULA 05
//   Crie uma função que valide se um número é positivo, negativo ou zero.
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

// Implemente uma função que verifique se uma pessoa é maior de idade.
function verificarIdade(idade) {
    return idade >= 18 ? "Maior de idade" : "Menor de idade";
}

console.log(verificarIdade(18))

// Desenvolva uma função que valide se uma string é vazia ou não.
function validarString(texto) {
    return texto === "" ? "String vazia" : "String não vazia";
}

console.log(validarString("Aqui há um texto?"))
console.log(validarString(""))

// Crie uma função que determine se um ano é bissexto
function verificarAnoBissexto(ano) {
    if ((ano % 4 === 0 && ano % 100 !== 0) || ano % 400 === 0) {
        return "Ano bissexto";
    } else {
        return "Não é bissexto";
    }
}

console.log(verificarAnoBissexto(2025))

// Implemente uma função que calcule a média de dois números, interrompendo a execução se algum dos números não for válido.
function calcularMedia(num1, num2) {
    if (isNaN(num1) || isNaN(num2)) {
        return "Um dos números não é válido.";
    }
    return (num1 + num2) / 2;
}

console.log(calcularMedia(8,5))

// Desenvolva uma função que receba um array como parâmetro e retorne o seu tamanho.
function obterTamanhoArray(arr) {
    return arr.length;
}

//exemplo de uso

const minhaLista = [1,2,3,4,5,6,7,8,9,10]

console.log(obterTamanhoArray(minhaLista))

// Crie um array e utilize a função includes para verificar se um elemento específico está presente

const meuArray = [10, 20, 30, 40, 50];
console.log("O array contém o número 30?", meuArray.includes(30));
//saída esperada: "O array contém o número 30?" true

// Implemente uma função que receba um array e um elemento, e retorne se o elemento está presente no array.
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

// Crie um array de strings e utilize includes para verificar se uma determinada string está presente.
const palavras = ["apple", "banana", "orange", "grape"];
console.log("A palavra 'banana' está no array?", palavras.includes("banana"));

//saída esperada: "A palavra 'banana' está no array?" true

// Desenvolva uma função que receba um array de objetos representando estudantes de um curso e um objeto que representa um estudante procurado. Depois retorne se o objeto está presente no array.
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

// Crie uma função que receba um array de números e retorne a soma dos elementos pares e o produto dos elementos ímpares.
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

