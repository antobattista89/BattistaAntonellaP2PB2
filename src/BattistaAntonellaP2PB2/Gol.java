package BattistaAntonellaP2PB2;

public class Gol {

	private Integer minuto;
	private Integer NroCamiseta;
	private String Equipo;
	
	public Gol(Integer minuto, Integer nroCamiseta, String equipo) {
		this.minuto = minuto;
		this.NroCamiseta = nroCamiseta;
		this.Equipo = equipo;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public Integer getNroCamiseta() {
		return NroCamiseta;
	}

	public void setNroCamiseta(Integer nroCamiseta) {
		NroCamiseta = nroCamiseta;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		Equipo = equipo;
	}
	
	
	
}
