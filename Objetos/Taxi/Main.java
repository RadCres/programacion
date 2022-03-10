package Taxi;

public class Main {

	public static void main(String[] args) {

		Taxi taxiUno = new Taxi("2255-L", "San Roque", "Diesel", "25", "33");
		Taxi taxiDos = new Taxi("3215-M", "San Roque", "Gasolina", "14", "74");

		System.out.println(taxiUno.toString());
		System.out.println(taxiDos.toString());

		System.out.println("\n" + Taxi.comprobarDistritos(taxiUno, taxiDos));

		System.out.println("\nMismo distrito " + taxiUno.getMatricula() + " y " + taxiDos.getMatricula());

		System.out.println("\n" + taxiUno.coordenadas());
		System.out.println("\n" + taxiDos.coordenadas());
	}

}
