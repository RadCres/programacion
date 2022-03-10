package Ejercicios;

import java.util.Scanner;

public class Ejercicio6a {

	public static void main(String[] args) {
		int entero=0;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un número entero y positivo");
		entero = entrada.nextInt();
		for (int i = 1; i <= entero; i++) {
			System.out.print(i);
		}
	}

}
