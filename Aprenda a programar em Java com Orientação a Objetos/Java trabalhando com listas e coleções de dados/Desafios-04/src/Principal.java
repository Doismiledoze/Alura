import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws Exception {
        // Crie uma lista de números inteiros e utilize o método Collections.sort para
        // ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);
    
        // Crie uma classe Titulo com um atributo nome do tipo String. Implemente a
        // interface Comparable na classe para que seja possível ordenar uma lista de
        // objetos Titulo.
        
        // No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma
        // lista. Utilize o método Collections.sort para ordenar a lista e, em seguida,
        // imprima os títulos ordenados.
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("A"));
        listaTitulos.add(new Titulo("B"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);
        }
        // Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList
        // quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é
        // possível trocar facilmente a implementação.
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);
    
        // Modifique o Exercício 4 para declarar a variável de lista como a interface
        // List, demonstrando o uso de polimorfismo.
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

class Titulo implements Comparable<Titulo> {
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
