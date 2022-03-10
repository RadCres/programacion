package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
//	Diseña un programa Java que pida un número entero positivo al usuario y muestre
//	cada número desde 1 hasta el número tecleado. Es decir, si el usuario teclea el 7, el
//	programa imprimirá: 1, 2, 3, 4, 5, 6, 7.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número ");
		int numero =0;
		numero =entrada.nextInt();

		if (numero>=0) {
			for (int i = 1; i <= numero; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("Error.");
		}
	}
}