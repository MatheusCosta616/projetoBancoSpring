package com.br.projetoSolo.projetoSolo.endereco;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String lougradouro,
        @NotBlank
        String bairro,
        @NotBlank @Pattern(regexp = "\\d{8}")
        String cep,
        String complemento,
        @NotBlank
        String numero,
        @NotBlank
        String uf,
        @NotBlank
        String cidade
) {
}
