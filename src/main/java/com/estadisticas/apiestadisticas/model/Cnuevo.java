package com.estadisticas.apiestadisticas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cnuevos")
public class Cnuevo implements Serializable {

    @Id
    private Long id;

    @JsonProperty("mesactual")
    @Column(name = "cantidad", nullable = false)
    private Long cantidad;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reparto_id")
    @JsonIgnore
    private Reparto reparto;

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }
    public Reparto getReparto() {
        return reparto;
    }

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }

}
