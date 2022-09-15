package br.famadev.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProductsController {

    @GetMapping("/cadastrar")
    public String cadastrar() {
        System.out.println("Carregando Cadastro de Produtos");
        return "/produto/cadastro";
    }

    @PostMapping("/salvar")
    public String salvar() {
        System.out.println("Cadastrando o produto");
        return "/produto/cadastro";
    }
}
