package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
//		Dise�a un programa que muestre en pantalla un men� con tres opciones: sumar,
//		restar y salir. Programa cada opci�n y utiliza un bucle para que pueda repetirse el
//		men� hasta que el usuario elija salir. Solicita dos n�meros para llevar a cabo cada
//		opci�n del men�.
		Scanner entrada = new Scanner(System.in);

		String opcionString;
		int numero = 0;
		int numero_uno = 0;
		int numero_dos = 0;

		do {
			System.out.println("1. Men� sumar");
			System.out.println("2. Men� restar");
			System.out.println("3. Men� salir");

			numero = entrada.nextInt();

			switch (numero) {
			case 1:
				opcionString = "Sumar";
				System.out.println(opcionString);
				numero = 1;
				System.out.println("Introduce dos n�meros ");
				numero_uno = entrada.nextInt();
				numero_dos = entrada.nextInt();
				int suma = numero_uno + numero_dos;
				System.out.println("La suma de estos n�meros es de " + suma);
				break;
			case 2:
				opcionString = "Restar";
				System.out.println(opcionString);
				numero = 2;
				System.out.println("Introduce dos n�meros ");
				numero_uno = entrada.nextInt();
				numero_dos = entrada.nextInt();
				int resta = numero_uno - numero_dos;
				System.out.println("La resta de estos n�meros es de " + resta);
				break;
			case 3:
				opcionString = "Salir";
				numero = 3;
				System.out.println(opcionString);
				break;
			default:
				System.out.println("*Opci�n err�nea*");
				break;
			}
		} while (numero != 3);

	}
}
