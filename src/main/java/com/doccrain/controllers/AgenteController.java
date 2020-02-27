package com.doccrain.controllers;


import com.doccrain.utils.Router;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Router.AGENTE)
public class AgenteController {

    @GetMapping("")
    public String goAgente(){
        return "agente";
    }



}
