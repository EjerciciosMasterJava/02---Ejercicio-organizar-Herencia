package com.sinensia.herencia.producto;

public abstract class Producto implements ProductoInterface{
	private Long id;
	private Integer precio;
	private String nombre;
	
	public Producto() {
		super();
	};
	
	public Producto(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", nombre=" + nombre + "]";
	}
}
