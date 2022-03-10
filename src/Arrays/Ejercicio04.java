package Arrays;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número de elementos");
		int elementos;
		elementos = entrada.nextInt();
		int[] numero = new int[elementos];
		int impar=3;
		for (int i = 0; i < numero.length; i++) {
			numero[i] = impar;
			impar=numero[i]+2;
			System.out.println(numero[i]);
		}
	}

}
