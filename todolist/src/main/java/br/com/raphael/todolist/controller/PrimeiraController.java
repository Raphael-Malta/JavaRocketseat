package br.com.raphael.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")

public class PrimeiraController {

    /**
     * Métodos de acesso de HTTP
     * GET - BUSCAR UMA INFORMAÇÃO
     * POST - ADICIONAR UMA INFORMAÇÃO
     * PUT - ALTERAR UMA INFO
     * DELETE - REMOVER INFO
     * PATCH - ALTERAR SOMENTE UMA PARATE DA INFO/DADO
     * 
     */

     //Funcionalidade de uma classe
     @GetMapping("/primeiroMetodo")
    public String primeitaMensagem(){
        return "Funcionou";
    }
    
}
