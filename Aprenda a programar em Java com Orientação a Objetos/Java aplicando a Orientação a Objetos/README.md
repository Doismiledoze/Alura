# Java: aplicando a Orientação a Objetos

- Aprenda os conceitos da Orientação a Objetos utilizando o Java
- Modele abstrações da aplicação via classes, atributos e métodos
- Utilize herança como mecanismo de reaproveitamento de código
- Aplique polimorfismo para tornar o código do projeto flexível
- Entenda como utilizar interfaces para padronização de métodos

## Navegação

[Projeto](#projeto)

[Módulos](#módulos)

[Exercícios Extras](#exercícios-extras)

[Links Úteis](#links-úteis)

[Dicas](#dicas)

[Referências](#referências)

## Projeto

[Voltar à Navegação](#navegação)

- [Screen Match]()
- [Minhas Musicas]()
- [Desafios]()

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Modelando o ScreenMatch | <ul><li>O que é uma classe, sua estrutura, como criar e por que isso é um conceito fundamental na orientação a objetos;</li><li>O que são atributos: as "características" de um objeto, e a definir e visualizar esses valores;</li><li>A instanciar objetos;</li><li>Sobre os métodos (ou comportamentos) de um objeto;</li><li>A pensar nas entidades do mundo real em forma de objetos, que possuem características (atributos) e comportamentos ou ações (métodos).</li></ul>
Controlando o acesso e a escrita nos dados da aplicação | <ul><li>Encapsulamento: controlar o acesso aos atributos e métodos de uma classe;</li><li>O que são os modificadores de acesso public e private;</li><li>Métodos de leitura dos atributos, que são os métodos getters;</li><li>Métodos de modificação dos atributos, que são os métodos setters;</li><li>O uso da palavra chave import, para importar classes de outros pacotes;</li><li>O uso da palavra chave this;</li><li>Boas práticas de dividir o código em pacotes, bem como a convenção usada: domínio da empresa ao contrário, onde aqui vamos colocar por exemplo br.com.alura.screenmatch.</li></ul>
Reaproveitando características e comportamentos | <ul><li>O problema de ter códigos duplicados em várias classes, utilizando a herança como solução;</li><li>A palavra-chave extends, utilizada para indicar que uma classe herda de outra;</li><li>Como sobrescrever um método sendo herdado, com o uso opcional da anotação @Override;</li><li>Como aplicar o conceito de polimorfismo no código, evitando métodos duplicados.</li></ul>
Aplicando comportamentos em comum | <ul><li>Que no Java uma classe pode herdar de somente uma única classe;</li><li>O conceito de interfaces no Java;</li><li>Que numa interface todos os métodos são públicos, não sendo então necessário utilizar a palavra reservada public na declaração deles;</li><li>Que também é possível aplicar o polimorfismo com o uso de interfaces, similar ao que foi demonstrado com a utilização da herança em aulas anteriores.</li></ul>
Consolidando conhecimentos | <ul><li>A aplicar seus conhecimentos em uma aplicação de um sistema de músicas, utilizando conceitos de orientação a objetos, encapsulamento, herança e polimorfismo.</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

<details>
    <summary>Modelando o ScreenMatch</summary>

1. Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.

   ```Java
    //Classe Pessoa
    public class Pessoa {

        void saudacao() {
            System.out.println("Olá, mundo!");
        }
    }

    //Classe Principal
    public class Principal {

        public static void main(String[] args) {
        
            Pessoa pessoa = new Pessoa();
            pessoa.saudacao();
        }
    }

    ```

2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.

   ```java
    //Classe Calculadora
    public class Calculadora {

        public int dobrarNumero(int numero) {
            return numero * 2;
        }
    }

    //Classe Principal
    public class Principal {

        public static void main(String[] args) {
        
            Calculadora calculadora = new Calculadora();
            int resultado = calculadora.dobrarNumero(5);
            System.out.println(resultado);
        }
    }
   ```

3. Crie uma classe Musica  com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

   ```java
   //Classe Musica
    public class Musica {
        String titulo;
        String artista;
        int anoLancamento;
        double somaDasAvaliacoes;
        int numAvaliacoes;

        void exibeFichaTecnica() {
            System.out.println("Título da música: " + titulo);
            System.out.println("Artista: " + artista);
            System.out.println("Ano de lançamento: " + anoLancamento);
        }

        void avalia(double nota) {
            somaDasAvaliacoes += nota;
            numAvaliacoes++;
        }

        double pegaMedia() {
            return somaDasAvaliacoes / numAvaliacoes;
        }
    }

    //Classe Principal
    public class Principal {
        public static void main(String[] args) {
            Musica minhaMusica = new Musica();

            minhaMusica.titulo = "Nome da Música";
            minhaMusica.artista = "Nome do Artista";
            minhaMusica.anoLancamento = 2023;

            minhaMusica.exibeFichaTecnica();

            minhaMusica.avalia(4.5);
            minhaMusica.avalia(3.8);
            minhaMusica.avalia(5.0);

            double mediaAvaliacoes = minhaMusica.pegaMedia();
            System.out.println("Média das avaliações: " + mediaAvaliacoes);
        }
    }
   ```

4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

   ```java
   //Classe Carro
    public class Carro {
        String modelo;
        int ano;
        String cor;

        void exibeFichaTecnica() {
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cor: " + cor);
        }

        int calculaIdade() {
            return 2023 - ano;
        }
    }

    //Classe Principal
    public class Principal {
        public static void main(String[] args) {
            Carro meuCarro = new Carro();
            meuCarro.modelo = "Gol";
            meuCarro.ano = 2023;
            meuCarro.cor = "Preto";

            // Exibir ficha técnica
            meuCarro.exibeFichaTecnica();

            // Calcular idade do carro
            System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
        }
    }
   ```

5. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

   ```java
   //Classe Aluno
    public class Aluno {
        String nome;
        int idade;

        void exibeInformacoes() {
            System.out.println("Nome do aluno: " + nome);
            System.out.println("Idade do aluno: " + idade);
        }
    }

    //Classe Principal
    public class Principal {
        public static void main(String[] args) {
            Aluno meuAluno = new Aluno();
            meuAluno.nome = "Akemi";
            meuAluno.idade = 18;

            meuAluno.exibeInformacoes();
        }
    }
   ```

</details>

<details>
<summary>Controlando o acesso e a escrita nos dados da aplicação</summary>

1. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

```java
//Classe ContaBancaria
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

//Classe Principal
public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.titular = "João";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
    }
}
```

2. Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

```java
//Classe idadePessoa
public class idadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " não é maior de idade.");
        }
    }
}

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carowl");
        pessoa1.setIdade(22);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Camila");
        pessoa2.setIdade(20);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
    }
}
```

3. Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

```java
//Classe Produto
public class Produto {
    private String nome;
    private double preco;
    
     public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }
}

//Classe Principal
public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());
    }
}
```

4. Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

```java
//Classe Aluno
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    
      public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
}


//Classe Principal
public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
        Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
    }
}

```

5. Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

```java
//Classe Livro
public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
```

</details>

<details>
<summary>Reaproveitando características e comportamentos</summary>

1. Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

```java
// Classe Carro
public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    private double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }
}

// Subclasse ModeloCarro
public class ModeloCarro extends Carro {
    // Pode adicionar propriedades específicas do modelo se necessário
}

// Classe de Teste
public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}
```

2. Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

```java
// Classe Animal
public class Animal {
    public void emitirSom() {
        System.out.println("Som do animal");
    }
}

// Subclasse Cachorro
public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}

// Subclasse Gato
public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranhando móveis");
    }
}

// Classe de Teste
public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
```

3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

```java
//Classe ContaBancaria
public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}

//Subclasse ContaCorrente
public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}

//Classe Teste
public class TesteContaBancaria {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de 1000
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        // Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}
```

4. Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.

```java
public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limiteSuperior) {
        System.out.println("Números primos até " + limiteSuperior + ": ");
        for (int i = 2; i <= limiteSuperior; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// Subclasse VerificadorPrimo
public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}

// Subclasse GeradorPrimo
public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}

// Classe de Teste
public class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
```

</details>

<details>
<summary>Aplicando comportamentos em comum</summary>

1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

```java
// Interface ConversaoFinanceira
public interface ConversaoFinanceira {
    void converterDolarParaReal(double valorDolar);
}

// Classe ConversorMoeda implementando ConversaoFinanceira
public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}

// Classe de Teste
public class TesteConversorMoeda {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50); // Exemplo com o valor em dólar
    }
}
```

2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

```java
// Interface CalculoGeometrico
public interface CalculoGeometrico {
    void calcularArea(double altura, double largura);
    void calcularPerimetro(double altura, double largura);
}

// Classe CalculadoraSalaRetangular implementando CalculoGeometrico
public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é: " + perimetro);
    }
}

// Classe de Teste
public class TesteCalculadoraSalaRetangular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 8); // Exemplo com altura e largura
        calculadora.calcularPerimetro(5, 8);
    }
}
```

3. Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

```java
// Interface Tabuada
public interface Tabuada {
    void mostrarTabuada(int numero);
}

// Classe TabuadaMultiplicacao implementando Tabuada
public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada de multiplicação do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

// Classe de Teste
public class TesteTabuadaMultiplicacao {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7); // Exemplo com o número 7
    }
}
```

4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

```java
// Interface ConversorTemperatura
public interface ConversorTemperatura {
    double celsiusParaFahrenheit(double temperaturaCelsius);

    double fahrenheitParaCelsius(double temperaturaFahrenheit);
}

// Classe ConversorTemperaturaPadrao implementando ConversorTemperatura
public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}

// Classe de Teste
public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
    }
}
```

5. Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

```java
public interface Calculavel {
    double calcularPrecoFinal();
}

public class Livro extends Produto implements Calculavel {
    private String autor;

    public double calcularPrecoFinal() {
        return preco * 0.9; 
    }
}

public class ProdutoFisico extends Produto implements Calculavel {
    public double calcularPrecoFinal() {
        // Implementação com taxas adicionais para produtos físicos
        return preco * 1.05; 
    }
}
```

6. Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

```java
// Interface Vendavel
public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}

// Classe Produto
public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }
}

// Classe Servico
public class Servico implements Vendavel {
    private String descricao;
    private double precoHora;

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}
```

</details>

## Links Úteis

[Voltar à Navegação](#navegação)

- [A documentação do Java](https://docs.oracle.com/en/java/javase/17/docs/api/index.html)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
-------------|-----------|----------
TechGuide: Orientação a Objetos – Hipsters Ponto Tech #350 | Podcast que discute a orientação a objetos, paradigma essencial em muitas linguagens de programação. O episódio abrange tópicos como encapsulamento, abstração, polimorfismo e muito mais. | [ACESSAR](https://www.hipsters.tech/praticas-de-orientacao-a-objetos-hipsters-129/)
Orientação a Objetos: aprenda seus conceitos e suas aplicabilidades de forma efetiva | O livro apresenta conceitos de orientação a objetos para utilizar da forma mais eficiente. Por meio de exemplos, visa as boas práticas do uso para tornar o processo de desenvolvimento mais produtivo. | [ACESSAR](https://www.casadocodigo.com.br/products/livro-oo-conceitos)
Orientação a objetos com Roberta Arcoverde | Vídeo que apresenta os conceitos fundamentais sobre a utilização de orientação a objeto e suas aplicações.                                        | [ACESSAR](https://www.youtube.com/watch?v=jpuJ1qrluoU)
Java e orientação a objetos | A apostila oferece uma exploração detalhada dos conceitos de orientação a objetos em Java, começando desde os primeiros passos e incluindo diversos exercícios práticos para reforçar o aprendizado. | [ACESSAR](https://www.alura.com.br/apostila-java-orientacao-objetos)
POO: O que é programação orientada a objetos? | Este artigo faz uma introdução à Programação Orientada a Objetos (POO) e a compara com a programação estruturada, utilizando exemplos de código em linguagens como Python e Java. | [ACESSAR](https://www.alura.com.br/artigos/poo-programacao-orientada-a-objetos)