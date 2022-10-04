package com.ptportfolio.pablot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreProyec;
    private String descProyec;
    
    public Proyectos() {
    }

    public Proyectos(String nombreProyec, String descProyec) {
        this.nombreProyec = nombreProyec;
        this.descProyec = descProyec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProyec() {
        return nombreProyec;
    }

    public void setNombreProyec(String nombreProyec) {
        this.nombreProyec = nombreProyec;
    }

    public String getDescProyec() {
        return descProyec;
    }

    public void setDescProyec(String descProyec) {
        this.descProyec = descProyec;
    }

        
}
