package br.com.claudsan.docker.aplicacaodocker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControladorPrincipal {


    @Value("${nome_aplicacao}")
    private String nomeAplicacao;


    @GetMapping
    public String index(){
        return "meu controlador "+nomeAplicacao;
    }
}
