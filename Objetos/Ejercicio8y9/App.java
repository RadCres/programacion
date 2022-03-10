package Ejercicio8y9;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		GestionDvd peliculas = new GestionDvd();
		String[] menu = {"Men�:",
				"1. Listar peliculas",
				"2. Pel�cula de m�s duraci�n",
				"3. Introduzca un g�nero para mostrar las pel�culas de ese genero",
				"4. Fin",
				"\nIntroduzca un n�mero del men�"};
		Ejercicio9 menuNieves = new Ejercicio9(menu);
		String opcion;
		do {
			opcion = menuNieves.mostrarMenu();
			switch (opcion) {
			case "1":
				System.out.println("Listado Pel�culas");
				peliculas.mostrarListaPeliculas();
				break;

			case "2":
				System.out.println("Pel�cula de mayor duraci�n");
				peliculas.mostrarPeliculaMayorDuracion();
				break;
			case "3":
				System.out.println("Pel�cula de ese g�nero");
				peliculas.pedirGeneroyMostrarTituloDelGenero();
				break;
			case "4":
				System.out.println("Hasta pronto");
				break;

			default:
				System.out.println("N�mero err�neo. �Quiere volver a intentar?");

			}
		} while (!opcion.equals("4"));
	}
	
}
