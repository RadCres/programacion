package Ejercicios;

import java.util.Scanner;

public class Ejercicio19a {

	public static void main(String[] args) {
		System.out.println("Introduce dos números");
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int numeroB = 0;
		int contador = 0;
		numero = entrada.nextInt();
		numeroB = entrada.nextInt();
		if (numero > numeroB) {
			for (int i = numero; i >= numeroB; i--) {
				System.out.println(i);
				contador = contador + 1;// o contador++;
			}
		} else {
			for (int i = numeroB; i >= numero; i--) {
				System.out.println(i);
				contador = contador + 1;// o contador++;
			}
		}
		System.out.println("En total hay " + contador+ " números.");

	}
}
