package com.doccrain.services;

import com.doccrain.models.Agente;
import com.doccrain.repository.AgenteRepository;
import com.doccrain.repository.CRUD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenteService extends CRUD<Agente, AgenteRepository> {

    public AgenteService(AgenteRepository repository) {
        super(repository);
    }

    @Override
    public List<Agente> list() {
        return repository.findAll();
    }

    @Override
    public Agente get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Agente o) {
        repository.save(o);
    }

    @Override
    public void update(Agente o, int id) {
        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
