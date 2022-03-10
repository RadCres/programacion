package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
//		Diseña un programa Java que solicite un entero positivo e imprima los números que
//		van desde ese entero hasta uno. Un número por cada línea.
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		System.out.println("introduce un número");
		numero = entrada.nextInt();
		for (int i = numero; i > 0; i--) {
			System.out.print(i + "\t");
			contador++;
			if (contador % 3 == 0) {
				System.out.println();
			}
		}
	}
}
