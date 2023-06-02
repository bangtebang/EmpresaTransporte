package EmpresaTransporte;

import java.util.ArrayList;
import java.util.Date;

public class Viaje {
	private Date horaSalida;
	private Date horaLlegada;
	private Bus bus;
	private Conductor conductor;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;

	public Date getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraLlegada() {
		return this.horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Viaje(Date horaSalida, Date horaLlegada) {
		this.horaLlegada=horaLlegada;
		this.horaSalida=horaSalida;
		this.conductor= conductor;
		this.ciudadOrigen=ciudadOrigen;
		this.ciudadDestino=ciudadDestino;
		this.bus=bus;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}
	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}


}