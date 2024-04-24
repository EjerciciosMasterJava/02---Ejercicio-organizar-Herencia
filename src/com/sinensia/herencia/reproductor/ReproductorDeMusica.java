package com.sinensia.herencia.reproductor;

import com.sinensia.herencia.producto.Producto;

public abstract class ReproductorDeMusica extends Producto implements ReproductorInterface{
	private Integer voltaje;
	
	public enum marca{SONY,SENNHEISER}
	
}
