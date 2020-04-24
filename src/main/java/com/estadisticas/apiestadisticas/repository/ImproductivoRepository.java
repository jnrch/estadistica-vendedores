package com.estadisticas.apiestadisticas.repository;

import com.estadisticas.apiestadisticas.model.Improductivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImproductivoRepository extends JpaRepository <Improductivo, Long> {
}
