package com.doccrain.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="agente")
public class Agente {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name="numempleado", unique = true, nullable = false, columnDefinition = "char(10)")
    private String numempleado;
    @Column(name="nombre", nullable = false)
    private String nombre;
    @Column(name="telefono", nullable = false, columnDefinition = "char(20)")
    private String telefono;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="agente_grupo", joinColumns = @JoinColumn(name="agente_id"), inverseJoinColumns = @JoinColumn(name = "grupo_id"))
    private List<Grupo> grupos = new ArrayList<>();


    public Agente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(String numempleado) {
        this.numempleado = numempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
