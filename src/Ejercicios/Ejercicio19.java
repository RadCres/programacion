package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
//		Utilizaci�n de contadores. Dise�a un programa Java que pida dos n�meros y muestre
//		en pantalla los n�meros que van del mayor al menor. Al final debe imprimir cu�ntos
//		n�meros se han mostrado.

		Scanner entrada = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int contador = 0;
		System.out.println("Introduce dos n�meros");
		a = entrada.nextInt();
		b = entrada.nextInt();
		if (a > b) {
			for (int i = a; i >= b; i--) {
				System.out.println(i);
				contador++;
			}
		}
		if (b > a) {
			for (int i = b; i >= a; i--) {
				System.out.println(i);
				contador++;

			}
		}

		System.out.println("En total hay " + contador + " n�meros.");
	}

}
