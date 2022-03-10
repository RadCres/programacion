package Ejercicio8y9;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		GestionDvd peliculas = new GestionDvd();
		String[] menu = {"Menú:",
				"1. Listar peliculas",
				"2. Película de más duración",
				"3. Introduzca un género para mostrar las películas de ese genero",
				"4. Fin",
				"\nIntroduzca un número del menú"};
		Ejercicio9 menuNieves = new Ejercicio9(menu);
		String opcion;
		do {
			opcion = menuNieves.mostrarMenu();
			switch (opcion) {
			case "1":
				System.out.println("Listado Películas");
				peliculas.mostrarListaPeliculas();
				break;

			case "2":
				System.out.println("Película de mayor duración");
				peliculas.mostrarPeliculaMayorDuracion();
				break;
			case "3":
				System.out.println("Película de ese género");
				peliculas.pedirGeneroyMostrarTituloDelGenero();
				break;
			case "4":
				System.out.println("Hasta pronto");
				break;

			default:
				System.out.println("Número erróneo. ¿Quiere volver a intentar?");

			}
		} while (!opcion.equals("4"));
	}
	
}
