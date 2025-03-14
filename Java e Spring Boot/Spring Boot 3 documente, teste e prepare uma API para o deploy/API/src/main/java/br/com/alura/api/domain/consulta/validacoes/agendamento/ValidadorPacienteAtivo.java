package br.com.alura.api.domain.consulta.validacoes.agendamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.alura.api.domain.ValidacaoException;
import br.com.alura.api.domain.consulta.DadosAgendamentoConsulta;
import br.com.alura.api.domain.paciente.PacienteRepository;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta {
    
    @Autowired
    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
 
        var pacienteEstaAtivo =  repository.findAtivoById(dados.idPaciente());
        if(!pacienteEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendada com paciente excluído!");
        }
    }
}
