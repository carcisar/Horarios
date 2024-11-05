package com.turno.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turno.entity.Turno;
import com.turno.repository.TurnoRepository;
import com.turno.service.TurnoService;


@Service
public class TurnoServiceImpl implements TurnoService{
	
	@Autowired
    private TurnoRepository turnoRepository;

	@Override
	public List<Turno> findAll() {
		return turnoRepository.findAll();
	}

	@Override
	public Optional<Turno> findById(Long id) {
		return turnoRepository.findById(id);
	}

	@Override
	public Turno save(Turno turno) {
		return turnoRepository.save(turno);
	}

	@Override
	public void delete(Long id) {
		turnoRepository.deleteById(id);
		
	}

}
