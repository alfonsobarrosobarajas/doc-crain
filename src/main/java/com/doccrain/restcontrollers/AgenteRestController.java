package com.doccrain.restcontrollers;

import com.doccrain.models.Agente;
import com.doccrain.services.AgenteService;
import com.doccrain.utils.Router;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(Router.AGENTE)
public class AgenteRestController {

    @Autowired
    AgenteService service;

    @GetMapping(Router.LIST)
    public List<Agente> list(){
        return service.list();
    }

    @GetMapping(Router.GET)
    public Agente get(@PathVariable int id){
        return service.get(id);
    }

    @GetMapping(Router.GETAGENTE_X_GRUPO)
    public Collection<Object> getAxG(){

        Object a = new Agente();

        return service.getAgente_X_Grupo();
    }

    @GetMapping(Router.GET_BY_CODE)
    public Agente getAgenteByNumEmpleado(@PathVariable String code){
        return service.getAgenteByNumEmpleado(code);
    }


    @PostMapping(Router.ADD)
    public void add(@RequestBody Agente agente){
        service.add(agente);
    }

    @PutMapping(Router.UPDATE)
    public void update(@RequestBody Agente agente, @PathVariable int id){

        service.update(agente, id);
    }

    @DeleteMapping(Router.DELETE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
