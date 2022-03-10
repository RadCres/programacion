package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
//		// Diseña un programa Java que dibuje tantas filas de 10 asteriscos en la pantalla como
//		indique un entero solicitado al usuario.
		int numero = 0;

		Scanner entrada = new Scanner(System.in);

		// Algortimo

		System.out.println("Introduzca un número entero y positivo");
		numero = entrada.nextInt();
		for (int i = 1; i <= numero; i++) {
			System.out.println("**********");
		}

	}
}