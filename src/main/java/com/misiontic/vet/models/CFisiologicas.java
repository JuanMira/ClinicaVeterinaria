package com.misiontic.vet.models;

import org.springframework.data.annotation.Id;


public class CFisiologicas {

    @Id
    private String idContantesFisiologicas;
    private Integer tllc;
    private Integer frecuenciaCardiaca;
    private Integer frecuenciaRespiratoria;
    private Integer pulso;
    private Integer temperatura;
    private Integer peso;


    public CFisiologicas(String idContantesFisiologicas, Integer tllc, Integer frecuenciaCardiaca, Integer frecuenciaRespiratoria, Integer pulso, Integer temperatura, Integer peso) {


        this.idContantesFisiologicas = idContantesFisiologicas;
        this.tllc = tllc;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.pulso = pulso;
        this.temperatura = temperatura;
        this.peso = peso;
    }

    public String getIdContantesFisiologicas() {
        return this.idContantesFisiologicas;
    }

    public void setIdHc(String idContantesFisiologicas) {
        this.idContantesFisiologicas = idContantesFisiologicas;
    }

    public Integer getTllc() {
        return this.tllc;
    }

    public void setTllc(Integer tllc) {
        this.tllc = tllc;
    }

    public Integer getFrecuenciaCardiaca() {
        return this.frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(Integer frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public Integer  getFrecuenciaRespiratoria() {
        return this.frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(Integer frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria= frecuenciaRespiratoria;
    }

    public Integer getPulso() {
        return this.pulso;
    }

    public void setPulso(Integer pulso) {
        this.pulso = pulso;
    }

    public Integer getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getPeso() {
        return this.peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
