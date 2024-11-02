# Java: criando a sua primeira aplicação

- Crie um projeto Java com o IntelliJ
- Aprenda sobre o processo de compilação e execução de uma aplicação Java
- Conheça os principais tipos de dados
- Utilize o Scanner para leitura de dados
- Controle o fluxo da aplicação com o uso de condicionais e loops

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Primeiro Projeto]()
- [Screen Match]()
- [Desafios]()
- [Desafio Conta Bancária]()

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Primeiro programa em Java | <ul><li>A configurar o ambiente de desenvolvimento, instalando a JDK 17 e a IDE IntelliJ;</li><li>As diferenças entre JVM, JRE e JDK:<ul><li>JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode;</li><li>JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu programa;</li></ul></li><li>JDK (Java Development Kit) - Kit de Desenvolvimento Java responsável por compilar código-fonte em bytecode.</li><li>A fazer o “Alô Mundo!” no Java e executar seu primeiro programa pelo IntelliJ;</li></ul>
Construindo o catálogo de filmes | <ul><li>A trabalhar com variáveis: recurso utilizado para armazenar valores em memória;</li><li>Sobre tipos primitivos:<ul><li>inteiros (byte, short, int, long);</li><li>ponto flutuante (double e float);</li><li>char: contém um único caractere;</li><li>boolean: recebe 2 valores, true ou false;</li></ul></li><li>Como representar textos em Java, utilizando a classe String;</li><li>A realizar casting de valores, para resolver situações de tipos incompatíveis no momento de realizar um cálculo ou atribuição de uma variável.</li></ul>
Controlando o fluxo da aplicação | <ul><li>A configurar uma aplicação para que ela escolha entre executar uma ação ou outra baseada em algum elemento;</li><li>Comparações para as condicionais: igual, diferente, maior, menor;</li><li>A usar a leitura do teclado com a classe Scanner;</li><li>Trabalhar com alternativas para as condicionais e escolher a ideal para o caso escolhido;</li><li>A utilizar estruturas de repetição com for e while.</li></ul>
Consolidando conhecimentos | <ul><li>A aplicar seus conhecimentos em uma aplicação de um sistema bancário, utilizando conceitos de variáveis, condicionais, loops e leitura de dados no Java, juntamente à lógica de programação.</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

<details>
<summary>Primeiro programa em Java</summary>

1. Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".

```Java
public class Perfil{

    public static void main(String[] args) {
        System.out.println("Olá, Nome");
    }

}
```

2. Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".

```Java
public class Perfil{

    public static void main(String[] args) {
        System.out.println("Olá, Nome");
        System.out.println("Tudo bem?");
    }

}
```

3. Crie uma classe chamada Estudos para imprimir anotações de estudos no console.

```Java
public class Estudos{

    public static void main(String[] args) {
        System.out.println("JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu program");
    }

}
```

4. Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".

```Java
public class Soma{

    public static void main(String[] args) {
        System.out.println(10 + 5);
    }
}
```

5. Crie uma classe Subtracao para imprimir o resultado de 10 - 5 no console.

```Java
public class Subtracao{

    public static void main(String[] args) {
        System.out.println(10 - 5);
    }
}
```

</details>

<details>
<summary>Construindo o catálogo de filmes</summary>

1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.

```Java
public class Media{
    public static void main(String[] args) {
        double nota1 = 8.9;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);
    }
}
```

2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

```Java
public class Casting{
    public static void main(String[] args) {
        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble;
        System.out.println("Casting de double para int: " + numeroInteiro);
    }
}
```

3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

```Java
public class Palavras{
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = "MARELO";

        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

        System.out.println(mensagem);
    }
}
```

4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

```Java
public class Produto{
    public static void main(String[] args) {
        double precoProduto = 29.99;
        int quantidade = 3;

        double total = precoProduto * quantidade;

        String mensagem = "O valor total da compra é R$" + total;

        System.out.println(mensagem);
    }
}
```

5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

```Java
public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 100.50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);
    }
}
```

6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

```Java
public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}
```

</details>

<details>
<summary>Controlando o fluxo da aplicação</summary>

1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

```Java
import java.util.Scanner;

public class PositivoNegativo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
```

2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

```Java
import java.util.Scanner;

public class Comparacao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
}
```

3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

```Java
import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio; 
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
```

4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

```Java
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
```

5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

```Java
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
```

6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

```Java
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
```

</details>

## Links Úteis

[Voltar à Navegação](#navegação)

- [Java: o que é, linguagem e um Guia para iniciar na tecnologia](https://www.alura.com.br/artigos/java)
- [IntelliJ IDEA: dicas e truques para usar no dia a dia](https://www.alura.com.br/artigos/intellij-idea-dicas-truques-usar-no-dia-a-dia)
- [JVM: conhecendo o processo de execução de código](https://www.alura.com.br/artigos/jvm-conhecendo-processo-execucao-de-codigo)
- [Classe Scanner](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
------------|-----------|--------
O que é Java? \| AWS | Neste conteúdo da AWS (Amazon Web Services), é oferecido uma explicação sobre o que é a linguagem de programação Java, os aspectos gerais, suas características e em que podemos usar. | [ACESSAR](https://aws.amazon.com/pt/what-is/java/)
O que é o Java? #HipstersPontoTube | Neste vídeo, Roberta e Paulo debatem sobre suas experiências com essa linguagem querida. Entre as perguntas respondidas no vídeo, estão: é fácil de aprender? Como é programar em Java? | [ACESSAR](https://www.youtube.com/watch?v=90NcVNsKGik)
Java: o que é, linguagem e um Guia para iniciar na tecnologia | Artigo completo que oferece uma visão abrangente sobre o Java, desde o que é a linguagem até um guia para iniciar na tecnologia. | [ACESSAR](https://www.alura.com.br/artigos/java)
Java: Conheça o método main | Este artigo se concentra em um aspecto específico do Java: o método main. O conteúdo explora detalhes sobre esse método crucial em programas Java, explicando sua importância e como utilizá-lo adequadamente | [ACESSAR](https://www.alura.com.br/artigos/metodo-main-em-java)
O que um arquivo .java precisa para compilar? | Este artigo aborda os requisitos necessários para compilar um arquivo .java. Explora os elementos essenciais que devem estar presentes no código-fonte para que o processo de compilação seja bem-sucedido. | [ACESSAR](https://www.alura.com.br/artigos/o-que-um-arquivo-java-precisa-para-compilar)
