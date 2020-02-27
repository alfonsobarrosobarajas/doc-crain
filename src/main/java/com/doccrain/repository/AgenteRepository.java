package com.doccrain.repository;

import com.doccrain.models.Agente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface AgenteRepository extends JpaRepository<Agente, Integer> {



    @Query("FROM Agente agente JOIN agente.grupos")
    Collection<Object> getAgente_X_Grupo();

    @Query("FROM Agente agente WHERE agente.numempleado = :numEmpleado")
    Agente getAgenteByNumEmpleado(String numEmpleado);


}
