package com.izabelaxavier.springbootlab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PublicController {

    @GetMapping("/public")
    public String publicController(){
        return "API funcionando!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Olá Izabela!";
    }

}
