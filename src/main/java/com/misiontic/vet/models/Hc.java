package com.misiontic.vet.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Hc {

    @Id
    private String idHc;
    private String idMascota;
    private String idUsuario;
    private Date fechaConsulta;
    private String motivoConsulta;
    private String anamnesico;
    private String estadoReproductivo;
    private String enfermedades;
    private String cirugias;
    private Integer edad;
    private String diagnostico;
    private String examenClinico;
    private Date ultimaDesparacitacion;


    public Hc(String idHc, String idMascota, String idUsuario, Date fechaConsulta, String motivoConsulta, String anamnesico, String estadoReproductivo, String enfermedades, String cirugias, Integer edad,
                   String diagnostico, String examenClinico, Date ultimaDesparacitacion) {


        this.idHc = idHc;
        this.idMascota = idMascota;
        this.idUsuario = idUsuario;
        this.fechaConsulta = fechaConsulta;
        this.motivoConsulta = motivoConsulta;
        this.anamnesico = anamnesico;
        this.estadoReproductivo = estadoReproductivo;
        this.enfermedades = enfermedades;
        this.cirugias = cirugias;
        this.edad = edad;
        this.diagnostico = diagnostico;
        this.examenClinico = examenClinico;
        this.ultimaDesparacitacion = ultimaDesparacitacion;
    }
    public String getIdHc() {
        return this.idHc;
    }

    public void setIdHc(String idHc) {
        this.idHc = idHc;
    }

    public String getIdMascota() {
        return this.idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaConsulta() {
        return this.fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getMotivoConsulta() {
        return this.motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getAnamnesico() {
        return this.anamnesico;
    }

    public void setAnamnesico(String anamnesico) {
        this.anamnesico= anamnesico;
    }

    public String getEstadoReproductivo() {
        return this.estadoReproductivo;
    }

    public void setEstadoReproductivo(String estadoReproductivo) {
        this.estadoReproductivo = estadoReproductivo;
    }

    public String getEnfermedades() {
        return this.enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getCirugias() {
        return this.cirugias;
    }

    public void setCirugias(String cirugias) {
        this.cirugias = cirugias;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad  = edad;
    }
    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getExamenClinico() {
        return this.examenClinico;
    }

    public void setExamenClinico(String examenClinico) {
        this.examenClinico = examenClinico;
    }

    public Date getUltimaDesparacitacion() {
        return this.ultimaDesparacitacion;
    }

    public void setUltimaDesparacitacion(Date ultimaDesparacitacion) {
        this.ultimaDesparacitacion = ultimaDesparacitacion;
    }

}

