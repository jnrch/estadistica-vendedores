package com.estadisticas.apiestadisticas.controller;

import com.estadisticas.apiestadisticas.exception.ResourceBadRequestException;
import com.estadisticas.apiestadisticas.exception.ResourceNotFoundException;
import com.estadisticas.apiestadisticas.model.Reparto;
import com.estadisticas.apiestadisticas.repository.RepartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RestController
@RequestMapping("/api")
public class RepartoController {

    @Autowired
    RepartoRepository repartoRepository;

    @GetMapping("/reparto/{id}")
    public ResponseEntity<Reparto> getRepartoById(@PathVariable(value = "id") Long repartoId)
            throws ResourceNotFoundException {
        Reparto reparto =
                repartoRepository
                        .findById(repartoId)
                        .orElseThrow(() -> new ResourceNotFoundException("Reparto " + repartoId + " no encontrado"));
        return ResponseEntity.ok().body(reparto);
    }
}
