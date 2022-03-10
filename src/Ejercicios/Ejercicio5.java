package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println("Introduzca un número entre 1 y 100 ");
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int tabla = 0;
		numero = entrada.nextInt();
		if (numero >= 1 && numero <= 100) {
			System.out.println("La tabla de multiplicar del número " + numero + " es ");
			for (int i = 0; i < 11; i++) {
				tabla = i * numero;
				System.out.println(tabla);
			}
		} else
			System.out.println("Error");
	}
}
