package com.asignacion.services;

import java.util.List;
import java.util.Optional;

import com.asignacion.entity.Asignacion;

public interface AsignacionService {
	
	public List<Asignacion> findAll();

    public Optional<Asignacion> FindById(Long id);

    public Asignacion save(Asignacion asignacion);

    public void delete(Long id);
}
