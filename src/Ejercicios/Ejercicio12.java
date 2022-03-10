package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
//		Solicitar dos enteros al usuario y mostrar en pantalla si son pares o impares. El
//		programa dará al usuario la posibilidad de repetir con otros dos números.

		Scanner entrada = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String repetir;

		do {
			System.out.println("Introduce dos números");
			a = entrada.nextInt();
			b = entrada.nextInt();
			if (a % 2 == 0 && b % 2 == 0) {
				System.out.println("Son pares");
			} if (a%2 !=0 && b%2 !=0) {
				System.out.println("Son impares");
			
		} else {
			System.out.println("Uno es par y el otro impar");
		}
			System.out.println();
			System.out.println("¿Quieres repetir? S/N");
			repetir = entrada.next();
	}while (repetir.equals("S"));
}
}
