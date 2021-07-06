package BattistaAntonellaP2PB2;

public abstract class Persona {
	
	private Integer dni;
	private String nombreYApellido;
	
	public Persona(Integer dni, String nombreYApellido) {
		this.dni = dni;
		this.nombreYApellido = nombreYApellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

}
