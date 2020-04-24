package com.estadisticas.apiestadisticas.controller;

import com.estadisticas.apiestadisticas.model.Improductivo;
import com.estadisticas.apiestadisticas.repository.ImproductivoRepository;
import com.estadisticas.apiestadisticas.repository.RepartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RestController
@RequestMapping("/api")
public class ImproductivoController {

    private Improductivo improductivo;

    @Autowired
    ImproductivoRepository improductivoRepository;

    @Autowired
    RepartoRepository repartoRepository;

    @GetMapping("/improductivo")
    public Page<Improductivo> findAllImproductivo(Pageable pageable) { return improductivoRepository.findAll(pageable); }


}
