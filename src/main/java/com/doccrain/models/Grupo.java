package com.doccrain.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;
    @Column(name = "code", nullable = false, unique = true, columnDefinition = "char(15)")
    private String code;
    @Column(name = "groupname", nullable = false, columnDefinition = "varchar(30)")
    private String groupName;


    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "grupos")
    private List<Agente> agentes = new ArrayList<Agente>();


    public Grupo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}
