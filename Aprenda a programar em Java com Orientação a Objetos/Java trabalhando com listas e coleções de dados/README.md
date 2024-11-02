# Java: trabalhando com listas e coleções de dados

- Aprenda a representar uma lista de objetos em Java
- Entenda o funcionamento da classe ArrayList do Java
- Manipule uma lista de objetos
- Realize ordenação de uma lista de acordo com algum critério
- Faça casting de objetos e verificação de tipo com instanceof

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
- [Compras]()
- [Desafios]()

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Coleção de filmes | <ul><li>Como representar listas de objetos no Java, com a utilização da classe ArrayList;</li><li>A manipular um ArrayList com seus métodos add, size e get;</li><li>Os diferentes tipos de classes do Java para representar uma lista;</li><li>Como funciona o método toString(), utilizado para representar um objeto em texto.</li></ul>
Construindo objetos | <ul><li>A passar parâmetros ao instanciar objetos, com a utilização de construtores;</li><li>Como funciona o construtor default (padrão) no Java;</li><li>Como declarar construtores em uma classe;</li><li>A chamar o construtor da classe mãe, com a palavra reservada super.</li></ul>
Lista de objetos distintos | <ul><li>A percorrer um ArrayList com um loop foreach;</li><li>A realizar o casting de um objeto, convertendo-o para outro tipo compatível;</li><li>Como verificar se um objeto é de um determinado tipo, com o uso da palavra reservada instanceof.</li></ul>
Ordenando dados | <ul><li>Como ordenar uma lista no Java, via método Collections.sort;</li><li>Que para ordenar objetos que são de classes do nosso projeto, com a classe Titulo, devemos implementar nela a interface Comparable;</li><li>Como implementar corretamente o método compareTo, da interface Comparable, para que o Java faça a ordenação correta dos elementos de uma lista;</li><li>Que podemos flexibilizar a ordenação de uma lista, via método sort da própria interface List, passando como parâmetro um critério de ordenação;</li><li>Que a classe ArrayList implementa a interface List, sendo que essa interface possui outras implementações, como a classe LinkedList;</li><li>Que podemos declarar a variável de uma lista utilizando a interface List, ganhando com isso o polimorfismo com a flexibilidade de trocar facilmente a implementação sendo instanciada.</li></ul>
Consolidando conhecimentos | <ul><li>A aplicar seus conhecimentos em uma aplicação de um sistema de compras, utilizando conceitos de listas e ordenação.</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

<details>
<summary>Coleção de filmes</summary>
1. Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.

```java
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }
}
```

2. No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.

```java
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    }
}
```

3. Adicione pelo menos três pessoas à lista utilizando o método add.

```java
Pessoa pessoa1 = new Pessoa("Akemi", 18);
Pessoa pessoa2 = new Pessoa("Rodrigo", 30);
Pessoa pessoa3 = new Pessoa("Caroline", 35);

listaDePessoas.add(pessoa1);
listaDePessoas.add(pessoa2);
listaDePessoas.add(pessoa3);
```

4. Imprima o tamanho da lista utilizando o método size.

```java
System.out.println("Tamanho da lista: " + listaDePessoas.size());
```

5. Imprima a primeira pessoa da lista utilizando o método get.

```java
System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));
```

6. Imprima a lista completa.

```java
System.out.println("Lista de Pessoas:");
for (Pessoa pessoa : listaDePessoas) {
    System.out.println(pessoa);
}
```

</details>

<details>
<summary>Construindo objetos</summary>

1. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

```java
import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());
    }
}
```

2. Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println().

```java
public class Produto {

    // ... 

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        // …
 
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }
    }
}
```

3. Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.

```java
public class Produto {
    // ... 

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        Produto produtoNovo = new Produto("Novo Produto", 15.99, 3);
        System.out.println(produtoNovo);
    }
}
```

4. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.

```java
public class ProdutoPerecivel extends Produto {
    String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);
    }
}
```

</details>

<details>
<summary>Lista de objetos distintos</summary>

1. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.

   ```java
   import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            ArrayList<String> listaStrings = new ArrayList<>();
            listaStrings.add("Java");
            listaStrings.add("C++");
            listaStrings.add("Python");

            for (String elemento : listaStrings) {
                System.out.println(elemento);
            }
        }
    }
   ```

2. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.

   ```java
    class Animal {
        // Propriedades e métodos 
    }

    class Cachorro extends Animal {
        // Propriedades e métodos 
    }

    public class Main {
        public static void main(String[] args) {
            Cachorro cachorro = new Cachorro();
            Animal animal = (Animal) cachorro;
        }
    }
   ```

3. Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.

   ```java
    class Animal {
        // propriedades e métodos comuns 
    }

    class Cachorro extends Animal {
        // propriedades e métodos do cachorro
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal = new Cachorro();

            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                // Agora você pode usar o objeto 'cachorro' como um Cachorro.
            } else {
                System.out.println("O objeto não é um Cachorro.");
            }
        }
    }
   ```

4. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

   ```java
    import java.util.ArrayList;

    class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Produto produto1 = new Produto("Ar condicionado", 2000.0);
            Produto produto2 = new Produto("Aquecedor", 800.0);
            Produto produto3 = new Produto("Ventilador", 150.0);

            ArrayList<Produto> listaProdutos = new ArrayList<>();
            listaProdutos.add(produto1);
            listaProdutos.add(produto2);
            listaProdutos.add(produto3);

            double somaPrecos = 0;
            for (Produto produto : listaProdutos) {
                somaPrecos += produto.getPreco();
            }

            double precoMedio = somaPrecos / listaProdutos.size();
            System.out.println("Preço médio dos produtos: " + precoMedio);
        }
    }
   ```

5. Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.

   ```java
    interface Forma {
        double calcularArea();
    }

    class Circulo implements Forma {
        double raio;

        @Override
        public double calcularArea() {
            return Math.PI * raio * raio;
        }
    }

    class Quadrado implements Forma {
        double lado;

        @Override
        public double calcularArea() {
            return lado * lado;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Circulo circulo = new Circulo();
            circulo.raio = 5;

            Quadrado quadrado = new Quadrado();
            quadrado.lado = 4;

            // Lista de formas
            ArrayList<Forma> listaFormas = new ArrayList<>();
            listaFormas.add(circulo);
            listaFormas.add(quadrado);

            // Calcular e imprimir a área de cada forma
            for (Forma forma : listaFormas) {
                System.out.println("Área: " + forma.calcularArea());
            }
        }
    }
   ```

6. Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

   ```java
    import java.util.ArrayList;

    class ContaBancaria {
        private int numeroConta;
        private double saldo;

        public ContaBancaria(int numeroConta, double saldo) {
            this.numeroConta = numeroConta;
            this.saldo = saldo;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public class Main {
        public static void main(String[] args) {
            ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
            ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
            ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

            ArrayList<ContaBancaria> listaContas = new ArrayList<>();
            listaContas.add(conta1);
            listaContas.add(conta2);
            listaContas.add(conta3);

            ContaBancaria contaMaiorSaldo = listaContas.get(0);
            for (ContaBancaria conta : listaContas) {
                if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                    contaMaiorSaldo = conta;
                }
            }

            System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                    ", Saldo: " + contaMaiorSaldo.getSaldo());
        }
    }
   ```

</details>

<details>
<summary>Ordenando dados</summary>

1. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);
    }
}
```

2. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

```java
public class Titulo implements Comparable<Titulo> {
    String nome;

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
```

3. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("A"));
        listaTitulos.add(new Titulo("B"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);
        }
    }
}
```

4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);
    }
}
```

5. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.

```java
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
```

</details>

## Links Úteis

[Voltar à Navegação](#navegação)

- [JavaDoc de ArrayList](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html)
- [Ordenando coleções com Comparable e Comparator](https://www.alura.com.br/artigos/ordenando-colecoes-com-comparable-e-comparator)
- [Estruturas de dados: uma introdução](https://www.alura.com.br/artigos/estruturas-de-dados-introducao)
- [Estrutura de Dados: computação na prática com Java](https://www.alura.com.br/artigos/estrutura-dados-computacao-na-pratica-com-java)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
------------|-----------|--------
Estrutura de Dados: computação na prática com Java | Este artigo contém as principais estruturas de dados na prática com Java: listas, listas ligadas, listas duplamente ligadas, pilhas e filas. Ele oferece exemplos valiosos sobre como implementar e utilizar estruturas de dados eficientes para otimizar o desempenho de seus programas. | [ACESSAR](https://www.alura.com.br/artigos/estrutura-dados-computacao-na-pratica-com-java)
Algoritmos e estrutura de dados - Hipsters #186 | No episódio #186 do podcast Hipsters.tech, os hosts discutem algoritmos e estruturas de dados. Além disso, entra em pauta a questão: será que você realmente precisa saber algoritmos e estruturas de dados para trabalhar com programação? | [ACESSAR](https://www.alura.com.br/podcast/hipsterstech-algoritmos-e-estrutura-de-dados-hipsters-186-a375)
Estruturas de dados: uma introdução | Este artigo da Alura oferece uma introdução abrangente às estruturas de dados. Ele explora os conceitos fundamentais por trás dessas estruturas, fornecendo uma base sólida para entender como escolher e implementar a estrutura de dados adequada para diferentes cenários. | [ACESSAR](https://www.alura.com.br/artigos/estruturas-de-dados-introducao)
Java e orientação a objetos > COLLECTIONS FRAMEWORK | Parte da apostila "Java e Orientação a Objetos" da Alura, este capítulo foca no Collections Framework. Ele explora as coleções disponíveis no Java, como Listas e Mapas, proporcionando uma compreensão prática de como utilizar essas estruturas de dados na programação orientada a objetos em Java. | [ACESSAR](https://www.alura.com.br/apostila-java-orientacao-objetos/collections-framework)