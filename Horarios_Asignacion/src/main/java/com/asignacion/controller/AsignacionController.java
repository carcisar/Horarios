package com.asignacion.controller;

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

import com.asignacion.entity.Asignacion;
import com.asignacion.services.AsignacionService;

@RestController
@RequestMapping("/api/asignaciones")
public class AsignacionController {

    @Autowired
    private AsignacionService asignacionService;

    @GetMapping
    public List<Asignacion> obtenerTodos() {
        return asignacionService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Asignacion> obtenerPorId(@PathVariable Long id) {
        return asignacionService.FindById(id);
    }

    @PostMapping
    public Asignacion guardar(@RequestBody Asignacion asignacion) {
        return asignacionService.save(asignacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        asignacionService.delete(id);
    }
}