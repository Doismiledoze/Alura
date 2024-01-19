import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        //Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
        //No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        //Adicione pelo menos três pessoas à lista utilizando o método add.
        Pessoa pessoa1 = new Pessoa("Akemi", 18);
        Pessoa pessoa2 = new Pessoa("Rodrigo", 30);
        Pessoa pessoa3 = new Pessoa("Caroline", 35);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        //Imprima o tamanho da lista utilizando o método size.
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        //Imprima a primeira pessoa da lista utilizando o método get.
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));

        //Imprima a lista completa
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}
