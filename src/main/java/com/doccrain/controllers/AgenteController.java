package com.doccrain.controllers;


import com.doccrain.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.AGENTE)
public class AgenteController {

    @GetMapping(UrlConstants.AGENTE)
    public String goAgente(){
        return "agente";
    }



}
