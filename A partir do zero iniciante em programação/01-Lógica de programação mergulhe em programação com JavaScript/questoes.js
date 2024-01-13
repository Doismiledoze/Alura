//Alert e prompt
let mensagemDeBoasVindas = 'Boas vindas ao App';
alert('mensagemDeBoasVindas'); //variável está sendo passada como texto
//------------------------

//Alterando o valor das variáveis
alert('Boas vindas ao jogo do número secreto')
let chute = prompt('Escolha um número entre 1 e 10')

let numeroSecreto = 4 //Alterar esta variável para mudar o número do jogo

if (chute == numeroSecreto) {
    alert('Acertou')
}
//------------------------

//Onde está o bug?
let senhaDoSistema = "senhaTeste!";

let senha = prompt("Digite a senha do sistema:");

if (senha = senhaDoSistema) { //Usou o '=' ao invés de '==' para comparar valores
    alert("Acesso ao sistema garantido");
}
//------------------------

//Alterando a mensagem do alert
alert('Bem-vindo ao jogo do número secreto')
let chute = prompt('Escolha um número entre 1 e 10')

let numeroSecreto = 4

console.log(chute == numeroSecreto)
if (chute == numeroSecreto) {
    alert('Acertou')
} else {
    alert('O número secreto era ' + numeroSecreto)
    //alert('O número secreto era ' + numeroSecreto + ', mas você escolheu ' + chute);
}
//------------------------

//Detran
let idade = prompt("Digite sua idade:");

if (idade >= 18) { //Se idade for maior ou igual a 18
    console.log("Você é maior de idade.");
} else { //Se não
    console.log("Você é menor de idade.");
}
//------------------------

//Trabalhando com condicionais
let porcentagemDesconto = 0;

if (quantidadeMilhas > 5000) {
    porcentagemDesconto = porcentagemDesconto + 10;
}

if (quantidadeMilhas > 30000) { //Antes do if deveria haver um else
    porcentagemDesconto = porcentagemDesconto + 20;
} else {
    porcentagemDesconto = 0;
}
//------------------------

//Contador 1
let contador = 1;

while (contador < 4) { //Vai executar enquanto o contador for de 1 a 3
    console.log('Executando a iteração ' + contador);
    contador = contador + 1;
}
//------------------------

//Loop infinito
let qtdNumeros = prompt('Digite a quantidade de números para o cálculo da média:');
let soma = 0;
let contador = qtdNumeros;

while (contador > 0) { //Condição nunca fica inválida
    let numero = parseInt(prompt('Digite o numero:'));
    soma += numero;
}

let media = soma / qtdNumeros;

console.log(media);
//------------------------

//Número aleatórios
parseInt(Math.random() * 3 + 1) //Número entre 1 e 3

//Operador ternário
//let palavraPessoa = "";
// if(quantidadePessoas == 1){
//     palavraPessoa = "pessoa";
// }else{
//     palavraPessoa = "pessoas"
// }
let palavraPessoa = quantidadePessoas == 1 ? "pessoa" : "pessoas";



