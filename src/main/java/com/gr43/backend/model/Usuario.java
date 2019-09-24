package com.gr43.backend.model;

import javax.persistence.Entity;

@Entity
public class Usuario {
	
	private String email;
	
	private String password;
	
	private String nombre;
	
	private String apellidos;

	private boolean activo;
	
	private String direccion;
	
	private int rol;
	
	public Usuario() {
		super();
	}

	public Usuario(String email, String password, String nombre, String apellidos, boolean activo, String direccion) {
		super();
		this.email = email;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.activo = activo;
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}
	
}
