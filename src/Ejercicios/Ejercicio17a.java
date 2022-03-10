package Ejercicios;

import java.util.Scanner;

public class Ejercicio17a {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradita = new Scanner(System.in);
		String respuesta = "";

		int numero_uno;
		int numero_dos;
		do {
			System.out.println("Introduzca dos números");
			numero_uno = entrada.nextInt();
			numero_dos = entrada.nextInt();

			if (numero_dos % numero_uno == 0) {
				System.out.println("El " + numero_uno + " es divisor de " + numero_dos);
			} else {
				System.out.println("No es divisor");

			}
			System.out.println();
			System.out.println("¿Quieres repetir? S/N");
			respuesta = entradita.nextLine();
		} while (respuesta.equals("S"));
	}

}
