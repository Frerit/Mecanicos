package com.juliancuadros.meca.mecanicos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MecanicosController {

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }
}
