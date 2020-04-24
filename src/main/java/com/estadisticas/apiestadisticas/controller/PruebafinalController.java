package com.estadisticas.apiestadisticas.controller;

import com.estadisticas.apiestadisticas.exception.ResourceNotFoundException;
import com.estadisticas.apiestadisticas.model.Pruebafinal;
import com.estadisticas.apiestadisticas.repository.PruebafinalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RestController
@RequestMapping("/api")
public class PruebafinalController {

    @Autowired
    PruebafinalRepository pruebafinalRepository;

    @GetMapping("/prueba/{id}")
    public ResponseEntity<Pruebafinal> getRepartoById(@PathVariable(value = "id") Long repartoId)

            throws ResourceNotFoundException {
        Pruebafinal pruebafinal =
                pruebafinalRepository
                        .findById(repartoId)
                        .orElseThrow(() -> new ResourceNotFoundException("Reparto no encontrado en:: " + repartoId));
        return ResponseEntity.ok().body(pruebafinal);
    }
}
