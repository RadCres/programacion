package Arrays;

import java.util.Random;

public class Ejercicio053 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] arrays = new int[10];
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = rnd.nextInt(100) + 1;
			System.out.println(arrays[i]+ " ");
		}
		System.out.println("\nEl mayor valor del array es "+ mayorValor(arrays));
	}

	public static int mayorValor(int array[]) {
		int mayor = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}

}
