package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastroPaceinte;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @PostMapping
    private void cadastrar(@RequestBody DadosCadastroPaceinte dados) {
        System.out.println(dados);
    }

}
