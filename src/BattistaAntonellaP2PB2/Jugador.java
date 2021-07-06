package BattistaAntonellaP2PB2;

public class Jugador extends Persona implements IMiembro{
	
	private String tipoMiembro;
	private String equipo;
	
	public Jugador(Integer dni, String nombreYApellido) {
		super(dni, nombreYApellido);
		
	}

	@Override
	public String getTipo() {
		return this.tipoMiembro;
	}

	@Override
	public String setEquipo() {
		return this.equipo ="Jugador";
	}

	

}
