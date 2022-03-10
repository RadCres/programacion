package Arrays;

import java.util.Scanner;

public class Ejercicio4 {

	private static Scanner entrada;

	public static void main(String[] args) {
		System.out.println("Introduzca el número de elementos que quiere que contenga el array");
		entrada = new Scanner(System.in);

		int i = entrada.nextInt();
		int[] numero = new int[i];

		int comienzo = 3;
		for (int j = 0; j <= numero.length; j++) {
			numero[j] = comienzo;
			comienzo = comienzo + 2;
			System.out.println(comienzo);
		}

	}

}
