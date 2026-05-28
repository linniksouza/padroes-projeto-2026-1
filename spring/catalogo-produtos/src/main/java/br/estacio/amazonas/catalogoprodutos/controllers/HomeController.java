package br.estacio.amazonas.catalogoprodutos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(path = "/hello-world")
    public String home() {
        return "Hello World com Spring Boot!";
    }
}
