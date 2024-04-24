package com.sinensia.herencia;

import java.util.List;

import com.sinensia.herencia.cliente.Cliente;
import com.sinensia.herencia.persona.Persona;
import com.sinensia.herencia.producto.Producto;

public interface TiendaInterface {

	/**
	 * Vender un producto de la tienda
	 * @param producto el producto a vender
	 * @param cliente la persona a la que se le vende
	 * @return true si se ha podido vender, false en caso contrario
	 */
	public boolean venderProducto(Producto producto, Persona cliente);
	
	/**
	 * Agregar un producto a la tienda
	 * @param producto el producto
	 * @return true si se ha agregado el producto, false si no
	 */
	public boolean agregarProducto(Producto producto);
	
	/**
	 * Eliminar un producto de la tienda
	 * @param producto el producto
	 * @return true si se ha podido eliminar, false en caso contrario
	 */
	public boolean eliminarProducto(Producto producto);
	
	/**
	 * Agregar lista de productos a la tienda
	 * @param listaProductos la lista de los productos
	 * @return true si se han podido agregar, false en caso contrario
	 */
	public boolean agregarListaProductos(List<Producto> listaProductos);
	
	/**
	 * Mostrar todos los productos de la tienda
	 */
	public void listarProductos();
	
}
