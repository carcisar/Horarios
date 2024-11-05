package com.empleados.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.empleados.entity.Empleado;


public interface EmpleadoService {

	public List<Empleado> findAll();

	public Optional<Empleado> findById(Long id);

	public Empleado save(Empleado empleado);

	public void delete(Long id);

}