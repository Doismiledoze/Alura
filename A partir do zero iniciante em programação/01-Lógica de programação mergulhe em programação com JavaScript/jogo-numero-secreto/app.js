//alert('Olá mundo');
alert('Boas vindas ao jogo do número secreto');
let numeroMaximo = 5000;
//let numeroScreto = 29;
//let numeroScreto = parseInt(Math.random() * 100+1);
let numeroScreto = parseInt(Math.random() * numeroMaximo+1);
console.log(numeroScreto);
let chute;
let tentativas = 1;

while (chute != numeroScreto) {
    //chute = prompt('Escolha um número entre 1 e 100');
    chute = prompt(`Escolha um número entre 1 e ${numeroMaximo}`);
    if (chute == numeroScreto) {
        //console.log('Isso ai! Você descobriu o número secreto (29)')
        //alert('Isso ai! Você descobriu o número secreto (29)')
        break;
    } else {
        //alert('Você Errou :(')
        if (chute < numeroScreto) {
            alert(`O número secreto é maior que ${chute}`);
        } else {
            alert(`O número secreto é menor que ${chute}`);
        }
        //tentativas = tentativas + 1;
        tentativas++;
    }
}
let palavraTentavia = tentativas > 1 ? "tentativas" : "tentativa";
// if(tentativas >1){
//     alert(`Isso ai! Você descobriu o número secreto ${numeroScreto} com ${tentativas} tentativas!`);
// } else{
//     alert(`Isso ai! Você descobriu o número secreto ${numeroScreto} com ${tentativas} tentativa!`);
// }    
alert(`Isso ai! Você descobriu o número secreto ${numeroScreto} com ${tentativas} ${palavraTentavia}!`);
