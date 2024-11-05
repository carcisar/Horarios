package com.turno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turno.entity.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {
}