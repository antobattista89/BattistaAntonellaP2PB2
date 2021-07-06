package BattistaAntonellaP2PB2;

public class DirectorTecnico extends Persona implements IMiembro{

	private Integer edad;


	public DirectorTecnico(Integer dni, String nombreYApellido) {
		super(dni, nombreYApellido);
	
	}

	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setEquipo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
	
