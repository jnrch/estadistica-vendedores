package com.estadisticas.apiestadisticas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "improductivos")
public class Improductivo implements Serializable {

    @Id
    private Long id;

    @Column(name = "producto", nullable = false)
    private String producto;

    @Column(name = "prestadoultima", nullable = false)
    private Long prestadoultima;

    @Column(name = "cantidad", nullable = false)
    private Long cantidad;

    @Column(name = "diferencia", nullable = false)
    private Long diferencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reparto_id")
    @JsonIgnore
    private Reparto reparto;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Long getPrestadoultima() {
        return prestadoultima;
    }

    public void setPrestadoultima(Long prestadoultima) {
        this.prestadoultima = prestadoultima;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(Long diferencia) {
        this.diferencia = diferencia;
    }

    public Reparto getReparto() {
        return reparto;
    }

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }
}
