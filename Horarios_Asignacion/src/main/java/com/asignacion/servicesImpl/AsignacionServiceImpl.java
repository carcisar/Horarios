package com.asignacion.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asignacion.entity.Asignacion;
import com.asignacion.repository.AsignacionRepository;
import com.asignacion.services.AsignacionService;


@Service
public class AsignacionServiceImpl implements AsignacionService{
	
	  @Autowired
	    private AsignacionRepository asignacionRepository;

	@Override
	public List<Asignacion> findAll() {
		return asignacionRepository.findAll();
	}

	@Override
	public Optional<Asignacion> FindById(Long id) {
		return asignacionRepository.findById(id);
	}

	@Override
	public Asignacion save(Asignacion asignacion) {
		 return asignacionRepository.save(asignacion);
	}

	@Override
	public void delete(Long id) {
		asignacionRepository.deleteById(id);
		
	}

}
