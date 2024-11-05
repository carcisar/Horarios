package com.turno.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Turno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo; // Por ejemplo: "Mañana", "Noche", "Rotativo"
    private String horario; // Horario específico, ej. "08:00 - 16:00"

   
    public Turno() {}
    
   
	public Turno(Long id, String nombre, String tipo, String horario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.horario = horario;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}
    
    

}
