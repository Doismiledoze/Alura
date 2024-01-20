package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final String APIKEY = "5da82bc1";
		//System.out.println("Primeiro projeto Spring sem Web");
		var consumoApi = new ConsumoAPI();
		//var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey="+APIKEY);
		// System.out.println(json);
		// json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey="+APIKEY);
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
		
	}
}
