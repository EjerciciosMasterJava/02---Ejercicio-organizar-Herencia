package com.sinensia.herencia.electrodomestico;

import com.sinensia.herencia.producto.Producto;

public abstract class Electrodomestico extends Producto implements ElectrodomesticoInterface{

	public Electrodomestico() {
		super();
	}

	public Electrodomestico(String nombre) {
		super(nombre);
	}


}
