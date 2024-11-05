package com.empleados.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@NotBlank
	private String nombre;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String telefono;
	
	@NotBlank
	private String apellido;
	
	private String preferencias;
	private String disponibilidad;
	private Integer num_dias_trabajo;
	private Integer num_dias_libres;
	private Integer num_dias_guardia;
	private Integer num_turnos_man;
	private Integer num_turnos_tar;
	private Integer num_turnos_noc;
	private Integer total_horas;

	public Empleado() {
	}
	
	public Empleado(Long id, @NotBlank String nombre, @NotBlank @Email String email, @NotBlank String telefono,
			@NotBlank String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.apellido = apellido;
	}
	
	public Empleado(Long id, @NotBlank String nombre, @NotBlank @Email String email, @NotBlank String telefono,
			@NotBlank String apellido, String preferencias, String disponibilidad, Integer num_dias_trabajo,
			Integer num_dias_libres, Integer num_dias_guardia, Integer num_turnos_man, Integer num_turnos_tar,
			Integer num_turnos_noc, Integer total_horas) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.apellido = apellido;
		this.preferencias = preferencias;
		this.disponibilidad = disponibilidad;
		this.num_dias_trabajo = num_dias_trabajo;
		this.num_dias_libres = num_dias_libres;
		this.num_dias_guardia = num_dias_guardia;
		this.num_turnos_man = num_turnos_man;
		this.num_turnos_tar = num_turnos_tar;
		this.num_turnos_noc = num_turnos_noc;
		this.total_horas = total_horas;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public Integer getNum_dias_trabajo() {
		return num_dias_trabajo;
	}

	public void setNum_dias_trabajo(Integer num_dias_trabajo) {
		this.num_dias_trabajo = num_dias_trabajo;
	}

	public Integer getNum_dias_libres() {
		return num_dias_libres;
	}

	public void setNum_dias_libres(Integer num_dias_libres) {
		this.num_dias_libres = num_dias_libres;
	}

	public Integer getNum_dias_guardia() {
		return num_dias_guardia;
	}

	public void setNum_dias_guardia(Integer num_dias_guardia) {
		this.num_dias_guardia = num_dias_guardia;
	}

	public Integer getNum_turnos_man() {
		return num_turnos_man;
	}

	public void setNum_turnos_man(Integer num_turnos_man) {
		this.num_turnos_man = num_turnos_man;
	}

	public Integer getNum_turnos_tar() {
		return num_turnos_tar;
	}

	public void setNum_turnos_tar(Integer num_turnos_tar) {
		this.num_turnos_tar = num_turnos_tar;
	}

	public Integer getNum_turnos_noc() {
		return num_turnos_noc;
	}

	public void setNum_turnos_noc(Integer num_turnos_noc) {
		this.num_turnos_noc = num_turnos_noc;
	}

	public Integer getTotal_horas() {
		return total_horas;
	}

	public void setTotal_horas(Integer total_horas) {
		this.total_horas = total_horas;
	}
	
	

	
}