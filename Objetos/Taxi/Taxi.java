package Taxi;

public class Taxi {

	private String matricula;
	private String distrito;
	private String motor;
	private String latitud;
	private String longitud;

	public Taxi(String matricula, String distrito, String motor, String latitud, String longitud) {
		this.matricula = matricula;
		this.distrito = distrito;
		this.motor = motor;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Taxi(String matricula, String distrito, String motor) {
		super();
		this.matricula = matricula;
		this.distrito = distrito;
		this.motor = motor;
		this.latitud = "0";
		this.longitud = "0";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	
	public static boolean comprobarDistritos(Taxi taxiUno,Taxi taxiDos) {
		if (taxiUno.getDistrito().equals(taxiDos.getDistrito())) {
			return true;
		}
		return false;
	}

	public String coordenadas() {
		return this.latitud + " " + this.longitud;

	}

}
