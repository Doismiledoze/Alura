package br.com.alura.api.domain.consulta.validacoes.cancelamento;

import br.com.alura.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);

}