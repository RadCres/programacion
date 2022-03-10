package Arrays;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		Random azar = new Random();

		int[] numero = new int[10];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = azar.nextInt(100) + 1;
			System.out.println("El nº de la posición " + i + " es " + numero[i]);
		}
		if (numero[0] == numero[9]) {

			System.out.println("El número " + numero[0] + " es igual a " + numero[9]);
		} else
			System.out.println("Son distintos");

	}

}
