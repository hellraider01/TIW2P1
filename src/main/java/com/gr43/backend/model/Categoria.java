package com.gr43.backend.model;

import javax.persistence.Entity;

@Entity
public class Categoria {
	
	private int padre=0; //categoria padre por defecto 0
	
	private String nombre;
	
	public Categoria() {
		super();
	}

	public Categoria(int padre, String nombre) {
		super();
		this.padre = padre;
		this.nombre = nombre;
	}

	public int getPadre() {
		return padre;
	}

	public void setPadre(int padre) {
		this.padre = padre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
