package com.estadisticas.apiestadisticas.controller;

import com.estadisticas.apiestadisticas.model.Cnuevo;
import com.estadisticas.apiestadisticas.repository.CnuevoRepository;
import com.estadisticas.apiestadisticas.repository.RepartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RestController
@RequestMapping("/api")
public class CnuevoController {

    private Cnuevo cnuevo;

    @Autowired
    CnuevoRepository cnuevoRepository;

    @Autowired
    RepartoRepository repartoRepository;

    @GetMapping("/cnuevo")
   public Page<Cnuevo> findAllCnuevo(Pageable pageable) {
       return cnuevoRepository.findAll(pageable);
   }
}
