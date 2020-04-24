package com.estadisticas.apiestadisticas.repository;

import com.estadisticas.apiestadisticas.model.Pruebafinal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruebafinalRepository extends JpaRepository<Pruebafinal, Long> {
}
