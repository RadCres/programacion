package Ejercicios;

import java.util.Scanner;

public class Ejercicio090 {

	public static void main(String[] args) {
		// Igual que el anterior, pero debe mostrar tres n�meros por cada l�nea

		// Datos

		int numero = 0;
		int i;
		Scanner entrada = new Scanner(System.in);

		// Algoritmo

		System.out.println("Introduce un n�mero entero y positivo");
		numero = entrada.nextInt();

		for (i = numero; i > 0; i--) {
			if (i > 0) {
				System.out.print(i-- + " ");
			}
			if (i > 0) {
				System.out.print(i-- + " ");

			}

			if (i > 0) {
				System.out.println(i);
			}

		}

	}

}
