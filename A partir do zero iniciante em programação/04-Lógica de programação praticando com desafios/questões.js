//AULA 01
//Condicionais com if/else
function calcularProbabilidadeAdocao() {
    let peso = document.getElementById('peso').value;
    let idade = document.getElementById('idade').value;

    let nota = 10;

    //As penalizações do peso e da idade devem ser realizadas apenas uma vez, sendo então necessário utilizar um else if e não dois ifs sequenciais

    //Dentro de cada if está sendo feito o cálculo da nova nota, entretanto esse novo valor não está sendo atribuído na variável nota

    if (peso > 20) {
        nota - 4;
    }
    if (peso > 10) {
        nota - 2;
    }

    if (idade >= 14) {
        nota - 4;
    }
    if (idade >= 8) {
        nota - 2;
    }

    return nota;
}

//AULA 02
//Variáveis e cálculos
function calcularCustoViagem(distancia, eficiencia, precoGasolina, velocidadeMedia) {
    let tempoViagem = distancia / velocidadeMedia;
    let consumoCombustivel = distancia / eficiencia;
    let custoTotal = consumoCombustivel * precoGasolina;
    return custoTotal;
}

//AULA 03
//Loops com while
function calcularDescontoTotal(quantidadeDeJogos) {
    let desconto = 0;
    let i = 0;

    while (i < quantidadeDeJogos) {
        //if (quantidadeDeJogos >= 5) {
        if (quantidadeDeJogos >= 5 && quantidadeDeJogos < 10) {
            desconto += 0.1 * 50;
        } else if (quantidadeDeJogos >= 10) {
            desconto += 0.2 * 50;
        }
        i++;
    }

    return desconto;
}

//AULA 04
//Loops com for
for (let numero = 1; numero <= 100; numero++) {
    if (numero / 5) { // if (numero%5==0)
        console.log(numero);
    }
}

