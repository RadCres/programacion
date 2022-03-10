package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
//		Diseña un programa que muestre en pantalla un menú con tres opciones: sumar,
//		restar y salir. Programa cada opción y utiliza un bucle para que pueda repetirse el
//		menú hasta que el usuario elija salir. Solicita dos números para llevar a cabo cada
//		opción del menú.
		Scanner entrada = new Scanner(System.in);

		String opcionString;
		int numero = 0;
		int numero_uno = 0;
		int numero_dos = 0;

		do {
			System.out.println("1. Menú sumar");
			System.out.println("2. Menú restar");
			System.out.println("3. Menú salir");

			numero = entrada.nextInt();

			switch (numero) {
			case 1:
				opcionString = "Sumar";
				System.out.println(opcionString);
				numero = 1;
				System.out.println("Introduce dos números ");
				numero_uno = entrada.nextInt();
				numero_dos = entrada.nextInt();
				int suma = numero_uno + numero_dos;
				System.out.println("La suma de estos números es de " + suma);
				break;
			case 2:
				opcionString = "Restar";
				System.out.println(opcionString);
				numero = 2;
				System.out.println("Introduce dos números ");
				numero_uno = entrada.nextInt();
				numero_dos = entrada.nextInt();
				int resta = numero_uno - numero_dos;
				System.out.println("La resta de estos números es de " + resta);
				break;
			case 3:
				opcionString = "Salir";
				numero = 3;
				System.out.println(opcionString);
				break;
			default:
				System.out.println("*Opción errónea*");
				break;
			}
		} while (numero != 3);

	}
}
