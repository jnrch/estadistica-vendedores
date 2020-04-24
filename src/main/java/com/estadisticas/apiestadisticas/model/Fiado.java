package com.estadisticas.apiestadisticas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "fiados")
public class Fiado implements Serializable {

    @Id
    private Long id;

    @Column(name = "fiadocontado", nullable = false)
    private float fiadocontado;

    @Column(name = "fiadoctacte", nullable = false)
    private float fiadoctacte;

    @Column(name = "fiadoctacte30dias", nullable = false)
    private float fiadoctacte30dias;

    @Column(name = "topefiado", nullable = false)
    private float topefiado;

    @Column(name = "facturacionservicios", nullable = false)
    private float facturacionservicios;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reparto_id")
    @JsonIgnore
    private Reparto reparto;

    public float getFiadocontado() {

        return fiadocontado;
    }

    public float getFiadoctacte() {
        return fiadoctacte;
    }

    public float getFiadoctacte30dias() {
        return fiadoctacte30dias;
    }

    public float getTopefiado() {
        return topefiado;
    }

    public float getFacturacionservicios() {
        return facturacionservicios;
    }

    public Reparto getReparto() {
        return reparto;
    }
}
