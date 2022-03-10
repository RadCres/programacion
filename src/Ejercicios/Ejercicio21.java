package Ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
//		Diseña un programa en Java que pida números al usuario hasta que este teclee el
//		cero. El programa deberá mostrar la suma de todos ellos y cuántos han sido tecleados.

		Scanner entrada = new Scanner(System.in);
		int numeros = 0;
		int contador = 0;
		int suma = 0;
		do {
			System.out.println("Introduzca un número");
			numeros = entrada.nextInt();
			if (numeros != 0) {
				contador++;
				numeros += suma;
				suma = numeros;
				
			}
			else {
				System.out.println("Ha tecleado "+contador+ " números.");
				System.out.println("La suma de todos ellos es "+suma);
			}
		} while (numeros != 0);
		{

		}
	}
}