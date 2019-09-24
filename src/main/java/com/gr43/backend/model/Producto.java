package com.gr43.backend.model;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String resumen;
	
	@Column
	private String descripcion;
	
	@Column
	private int cantidad;
	
	@Column
	private BigDecimal precio;
	
	@Column
	private Categoria categoría;
	
	@Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] imagen;
	
	@Column
	private boolean activo;


	public Producto() {
		super();
	}

	public Producto(String nombre, String resumen, String descripcion, int cantidad, BigDecimal precio,
			Categoria categoría, boolean activo) {
		super();
		this.nombre = nombre;
		this.resumen = resumen;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
		this.categoría = categoría;
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Categoria getCategoría() {
		return categoría;
	}

	public void setCategoría(Categoria categoría) {
		this.categoría = categoría;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
