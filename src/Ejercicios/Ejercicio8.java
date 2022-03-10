package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
//		Diseña un programa Java que solicite un entero positivo e imprima los números que
//		van desde ese entero hasta uno. Un número por cada línea.
		Scanner entrada = new Scanner (System.in);
		int a =0;
		System.out.println("introduce un número");
		a = entrada.nextInt();
		for (int i = a; i >=1; i--) {
			System.out.println(i);
		}
	}

}
