package com.doccrain.restcontrollers;

import com.doccrain.models.Agente;
import com.doccrain.services.AgenteService;
import com.doccrain.utils.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlConstants.AGENTE)
public class AgenteRestController {

    @Autowired
    AgenteService service;

    @GetMapping(UrlConstants.LIST)
    public List<Agente> list(){
        return service.list();
    }

    @GetMapping(UrlConstants.GET)
    public Agente get(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(UrlConstants.ADD)
    public void add(@RequestBody Agente agente){
        service.add(agente);
    }

    @PutMapping(UrlConstants.UPDATE)
    public void update(@RequestBody Agente agente, @PathVariable int id){
        service.update(agente, id);
    }

    @DeleteMapping(UrlConstants.DELETE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
