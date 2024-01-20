package br.com.alura.screenmatch.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        final String APIKEY = "6585022c"; // Chave Alura

        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca: ");
            // var busca = leitura.nextLine();
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://omdbapi.com/?t=" + busca.replace(" ", "+") + "&apiKey=" + APIKEY;
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        // .uri(URI.create("https://omdbapi.com/?t=matrix&apiKey=6585022c"))
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, BodyHandlers.ofString());
                // System.out.println(response.body());
                String json = response.body();

                // Gson gson = new Gson();
                // Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                // System.out.println(meuTitulo);
                // Gson gson = new
                // GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                // Titulo meuTitulo = new Titulo(meuTituloOmdb);
                // System.out.println("Titulo já convertido");
                // System.out.println(meuTitulo);
                // try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);

                // FileWriter escrita = new FileWriter("filmes.txt");
                // escrita.write(meuTitulo.toString());
                // escrita.close();
                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
                // } catch (Exception e) {
                // System.out.println("Aconteceu algo, não sei o quê");
                // }
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa finalizou corretamente!");
    }
}
