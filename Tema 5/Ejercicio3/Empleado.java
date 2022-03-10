package Ejercicio3;

public class Empleado extends Trabajador{

	private double sueldo;
	private double impuesto;


	public Empleado(String nombre, String puesto, String direccion, String telefono, String nSS, double sueldo,
			double impuesto) {
		super(nombre, puesto, direccion, telefono, nSS);
		this.sueldo = sueldo;
		this.impuesto = impuesto;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public double getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}


	
	@Override
	public String toString() {
		return super.toString()+"Empleado [sueldo=" + sueldo + ", impuesto=" + impuesto + "]";
	}


	
	
}
