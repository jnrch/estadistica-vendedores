package com.estadisticas.apiestadisticas.repository;

import com.estadisticas.apiestadisticas.model.Cnuevo;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CnuevoRepository extends JpaRepository <Cnuevo, Long>{


}
