package com.sinensia.herencia.aplicacion;

import com.sinensia.herencia.Tienda;
import com.sinensia.herencia.electrodomesticocasa.*;
import com.sinensia.herencia.producto.*;
import com.sinensia.herencia.reproductor.ReproductorDeCD;
import com.sinensia.herencia.cliente.*;
import com.sinensia.herencia.persona.*;

public class AplicacionTienda {
	public static void main(String[] args) {
		
		Tienda tienda = new Tienda();
		
		Producto batidora = new Batidora("batidora");
		batidora.setPrecio(100);
		batidora.setId(1L);
		
		Producto lavadora = new Lavadora();
		lavadora.setNombre("lavadora");
		
		Producto reproductorCD = new ReproductorDeCD();
		reproductorCD.setNombre("reproductor CD");
		reproductorCD.setPrecio(200);
		
		tienda.agregarProducto(batidora);
		tienda.agregarProducto(lavadora);
		tienda.agregarProducto(reproductorCD);
		
		tienda.listarProductos();
		
		tienda.eliminarProducto(lavadora);
		
		Persona cliente1 = new Cliente(111L);
		cliente1.setNombre("pepe");
		
		tienda.venderProducto(reproductorCD, cliente1);
		
		
	}
}
