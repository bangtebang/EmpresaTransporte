package EmpresaTransporte;

import java.util.ArrayList;
import EmpresaTransporte.Viaje;

public class Bus {
	private String patente;
	private String marca;
	private String modelo;
	private EmpresaBus empresaBus;
	private ArrayList<Viaje> viajes = new ArrayList<Viaje>();

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Bus(String patente, String marca, String modelo) {
		this.modelo= modelo;
		this.marca=marca;
		this.patente=patente;
		this.empresaBus= empresaBus;
		this.viajes= new ArrayList<Viaje>();
	}
	public EmpresaBus getEmpresaBus() {
		return empresaBus;
	}
}