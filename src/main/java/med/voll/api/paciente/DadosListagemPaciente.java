package med.voll.api.paciente;

import org.springframework.data.web.PageableDefault;

public record DadosListagemPaciente(String nome, String email, String cpf, String telefone) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone());
    }

}
