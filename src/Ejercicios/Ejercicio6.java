package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
//	Dise�a un programa Java que pida un n�mero entero positivo al usuario y muestre
//	cada n�mero desde 1 hasta el n�mero tecleado. Es decir, si el usuario teclea el 7, el
//	programa imprimir�: 1, 2, 3, 4, 5, 6, 7.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un n�mero ");
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