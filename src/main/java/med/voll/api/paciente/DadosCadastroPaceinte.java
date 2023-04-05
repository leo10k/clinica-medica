package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaceinte(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
