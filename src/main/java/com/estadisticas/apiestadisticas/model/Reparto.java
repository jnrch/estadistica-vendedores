package com.estadisticas.apiestadisticas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({ "id", "nombre", "improductivo", "cnuevo", "venta", "cobrado" })
@Entity
@Table(name = "repartos")
public class Reparto implements Serializable {

    @JsonProperty("reparto")
    @Id
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "reparto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Improductivo> improductivo = new ArrayList<>();

    //funciona pero devuelve cantirdad
    @OneToMany(mappedBy = "reparto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cnuevo> cnuevo = new ArrayList<>();

    //funciona pero devuelve venta
    @OneToMany(mappedBy = "reparto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Venta> venta = new ArrayList<>();

    //funciona pero devuelve cobrado
    @OneToMany(mappedBy = "reparto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cobrado> cobrado = new ArrayList<>();

    //funciona pero devuelve cobrado
    @OneToMany(mappedBy = "reparto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Fiado> fiado = new ArrayList<>();

    public List<Fiado> getFiado() {
        return fiado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Improductivo> getImproductivo() {
        return improductivo;
    }

    @JsonProperty("clientesnuevos")
    public List<Cnuevo> getCnuevo() {

        return cnuevo;
    }

    @JsonProperty("venta")
    public List<Venta> getVenta() {

        return venta;
    }

    @JsonProperty("cobrado")
    public List<Cobrado> getCobrado() {

        return cobrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImproductivo(List<Improductivo> improductivo) {
        this.improductivo = improductivo;
    }

/*    public void setCnuevo(List<Cnuevo> cnuevo) {
        this.cnuevo = cnuevo;
    }*/
}
