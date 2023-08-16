package com.br.projetoSolo.projetoSolo.controler;


import com.br.projetoSolo.projetoSolo.dados.Cliente;
import com.br.projetoSolo.projetoSolo.dados.DadosCliente;
import com.br.projetoSolo.projetoSolo.dados.DadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("home")
public class ProjetoDadosControler {
    @Autowired
    private DadosRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCliente dados){
        repository.save(new Cliente(dados));
    }
}

