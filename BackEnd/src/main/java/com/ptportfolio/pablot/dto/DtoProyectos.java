package com.ptportfolio.pablot.dto;

import javax.validation.constraints.NotBlank;


public class DtoProyectos {
    @NotBlank
    private String nombreProyec;
    @NotBlank
    private String descProyec;
    
    public DtoProyectos() {
    }

    public DtoProyectos(String nombreProyec, String descProyec) {
        this.nombreProyec = nombreProyec;
        this.descProyec = descProyec;
        
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
