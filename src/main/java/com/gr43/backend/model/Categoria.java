package com.gr43.backend.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int padre = 0; //categoria padre por defecto 0
    
    @JoinColumn
    @OneToMany
    private List<Categoria> hijas;

    @Column
    private String nombre;

    public Categoria() {
        super();
    }

    public Categoria(int padre, String nombre) {
        super();
        this.padre = padre;
        this.nombre = nombre;
    }

    public int getPadre() {
        return padre;
    }

    public void setPadre(int padre) {
        this.padre = padre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Categoria> getHijas() {
        return hijas;
    }

    public void setHijas(List<Categoria> hijas) {
        this.hijas = hijas;
    }
    
}
