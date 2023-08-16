package com.br.projetoSolo.projetoSolo.dados;

import com.br.projetoSolo.projetoSolo.endereco.DadosEndereco;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record DadosCliente(
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        String conta,
        @NotNull
        DadosEndereco endereco
) {
}
