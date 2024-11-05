package com.empleados.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.entity.Empleado;
import com.empleados.repository.EmpleadoRepository;
import com.empleados.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository repository;

	@Override
	public List<Empleado> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Empleado> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Empleado save(Empleado empleado) {
		return repository.save(empleado);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
