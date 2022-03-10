package Arrays;

import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] numero = new int[10];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = rnd.nextInt(100) + 1;
			System.out.println(numero[i]);
		}
		System.out.println(mayor(numero));
	}

	public static int mayor(int numero[]) {
		int mayor = 0;
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] > mayor) {
				mayor = numero[i];
			}
		}
		return mayor;
	}

}
