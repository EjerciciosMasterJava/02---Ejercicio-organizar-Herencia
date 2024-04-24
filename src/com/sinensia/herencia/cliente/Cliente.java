package com.sinensia.herencia.cliente;

import com.sinensia.herencia.persona.Persona;

public class Cliente extends Persona {

	private Long id;

	public Cliente(Long id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", Dni=" + getDni() + ", Nombre=" + getNombre() + "]";
	}

	
	
}
