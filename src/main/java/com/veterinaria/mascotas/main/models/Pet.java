package com.veterinaria.mascotas.main.models;

import org.springframework.data.annotation.Id;

public class Pet {
    @Id
    private String idMascota;
    private String nombreMascota;
    private String raza;
    private String idCustomer;

    public Pet(String nombreMascota, String raza) {
        this.nombreMascota = nombreMascota;
        this.raza = raza;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombreMascota() {
        return this.nombreMascota;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idDueño) {
        this.idCustomer = idDueño;
    }

}
