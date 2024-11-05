package com.asignacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asignacion.entity.Asignacion;

@Repository
public interface AsignacionRepository extends JpaRepository<Asignacion, Long> {
}