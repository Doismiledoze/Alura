# Java: consumindo API, gravando arquivos e lidando com erros

- Aprenda a consumir uma API HTTP em Java
- Entenda como receber e converter informações de uma API para - objetos Java
- Manipule dados no formato JSON
- Utilize a biblioteca Gson para conversão de objetos Java em JSON e vice-versa
- Faça uso das classes do pacote java.io para manipulação de arquivos

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
- [Desafios]()
- [Buscador]()

## Módulos

[Voltar à Navegação](#navegação)

 MODULO | O QUE APRENDEMOS
------------|-----------
Requisições e respostas | <ul><li>O que é uma API e seu funcionamento básico;</li><li>Como funciona a API do OMDb, para a busca de filmes;</li><li>A realizar uma consulta na API do OMDb utilizando o Postman;</li><li>Como se integrar à API do OMDb em Java, utilizando as classes HttpClient, HttpRequest e HttpResponse.</li></ul>
Utilizando uma biblioteca externa | <ul><li>O que são bibliotecas Java;</li><li>Como instalar a biblioteca Gson no projeto, baixando e configurando o arquivo jar dela;</li><li>A utilizar a biblioteca Gson para converter um json em um objeto Java;</li><li>Como criar um Record no Java, que é uma estrutura similar à uma classe, mas utilizado apenas para representar dados;</li><li>A flexibilizar a conversão de um json em um objeto Java, seguindo a documentação da biblioteca Gson.</li></ul>
Lidando com exceções | <ul><li>O que são exceptions no Java e como tratá-las com o bloco try/catch;</li><li>Como capturar diferentes tipos de exceptions que podem acontecer no código;</li><li>Como criar uma classe exception personalizada;</li><li>A realizar uma validação e lançar uma exception em caso de erro.</li></ul>
Persistindo dados em arquivos | <ul><li>Escrever dados em um arquivo, utilizando classes do pacote java.io;</li><li>Serializar um objeto Titulo para um formato JSON, utilizando a biblioteca vista anteriormente Gson;</li><li>Gerar o arquivo no formato JSON, com uma formatação mais elegante, usando o método setPrettyPrinting.</li></ul>
Consolidando conhecimentos | <ul><li>A aplicar seus conhecimentos em uma aplicação que se integra à API do ViaCEP, utilizando as classes do Java para realizar um requisição HTTP, bem como para salvar um arquivo json.</li></ul>

## Exercícios Extras

[Voltar à Navegação](#navegação)

<details>
<summary>Requisições e respostas</summary>

1. Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis sobre o livro retornado pela API.

```java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaLivroGoogleBooks {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o título do livro para a busca: ");
        var tituloLivro = leitura.nextLine();

        String chave = "CHAVE_FICARÁ_AQUI";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivro + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
```

2. Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário.

```java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaCotacaoCripto {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome da criptomoeda para a cotação (por exemplo, bitcoin): ");
        var criptoNome = leitura.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoNome + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
```

3. Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes HttpClient, HttpRequest e HttpResponse. Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre essa receita.

```java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaReceitaTheMealDB {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome da receita para a busca: ");
        var nomeReceita = leitura.nextLine();

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
```

</details>

<details>
<summary>Utilizando uma biblioteca externa</summary>

1. Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa.

```java
import com.google.gson.Gson;

record Pessoa(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjeto {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
```

2. Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação da biblioteca Gson para flexibilizar a conversão.

```java
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Pessoa(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjetoFlexivel {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
```

3. Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro em um objeto do tipo Livro.

```java
import com.google.gson.Gson;

record Editora(String nome, String cidade) {}
record Livro(String titulo, String autor, Editora editora) {}

public class ConversaoJsonAninhadoParaObjeto {

    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " + livro);
    }
}
```

</details>

<details>
<summary>Lidando com exceções</summary>

1. Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo. Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.

```java
import java.util.Scanner;

public class ExercicioDivisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerador = scanner.nextInt();

        System.out.println("Informe o denominador: ");
        int denominador = scanner.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        }
    }
}
```

2. Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).

```java
public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}

import java.util.Scanner;

public class ExercicioSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
```

3. Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.

```java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaGitHub {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome de usuário do GitHub para consultar informações: ");
        String username = leitura.nextLine();

        String endereco = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);

            // Adicione aqui o código para processar o JSON e exibir as informações desejadas
        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}

class ErroConsultaGitHubException extends RuntimeException {

    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}
```

</details>

<details>
<summary>Persistindo dados em arquivo</summary>

1. Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.

   ```java
    import java.io.FileWriter;
    import java.io.IOException;

    public class WriteToFile {
        public static void main(String[] args) {
            String data = "Conteúdo a ser gravado no arquivo.";

            try (FileWriter writer = new FileWriter("arquivo.txt")) {
                writer.write(data);
                System.out.println("Dados gravados com sucesso.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
   ```

2. Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.

   ```java
    import com.google.gson.Gson;

    class Titulo {
        // Defina a classe do objeto Titulo aqui

        public static void main(String[] args) {
            Titulo titulo = new Titulo(); 

            Gson gson = new Gson();
            String json = gson.toJson(titulo);

            System.out.println(json);
        }
    }
   ```

3. Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante. Utilize o método setPrettyPrinting para alcançar esse resultado.

   ```java
    import com.google.gson.Gson;
    import com.google.gson.GsonBuilder;

    class Titulo {
        // Defina os atributos da classe aqui

        public static void main(String[] args) {
            Titulo titulo = new Titulo(); 

            // Configuração do Gson com Pretty Printing
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(titulo);

            System.out.println(json);
        }
    }
   ```

4. Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.

   ```java
    import com.google.gson.Gson;

    class Veiculo {
        private String marca;
        private String modelo;
        private int anoFabricacao;
        private double preco;

        // Construtores, getters e setters ocultos

        public static void main(String[] args) {
            // Crie uma instância do objeto Veiculo
            Veiculo carro = new Veiculo();
            carro.setMarca("Toyota");
            carro.setModelo("Corolla");
            carro.setAnoFabricacao(2022);
            carro.setPreco(75000.00);

            Gson gson = new Gson();
            String jsonVeiculo = gson.toJson(carro);

            // Imprima o JSON resultante
            System.out.println("Objeto Veiculo serializado para JSON:");
            System.out.println(jsonVeiculo);
        }
    }
   ```

</details>

## Links Úteis

[Voltar à Navegação](#navegação)

- [OMDB API](https://www.omdbapi.com/apikey.aspx)
- [HTTP: Entendendo a web por baixo dos panos](https://cursos.alura.com.br/course/http-fundamentos)
- [Design Patterns em Java I: boas práticas de programação](https://cursos.alura.com.br/course/introducao-design-patterns-java)
- [Design Patterns em Java II: avançando nas boas práticas de programação](https://cursos.alura.com.br/course/avancando-design-patterns-java)
- [Classe Record](https://docs.oracle.com/en/java/javase/16/language/records.html)

## Dicas

[Voltar à Navegação](#navegação)

## Referências

[Voltar à Navegação](#navegação)

REFERÊNCIA | DESCRIÇÃO | ACESSO
------------|-----------|--------
Java e orientação a objetos > Pacote java.io | Neste capítulo da apostila "Java e Orientação a Objetos" da Alura, você terá uma abordagem detalhada sobre o pacote java.io. Essa parte explora as APIs do Java, com foco especial nos pacotes java.io e java.util. Independentemente do tipo de aplicativo que você desenvolve - desktop, web ou mobile - as classes desses pacotes desempenham um papel crucial na manipulação eficiente de dados. | [ACESSAR](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io)
Exceções em Java: Uma Primeira Conversa | Artigo esclarecedor sobre o tratamento de exceções em Java. O conteúdo abrange não apenas conceitos básicos, mas também detalhes do assunto, como exceções personalizadas e estratégias para lançamento controlado de exceções. | [ACESSAR](https://www.linkedin.com/pulse/exce%C3%A7%C3%B5es-em-java-uma-primeira-conversa-vanessa/?originalSubdomain=pt)
Wikibooks: Java exceção | A página do Wikibooks explora o tema de exceções em Java, fornecendo uma visão abrangente sobre o assunto. Com informações detalhadas, é uma leitura valiosa para entender a manipulação de exceções na linguagem Java. | [ACESSAR](https://pt.wikibooks.org/wiki/Java/Exce%C3%A7%C3%B5es)
Be the exception! Dicas para dominar exceções em seus códigos Java | O artigo fala sobre boas práticas no momento de tratar e lançar exceções em seus códigos Java. Abordando estratégias eficazes e dicas para usar no dia a dia, o conteúdo ajuda os desenvolvedores a lidar com exceções de forma mais eficiente em seus projetos. | [ACESSAR](https://dev.to/dearrudam/be-the-exception-dicas-para-dominar-excecoes-em-seus-codigos-java-4nlo)
O que é Biblioteca, Framework e API? #HipstersPontoTube | Maurício Linhares e Paulo Silveira discutem, de maneira descontraída e prática, os conceitos de Bibliotecas, Frameworks e APIs. O vídeo fornece explicações claras e exemplos, ajudando a esclarecer esses termos frequentemente utilizados no desenvolvimento de software. | [ACESSAR](https://www.youtube.com/watch?v=F0H4HPXdZog)
