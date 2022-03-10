package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
//		Dise�a un programa que muestre en pantalla un men� con las opciones: pares,
//		impares y salir. La opci�n pares muestra los pares entre 40 a 60, la opci�n impares
//		muestra los impares entre 99 y 77. El men� se mostrar� tras cada opci�n hasta que
//		el usuario elija salir. Utiliza los tres tipos de bucles.

		Scanner entrada = new Scanner(System.in);
		String menu;
		int numero = 0;
		do {
			System.out.println("Men�:");
			System.out.println("1.Pares");
			System.out.println("2.Impares:");
			System.out.println("3.Salir");

			numero = entrada.nextInt();

			switch (numero) {
			case 1:
				menu = "Pares";
				System.out.println(menu);

				for (int i = 40; i <= 60; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
				break;
			case 2:
				menu = "Impares";
				System.out.println(menu);
				for (int i = 99; i >= 77; i--) {
					if (i % 2 != 0) {
						System.out.println(i);
					}

				}
				break;
			case 3:
				menu = "Salir";
				System.out.println("Hasta pronto");
				break;
			default:
				System.out.println("*Opci�n err�nea*");
				break;
			}
		} while (numero != 3);
	}

}
