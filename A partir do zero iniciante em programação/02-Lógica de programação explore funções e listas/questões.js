//AULA 01
//Manipulando conteúdo HTML com JavaScript
let titulo = document.querySelector('h1');
titulo.innerHTML = 'Bem-vindo ao mundo dev';

//AULA 02
//Função que verifica números
function verificarNumero(numero) {
    if (numero > 0) {
      console.log("O número é positivo.");
    } else if (numero < 0) {
      console.log("O número é negativo.");
    } else {
      console.log("O número é zero.");
    }
  }

//AULA 03
//Calculadora de Média e Situação do Aluno
let nota1 = 7;
let nota2 = 6;
let nota3 = 3;
let nota4 = 5;

function verificarAprovacao(media) {
    return media >= 5 ? "Aprovado" : "Reprovado";
}

function calcularMedia(nota1, nota2, nota3, nota4) {
    let media = (nota1 + nota2 + nota3 + nota4) / 4;
    return media;
  }