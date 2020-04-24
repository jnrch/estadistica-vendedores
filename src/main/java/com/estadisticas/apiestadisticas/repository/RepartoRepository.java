package com.estadisticas.apiestadisticas.repository;

import com.estadisticas.apiestadisticas.model.Reparto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepartoRepository extends JpaRepository <Reparto, Long> {
}
