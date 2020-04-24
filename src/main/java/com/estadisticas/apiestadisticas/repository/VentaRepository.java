package com.estadisticas.apiestadisticas.repository;

import com.estadisticas.apiestadisticas.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
