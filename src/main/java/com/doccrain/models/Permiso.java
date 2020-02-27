package com.doccrain.models;


import javax.persistence.*;

@Entity
@Table(name = "permiso")
public class Permiso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;
    @Column(name = "permiso", nullable = false, columnDefinition = "char(15)")
    private String permiso;
    @Column(name = "objeto", nullable = false, columnDefinition = "char(20)")
    private String objeto;


    @ManyToOne(fetch = FetchType.LAZY)
    private Agente agente;

    public Permiso() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }
}
