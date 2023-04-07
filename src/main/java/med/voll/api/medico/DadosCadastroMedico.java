package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @Pattern(regexp = "\\d{4,6}") // colocar um padrao para o crm (expressao regular)
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull @Valid DadosEndereco endereco) {
}
