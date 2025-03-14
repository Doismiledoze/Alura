package br.com.alura.screenmatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.screenmatch.dto.EpisodioDTO;
import br.com.alura.screenmatch.dto.SerieDTO;
import br.com.alura.screenmatch.service.SerieService;

@RestController
@RequestMapping("/series")
public class SerieController {

     @Autowired
     private SerieService servico;
    // private SerieRepository repositorio;

    //@GetMapping("/series")
    @GetMapping
    // public String obterSeries(){
    //     return "aqui vão ser listadas as séries";
    // }
    public List<SerieDTO> obterSeries(){
        return servico.obterTodasAsSeries();
    }

    //@GetMapping("/series/top5")
    @GetMapping("/top5")
    public List<SerieDTO> obterTop5Series(){
        return servico.obterTop5Series();
    }

    @GetMapping("/lancamentos")
    public List<SerieDTO> obterLancamentos(){
        return servico.obterLancamentos();
    }

    @GetMapping("/{id}")
    public SerieDTO obterPorId(@PathVariable Long id){
        return servico.obterPorId(id);
    }

    @GetMapping("/{id}/temporadas/todas")
    public List<EpisodioDTO> obterTodasTemporadas(@PathVariable Long id){
        return servico.obterTodasTemporadas(id);
    }

    @GetMapping("/{id}/temporadas/{numero}")
    public List<EpisodioDTO> obterTodasTemporadas(@PathVariable Long id, @PathVariable Long numero){
        return servico.obterTemporadasPorNumero(id,numero);
    }

    @GetMapping("/categoria/{nomeGenero}")
    public List<SerieDTO> obterSeriesPorCategoria(@PathVariable String nomeGenero){
        return servico.obterSeriesPorCategoria(nomeGenero);
    }

    //DESAFIO MÃO NA MASSA
    @GetMapping("/{id}/temporadas/top")
    public List<EpisodioDTO> obterTop5Episodios(@PathVariable Long id){
        return servico.obterTop5Episodios(id);
    }

}
