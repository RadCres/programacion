package Arrays;

import java.util.Random;

public class Ejercicio08 {

	public static void main(String[] args) {
//		Dise�a un programa que llene un array de 10 elementos con valores al azar entre 1 y
//		1000 mediante un bucle while. Luego el programa dar� al usuario la opci�n de obtener
//		la media de los valores del array y el menor de los valores del array. Dise�a una
//		funci�n para cada caso, ambas llevar�n como argumento de entrada el array.

		Random rand = new Random();
		int j = 0;

		int[] numero = new int[10];
		while (j < numero.length) {
			numero[j] = rand.nextInt(1000) + 1;
			System.out.println(numero[j]);
			j++;
		}

		while (j < numero.length) {
			System.out.println(numero[j]);
			j++;
		}
		double media = media(numero);
		System.out.println(media);
		int menor = menor(numero);
		System.out.println(menor);
	}

	public static double media(int numero[]) {
		double media = 0;
		double suma = 0;
		for (int i = 0; i < numero.length; i++) {
			suma += numero[i];
			media = suma / 10;

		}
		return media;
	}

	public static int menor(int numero[]) {
		int menor = numero[0];
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] < menor) {
				menor = numero[i];

			}
		}
		return menor;
	}

}
