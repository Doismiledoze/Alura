package br.com.alura.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.api.medico.DadosAtualizacaoMedico;
import br.com.alura.api.medico.DadosCadastroMedico;
import br.com.alura.api.medico.DadosListagemMedico;
import br.com.alura.api.medico.Medico;
import br.com.alura.api.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        // System.out.println(dados);
        repository.save(new Medico(dados));
    }

    // @GetMapping
    // public List<DadosListagemMedico> listar(){
    //     return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    // }
    @GetMapping
    //public Page<DadosListagemMedico> listar(Pageable paginacao){
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        // return repository.findAll(paginacao).map(DadosListagemMedico::new);
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        //repository.deleteById(id); exclusão concreta
        var medico = repository.getReferenceById(id);
        medico.excluir();
    }
}
