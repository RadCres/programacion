package Ejercicio1;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		Cliente C1 = new Cliente("12345678-R", "Pepito", "Perez Gomez", 666666666);
		Cliente C2 = new Cliente("12345679-R", "Jaimito", "Perez Gomez", 777777777);

		Vehiculo V1 = new Vehiculo("M2233AM", "Seat", "Toledo", 20.0, true);
		Vehiculo V2 = new Vehiculo("BA1234KL", "Audi", "A1", 34.20, false);
		// El LocalDate.now indica el día de hoy, para poner tú una fecha es:
		// LocalDate.of(2022/02/15)
		VehiculoAlquilado VA1 = new VehiculoAlquilado(V1, C1, LocalDate.now(), 30);
		VehiculoAlquilado VA2 = new VehiculoAlquilado(V2, C2, LocalDate.of(2022, 02, 18), 30);

		VA1.setSliente(C1);
		VA2.setSliente(C2);
		
		System.out.println("¿Quién alquila el vehículo 1? "+ VA1.getSliente().getNombre());
		VA1.getimportedelAlquiler();
	}

}
