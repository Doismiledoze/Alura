import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Crie uma classe Produto com atributos como nome, preco, e quantidade. Em
        // seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
        // Adicione alguns produtos, imprima o tamanho da lista e recupere um produto
        // pelo índice.
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());
    
        // Implemente o método toString() na classe Produto para retornar uma
        // representação em texto do objeto. Em seguida, imprima a lista de produtos
        // utilizando o método System.out.println().
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }
        // Modifique a classe Produto para incluir um construtor que aceite parâmetros
        // para inicializar os atributos. Em seguida, crie objetos Produto utilizando
        // esse novo construtor.
        
        // Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo
        // dataValidade e um construtor que utilize o construtor da classe mãe (super)
        // para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e
        // imprima seus valores.
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);
    }

}
