package com.juliancuadros.meca.mecanicos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MecanicosController {

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }
}
