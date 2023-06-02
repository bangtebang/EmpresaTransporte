package EmpresaTransporte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import EmpresaTransporte.Bus;

public class EmpresaBus {
	private String rut;
	private String direccion;
	private String redesSociales;
	private ArrayList<Bus> buses = new ArrayList<Bus>();
	private ArrayList<Conductor> conductor = new ArrayList<Conductor>();

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRedesSociales() {
		return this.redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public Bus agregarBus(String patente, String marca, String modelo) {
		Bus bus = new Bus(patente, marca,modelo);
		this.buses.add(bus);
		return bus;
	}


	public Conductor agregarConductor(String nombre, String apelllido, int numeroTelefono, String tipoLicencia) {
		Conductor conductor = new Conductor(nombre,apelllido,numeroTelefono,tipoLicencia);
		this.conductor.add(conductor);
		return conductor;
	}
	public List<Viaje> asociarViajesBus(Date horaSalida, Date horaLlegada, String patente, String marca, String modelo) {
		throw new UnsupportedOperationException();
	}

	public List<Bus> quitarBusPatente(String patente) {
		throw new UnsupportedOperationException();
	}

	public List<Viaje> visualizarBusesHoraSalidaCiudadDestino(Date horaSalida, String nombre, String latitud, String longitud) {
		throw new UnsupportedOperationException();
	}

	public EmpresaBus(String rut, String direccion, String redesSociales) {
		this.rut=rut;
		this.direccion=direccion;
		this.redesSociales=redesSociales;
		this.buses= new ArrayList<Bus>();
		this.conductor= new ArrayList<Conductor>();
	}
}