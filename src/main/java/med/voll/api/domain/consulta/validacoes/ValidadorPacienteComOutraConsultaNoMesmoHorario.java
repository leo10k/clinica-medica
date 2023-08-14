package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorPacienteComOutraConsultaNoMesmoHorario {

    private ConsultaRepository consultaRepository;

    public void validar(DadosAgendamentoConsulta dados) {
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHorario = dados.data().withHour(18);
        var pacienteComOutraConsultaNoMesmoHorario = consultaRepository.existsByPacienteIdAndData(dados.idPaciente(), dados.data());
        if (pacienteComOutraConsultaNoMesmoHorario) {
            throw new ValidacaoException("Paciente ja possui outra consulta agendada nesse mesmo horario");
        }
    }

}
