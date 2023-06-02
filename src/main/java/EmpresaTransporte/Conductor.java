package EmpresaTransporte;

import java.util.ArrayList;
import EmpresaTransporte.Viaje;

public class Conductor {
	private String nombre;
	private String apellido;
	private int numeroTelefono;
	private String tipoLicencia;
	private ArrayList<Viaje> viajes = new ArrayList<Viaje>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroTelefono() {
		return this.numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getTipoLicencia() {
		return this.tipoLicencia;
	}

	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public Conductor() {
		throw new UnsupportedOperationException();
	}
}