package com.br.projetoSolo.projetoSolo.endereco;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {
    private String lougradouro;
    private String bairro;
    private String cep;
    private String complemento;
    private String numero;
    private String uf;
    private String cidade;

    public Endereco(DadosEndereco dados){
        this.lougradouro = dados.lougradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
    }
}
