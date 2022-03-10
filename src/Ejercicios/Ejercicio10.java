package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
//		Diseña un programa Java que solicite un número al usuario y diga si es par o impar.
//		El programa debe dar al usuario la posibilidad de repetir el proceso.

		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		String respuesta;
		do {
			System.out.println("Introduce un número");
			numero = entrada.nextInt();
			if (numero % 2 == 0) {
				System.out.println("Su número es par");

			} else
				System.out.println("Su número es impar");

			System.out.println("¿Quieres repetir? S/N");
			respuesta = entrada.next();

		} while (respuesta.equals("S"));

	}
}
