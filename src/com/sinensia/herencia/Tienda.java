package com.sinensia.herencia;

import java.util.ArrayList;
import java.util.List;

import com.sinensia.herencia.cliente.Cliente;
import com.sinensia.herencia.persona.Persona;
import com.sinensia.herencia.producto.Producto;

public class Tienda implements TiendaInterface {

	List<Producto> productos;

	public Tienda() {
		super();
		productos = new ArrayList();
	}

	@Override
	public boolean venderProducto(Producto producto, Persona cliente) {
		try {
			productos.remove(producto);
			System.out.println(String.format("El producto: %s, se ha vendido al cliente %s." , producto, cliente));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean agregarProducto(Producto p) {
		try {
			productos.add(p);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean eliminarProducto(Producto p) {
		if(productos.remove(p)) {
			System.out.println("Se ha eliminado el producto: " + p);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean agregarListaProductos(List<Producto> lista) {
		 return productos.addAll(lista);
	}

	@Override
	public void listarProductos() {
		productos.forEach(p -> System.out.println("producto:" + p));
	}

	
}
