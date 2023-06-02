package EmpresaTransporte;

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

	public Viaje() {
		throw new UnsupportedOperationException();
	}
}