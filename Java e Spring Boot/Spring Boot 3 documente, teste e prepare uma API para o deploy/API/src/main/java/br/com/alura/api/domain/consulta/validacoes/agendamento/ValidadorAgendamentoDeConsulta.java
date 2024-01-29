package br.com.alura.api.domain.consulta.validacoes.agendamento;

import br.com.alura.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
