package Ejercicio3;

public class Consultor extends Trabajador{

	private int horas;
	private double tarifa;
	
	
	public Consultor(String nombre, String puesto, String direccion, String telefono, String nSS, int horas,
			double tarifa) {
		super(nombre, puesto, direccion, telefono, nSS);
		this.horas = horas;
		this.tarifa = tarifa;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getTarifa() {
		return tarifa;
	}


	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public void name() {
		
	}

	@Override
	public String toString() {
		return super.toString()+"Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}



	
	
	
}
