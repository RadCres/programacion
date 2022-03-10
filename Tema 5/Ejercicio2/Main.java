package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Cliente Cliente1 = new Cliente("11111111A","Anakin Skywalker", 123456789);
		Cliente Cliente2 = new Cliente("11111111B","Darth Vader", 123456780);
		
		CuentaBancaria Cuenta1 = new CuentaBancaria(Cliente1, 1000.0, "100");
		CuentaBancaria Cuenta2 = new CuentaBancaria(Cliente2, 5000.0, "200");
		
		Cuenta1.depositar(0);
		Cuenta2.depositar(0);
	}

}
