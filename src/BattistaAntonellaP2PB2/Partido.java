package BattistaAntonellaP2PB2;

import java.util.HashMap;
import java.util.Map;

public class Partido {

	private Integer Id;
	private Map<String, Jugador> nombreEquipo;
	private Map<String, Jugador> jugador;
	
	public Partido(Integer id, Map<String, Jugador> nombreEquipo, Map<String, Jugador> jugador) {
		Id = id;
		this.nombreEquipo = new HashMap<String, Jugador>();
		this.jugador = new HashMap<String, Jugador>();;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	
}
