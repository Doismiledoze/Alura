package br.com.alura.screenmatch.principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.alura.screenmatch.model.DadosEpisodios;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=5da82bc1";
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu() {
        System.out.println("Digite o nome da serie para buscarmos: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(
                ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i=1; i<=dados.totalTemporadas(); i++){
			json = consumo.obterDados(
                ENDERECO + nomeSerie.replace(" ", "+") +"&season="+ i +API_KEY);
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}

		temporadas.forEach(System.out::println);

        //Exemplo forEach antigo
        // for (int i=0; i<dados.totalTemporadas(); i++){
		// 	List<DadosEpisodios> episodiosTemporada = temporadas.get(i).episodios();
        //     for (int j=0; j<episodiosTemporada.size(); j++){
        //             System.out.println(episodiosTemporada.get(j).titulo());
        //     }
		// }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        /* Exemplo de Stream
        List<String> nomes = Arrays.asList("Jacque", "Iasmin", "Paulo", "Rodrigo", "Nico");
        nomes.stream()
            .sorted() //Ordena
            .limit(3) //Limita os 3 primeiros
            .filter(n -> n.startsWith("N")) //Filtra
            .map(n -> n.toUpperCase()) //Transforma
            .forEach(System.out::println);
        */

        List<DadosEpisodios> dadosEpisodios = temporadas.stream()
            .flatMap(t -> t.episodios().stream())
            .collect(Collectors.toList());

        //Exemplo Top X
        // System.out.println(("\nTop 10 episódios"));    
        // dadosEpisodios.stream()
        //     .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
        //     .peek(e->System.out.println("Primeiro Filtro(N/A) "+e))
        //     .sorted(Comparator.comparing(DadosEpisodios::avaliacao).reversed())
        //     .peek(e->System.out.println("Ordenação "+e))
        //     .limit(10)
        //     .peek(e->System.out.println("Limite "+e))
        //     .map(e -> e.titulo().toUpperCase())
        //     .peek(e->System.out.println("Mapeamento "+e))
        //     .forEach(System.out::println);
        //Fim

            List<Episodio> episodios = temporadas.stream()
            .flatMap(t -> t.episodios().stream().map(d -> new Episodio(t.numero(),d)))
            .collect(Collectors.toList());

            episodios.forEach(System.out::println);

            //Exemplo de busca com stream()
            // System.out.println("Digie um trecho do titulo do episódio");
            // var trechoTitulo = leitura.nextLine();

            // Optional<Episodio> episodioBuscado = episodios.stream()
            // .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
            //     .findFirst();

            // if(episodioBuscado.isPresent()){
            //     System.out.println("Episódio encontrado!");
            //     System.out.println("Temporada: "+episodioBuscado.get().getTemporada());
            // } else {
            //     System.out.println("Episódio não encontrado");
            // }
            //FIM
            
            //Exemplo de busca com LocalDate
            // System.out.println("A partir de que ano você deseja ver os episódios? ");
            // var ano = leitura.nextInt();
            // leitura.nextLine();

            // LocalDate dataBusca = LocalDate.of(ano,1,1);

            // DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            // episodios.stream()
            // .filter(e -> e.getDataLancamento()!=null && e.getDataLancamento().isAfter(dataBusca))
            // .forEach(e -> System.out.println(
            //         "Temporada: "+e.getTemporada() +
            //         " Episódio: " + e.getTitulo() +
            //         " Data lançamento: " + e.getDataLancamento().format(formatador)
            //         ));
            //FIM

            Map<Integer,Double> avaliacaoesPorTemporada = episodios.stream()
                .filter(e -> e.getAvaliacao()>0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada, 
                Collectors.averagingDouble(Episodio::getAvaliacao)));
                System.out.println(avaliacaoesPorTemporada);

            DoubleSummaryStatistics est = episodios.stream()
            .filter(e -> e.getAvaliacao()>0.0)
            .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));
            //System.out.println(est);
            System.out.println("Média: "+est.getAverage());
            System.out.println("Melhor episódio: "+est.getMax());
            System.out.println("Melhor episódio: "+est.getMin());
            System.out.println("Quantidade: "+est.getCount());
    }
}
