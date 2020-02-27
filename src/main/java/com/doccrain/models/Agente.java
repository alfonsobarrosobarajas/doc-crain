package com.doccrain.models;

import javax.persistence.*;
import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private List<Grupo> grupos = new ArrayList<Grupo>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Permiso> permisos = new HashSet<Permiso>();


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


    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Set<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
    }
}
