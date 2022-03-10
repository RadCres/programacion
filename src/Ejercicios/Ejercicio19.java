package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
//		Utilización de contadores. Diseña un programa Java que pida dos números y muestre
//		en pantalla los números que van del mayor al menor. Al final debe imprimir cuántos
//		números se han mostrado.

		Scanner entrada = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int contador = 0;
		System.out.println("Introduce dos números");
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

		System.out.println("En total hay " + contador + " números.");
	}

}
