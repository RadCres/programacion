package Ejercicios;

import java.util.Scanner;

public class Ejercicio8b {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un numero entero y positivo");
		int numero;
		numero = entrada.nextInt();
		for (int i = numero; i >= 1; i--) {
			System.out.println(i);
		}
	}

}
