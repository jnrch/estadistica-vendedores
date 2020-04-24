package com.estadisticas.apiestadisticas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ventas")
public class Venta implements Serializable {

    @Id
    private Long id;

    @Column(name = "semanaactual")
    private double semanaactual;

    @Column(name = "semanapasada", nullable = false)
    private double semanapasada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reparto_id")
    @JsonIgnore
    private Reparto reparto;

    public double getSemanaactual() {

        return semanaactual;
    }

/*
    public void setSemanaactual(double semanaactual) {
        this.semanaactual = semanaactual;
    }
*/

    public double getSemanapasada() {
        return semanapasada;
    }

/*    public void setSemanapasada(double semanapasada) {
        this.semanapasada = semanapasada;
    }*/

    public Reparto getReparto() {
        return reparto;
    }

/*    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }*/
}
