package com.estadisticas.apiestadisticas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "pruebafinal")
public class Pruebafinal implements Serializable {

    @Id
    private Long id;

    @Column(name = "clientesnuevos", nullable = false)
    private Long clientesnuevos;

    @Column(name = "cobradosemanaactual", nullable = false)
    private double cobradosemanaactual;

    @Column(name = "cobradosemanapasada", nullable = false)
    private double cobradosemanapasada;

    @Column(name = "ventasemanaactual", nullable = false)
    private double ventasemanaactual;

    @Column(name = "ventasemanapasada", nullable = false)
    private double ventasemanapasada;


    public Long getReparto() {
        return id;
    }

    public Long getClientesnuevos() {
        return clientesnuevos;
    }

    public double getCobradosemanaactual() {
        return cobradosemanaactual;
    }

    public double getCobradosemanapasada() {
        return cobradosemanapasada;
    }

    public double getVentasemanaactual() {
        return ventasemanaactual;
    }

    public double getVentasemanapasada() {
        return ventasemanapasada;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id" + id +
                ", nombre = '" + clientesnuevos + '\'' +
                ", hola = '" + cobradosemanaactual + '\'' +
                ", 2 = '" + cobradosemanapasada + '\'' +
                ", 3 = '" + ventasemanaactual + '\'' +
                ", 4 = '" + ventasemanapasada + '\'' +
                '}';

    }

}
