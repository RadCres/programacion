package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
//		Dise�a un programa Java que solicite un entero positivo e imprima los n�meros que
//		van desde ese entero hasta uno. Un n�mero por cada l�nea.
		Scanner entrada = new Scanner (System.in);
		int a =0;
		System.out.println("introduce un n�mero");
		a = entrada.nextInt();
		for (int i = a; i >=1; i--) {
			System.out.println(i);
		}
	}

}
