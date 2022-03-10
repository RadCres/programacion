package Ejercicio1;

import java.time.LocalDate;

public class VehiculoAlquilado {
	
	private Vehiculo vehiculo;
	private Cliente sliente;
	private LocalDate FechaDeAlquilet;
	private int NumeroDiasAlquiladosPorTarifa;
	
	
	
	public VehiculoAlquilado(Vehiculo vehiculo, Cliente sliente, LocalDate fechaDeAlquilet,
			int numeroDiasAlquiladosPorTarifa) {
		super();
		this.vehiculo = vehiculo;
		this.sliente = sliente;
		FechaDeAlquilet = fechaDeAlquilet;
		NumeroDiasAlquiladosPorTarifa = numeroDiasAlquiladosPorTarifa;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Cliente getSliente() {
		return sliente;
	}
	public void setSliente(Cliente sliente) {
		this.sliente = sliente;
	}
	public LocalDate getFechaDeAlquilet() {
		return FechaDeAlquilet;
	}
	public void setFechaDeAlquilet(LocalDate fechaDeAlquilet) {
		FechaDeAlquilet = fechaDeAlquilet;
	}
	public int getNumeroDiasAlquiladosPorTarifa() {
		return NumeroDiasAlquiladosPorTarifa;
	}
	public int setNumeroDiasAlquiladosPorTarifa() {
		return NumeroDiasAlquiladosPorTarifa;
	}
	public double getimportedelAlquiler() {
		double importeTotal= (this.getNumeroDiasAlquiladosPorTarifa()*this.vehiculo.getTarifa());
		System.out.println(importeTotal);
		return importeTotal;
	}
}
