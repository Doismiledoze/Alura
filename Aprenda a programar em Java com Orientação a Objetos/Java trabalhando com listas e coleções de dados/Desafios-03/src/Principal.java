import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {

        // Crie um ArrayList de strings e utilize um loop foreach para percorrer e
        // imprimir cada elemento da lista.
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Python");

        for (String elemento : listaStrings) {
            System.out.println(elemento);
        }

        // Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida,
        // crie um objeto da classe Cachorro e faça o casting para a classe Animal.
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        // Modifique o Exercício 2 para incluir uma verificação usando instanceof para
        // garantir que o objeto seja do tipo correto antes de fazer o casting.
        Animal nvAnimal = new Cachorro();

        if (nvAnimal instanceof Cachorro) {
            Cachorro nvCachorro = (Cachorro) nvAnimal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

        // Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie
        // uma lista de produtos e utilize um loop para calcular e imprimir o preço
        // médio dos produtos.
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

        // Crie uma interface Forma com um método calcularArea(). Implemente a interface
        // em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista
        // de formas (objetos da interface Forma) e utilize um loop para calcular e
        // imprimir a área de cada forma.
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

        // Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
        // Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize
        // um loop para encontrar e imprimir a conta com o maior saldo.
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

class Animal {
    // Propriedades e métodos
}

class Cachorro extends Animal {
    // Propriedades e métodos
}

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
