package com.ptportfolio.pablot.dto;

import javax.validation.constraints.NotBlank;


public class DtoSkill {
    @NotBlank
    private String nombreSkill;
    @NotBlank
    private int porcentaje;

    public DtoSkill() {
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public DtoSkill(String nombreSkill, int porcentaje) {
        this.nombreSkill = nombreSkill;
        this.porcentaje = porcentaje;
    }
}
