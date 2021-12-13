package com.misiontic.vet.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Vacuna {

    @Id
    private String idVacuna;
    private Date fechaVacuna;
    private String nombreVacuna;

    public Vacuna(String idVacuna, Date fechaVacuna, String nombreVacuna) {


        this.idVacuna = idVacuna;
        this.fechaVacuna = fechaVacuna;
        this.nombreVacuna = nombreVacuna;
    }

    public String getIdVacuna() {
        return this.idVacuna;
    }

    public void setIdVacuna(String idVacuna) {
        this.idVacuna = idVacuna;
    }

    public Date getFechaVacuna() {
        return this.fechaVacuna;
    }

    public void setFechaVacuna(Date fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }

    public String getNombreVacuna() {
        return this.nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

}


