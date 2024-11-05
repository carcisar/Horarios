package com.turno.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turno.entity.Turno;
import com.turno.service.TurnoService;

@RestController
@RequestMapping("/api/turnos")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @GetMapping
    public List<Turno> obtenerTodos() {
        return turnoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Turno> obtenerPorId(@PathVariable Long id) {
        return turnoService.findById(id);
    }

    @PostMapping
    public Turno guardar(@RequestBody Turno turno) {
        return turnoService.save(turno);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        turnoService.delete(id);
    }
}