package com.turno.service;

import java.util.List;
import java.util.Optional;

import com.turno.entity.Turno;

public interface TurnoService {
	
	 public List<Turno> findAll();

	    public Optional<Turno> findById(Long id);

	    public Turno save(Turno turno);

	    public void delete(Long id);

}
