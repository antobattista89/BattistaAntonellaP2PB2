package BattistaAntonellaP2PB2;

public class DirectorTecnico extends Persona implements IMiembro, IDirectorTecnico{

	private Integer edad;
	private String tipoMiembro;
	private String equipo;

	public DirectorTecnico(Integer dni, String nombreYApellido,Posicion tipoPosicion) {
		super(dni, nombreYApellido);
		this.edad=edad;
		this.tipoMiembro=tipoMiembro;
	
	}
	
	@Override
	public String getTipo() {
		return this.tipoMiembro;
	}

	@Override
	public String setEquipo() {
		return this.equipo ="DT";
	}

	@Override
	public Integer getEdad() {
		return this.edad;
	}
	
}
	
	
