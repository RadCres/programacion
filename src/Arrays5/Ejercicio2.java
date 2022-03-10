package Arrays5;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
//		Dise�a un programa en java que rellene con n�meros aleatorios un array de 10 posiciones. Pida
//		al usuario dos posiciones, y muestre mediante una funci�n el contenido de esas dos posiciones.

		Scanner entrada = new Scanner(System.in);
		Random rdn = new Random();
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rdn.nextInt(20) + 1;
			System.out.println(numeros[i]);
		}
		System.out.println("Introduzca dos posiciones ");
		int posici�n1 = entrada.nextInt() - 1;
		int posicion2 = entrada.nextInt() - 1;
		mostrarPosiciones(posici�n1, posicion2, numeros);

	}

	public static void mostrarPosiciones(int pos1, int pos2, int[] arrayInt) {
		System.out.println(arrayInt[pos1]);
		System.out.println(arrayInt[pos2]);
	}

}