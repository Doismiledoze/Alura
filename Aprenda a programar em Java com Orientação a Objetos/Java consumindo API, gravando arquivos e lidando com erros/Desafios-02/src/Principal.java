import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) throws Exception {

        // Crie uma classe Pessoa usando o conceito de Record em Java, com atributos
        // como nome, idade e cidade. Em seguida, implemente um programa que utiliza a
        // biblioteca Gson para converter um JSON representando uma pessoa em um objeto
        // do tipo Pessoa.
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);

        // Modifique o programa do Exercício anterior para permitir a conversão de um
        // JSON mesmo se alguns campos estiverem ausentes ou se houver campos adicionais
        // não representados no objeto Pessoa. Consulte a documentação da biblioteca
        // Gson para flexibilizar a conversão.
        String jsonPessoa_1 = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson_1 = new GsonBuilder().setLenient().create();
        Pessoa pessoa_1 = gson_1.fromJson(jsonPessoa_1, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa_1);

        // Crie uma classe Livro que contenha atributos como título, autor e um objeto
        // representando a editora. Em seguida, implemente um programa que utiliza a
        // biblioteca Gson para converter um JSON aninhado representando um livro em um
        // objeto do tipo Livro.
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson_2 = new Gson();
        Livro livro = gson_2.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " + livro);
    }
}

record Pessoa(String nome, int idade, String cidade) {}
record Editora(String nome, String cidade) {}
record Livro(String titulo, String autor, Editora editora) {}