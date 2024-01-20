import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        // Crie um programa em Java que utilize as classes HttpClient, HttpRequest e
        // HttpResponse para fazer uma consulta à API do Google Books. Solicite ao
        // usuário que insira o título de um livro, e exiba as informações disponíveis
        // sobre o livro retornado pela API.
/*
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o título do livro para a busca: ");
        var tituloLivro = leitura.nextLine();

        //String chave = "CHAVE_FICARÁ_AQUI";
        String chave = "AIzaSyChoIt4MjKQH-5h55TXHq-VMunFT6ZgYu0";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivro + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
*/
        // Crie um programa Java que utiliza as classes HttpClient, HttpRequest e
        // HttpResponse para fazer uma consulta à API CoinGecko e exiba a cotação atual
        // de uma criptomoeda escolhida pelo usuário.
/*
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome da criptomoeda para a cotação (por exemplo, bitcoin): ");
        var criptoNome = leitura.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoNome + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
*/
        // Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as
        // classes HttpClient, HttpRequest e HttpResponse. Solicite ao usuário que
        // insira o nome de uma receita e exiba as informações disponíveis sobre essa
        // receita.
/*
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome da receita para a busca: ");
        var nomeReceita = leitura.nextLine();

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
*/
    }
}
