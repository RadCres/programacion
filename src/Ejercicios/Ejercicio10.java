package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
//		Dise�a un programa Java que solicite un n�mero al usuario y diga si es par o impar.
//		El programa debe dar al usuario la posibilidad de repetir el proceso.

		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		String respuesta;
		do {
			System.out.println("Introduce un n�mero");
			numero = entrada.nextInt();
			if (numero % 2 == 0) {
				System.out.println("Su n�mero es par");

			} else
				System.out.println("Su n�mero es impar");

			System.out.println("�Quieres repetir? S/N");
			respuesta = entrada.next();

		} while (respuesta.equals("S"));

	}
}
