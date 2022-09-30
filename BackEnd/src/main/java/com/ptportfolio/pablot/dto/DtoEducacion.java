package com.ptportfolio.pablot.dto;

import javax.validation.constraints.NotBlank;


public class DtoEducacion {
    
    @NotBlank
    private String tituloEdu;
    
    @NotBlank
    private String fechaEdu;
    
    @NotBlank
    private String descEdu;
    
    @NotBlank
    private String imagenEdu;

    public DtoEducacion() {
    }

    public DtoEducacion(String tituloEdu, String fechaEdu, String descEdu, String imagenEdu) {
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(String fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }    
}

