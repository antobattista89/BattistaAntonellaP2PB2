package BattistaAntonellaP2PB2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Torneo {

	private String nombre;
	private List<Persona> miembro;
	
	public Torneo(String nombre) {
		this.nombre = nombre;
		this.miembro = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarMiembro(Persona nuevaPersona) {
		this.miembro.add(nuevaPersona);
	}
	
	public Integer getCantidadMiembros() {
		return this.miembro.size();
	}

}
