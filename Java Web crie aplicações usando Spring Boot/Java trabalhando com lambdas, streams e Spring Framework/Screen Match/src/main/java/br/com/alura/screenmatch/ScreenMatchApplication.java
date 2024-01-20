package br.com.alura.screenmatch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.principal.Principal;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibeMenu();

		//final String APIKEY = "5da82bc1";
		//System.out.println("Primeiro projeto Spring sem Web");
		//var consumoApi = new ConsumoAPI();
		//var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey="+APIKEY);
		// System.out.println(json);
		// json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		//var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey="+APIKEY);
		// System.out.println(json);
		// ConverteDados conversor = new ConverteDados();
		// DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		// System.out.println(dados);
		// json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&episode=2&apikey="+APIKEY);
		// DadosEpisodios dadosEpisodio = conversor.obterDados(json, DadosEpisodios.class);
		// System.out.println(dadosEpisodio);
		
		// List<DadosTemporada> temporadas = new ArrayList<>();

		// for (int i=1; i<=dados.totalTemporadas(); i++){
		// 	json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season="+i+"&apikey="+APIKEY);
		// 	DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
		// 	temporadas.add(dadosTemporada);
		// }

		// temporadas.forEach(System.out::println);
	}
}
