package com.doccrain.repository;

import com.doccrain.models.Agente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface AgenteRepository extends JpaRepository<Agente, Integer> {

    @Query("FROM Agente agente JOIN agente.grupos")
    Collection<Object> getAgente_X_Grupo();
/*
    @Query("FROM Agente agente join agente.grupos WHERE  agente.id= :id")
    List<Object> getAgente_X_GrupoById(int id);
*/
    @Query("FROM Grupo grupo join grupo.agentes WHERE  grupo.id= :id")
    List<Object> getAgente_X_GrupoById(int id);

    @Query("FROM Agente agente WHERE agente.numempleado = :numEmpleado")
    Agente getAgenteByNumEmpleado(String numEmpleado);

}
