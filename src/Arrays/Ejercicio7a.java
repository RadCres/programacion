package Arrays;

import java.util.Random;

public class Ejercicio7a {

	public static void main(String[] args) {
		Random rnd = new Random();

		int[] elementos = new int[10];
		int contador = 0;
		for (int i = 0; i < elementos.length; i++) {
			elementos[i] = rnd.nextInt(100) + 1;
			if (i % 2 != 0) {
				elementos[i] *= -1;
			}
		}
		while (contador < elementos.length) {
			System.out.println(elementos[contador]);
			contador++;
		}
	}

}
