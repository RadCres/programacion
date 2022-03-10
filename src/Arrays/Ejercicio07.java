package Arrays;

import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {

//		// Diseña un programa Java que llene mediante un bucle for un array de 10 elementos
//		enteros con valores al azar entre 1 y 100. Alternar valores positivos y negativos. Más
//		tarde, mediante un bucle while muestra el contenido del array.
		int[] numero = new int[10];
		Random rnd = new Random();
		int contador = 0;

		for (int i = 0; i < numero.length; i++) {
			numero[i] = rnd.nextInt(100) + 1;
			if (i % 2 != 0) {
				numero[i] *= -1;
			}

		}
		while (contador < numero.length) {
			System.out.println(numero[contador]);
			contador++;

		}

	}

}
