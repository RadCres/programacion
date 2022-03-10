package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
//		Utilización de acumuladores. Diseña un programa Java que pida un número entero al
//		usuario y sume los valores que van desde 1 a ese número e imprima el resultado.
		
		Scanner entrada = new Scanner (System.in);
		int numero =0;
		System.out.println("Introduce un número");
		numero = entrada.nextInt();
		int suma =0;
		for (int i = 1; i <= numero; i++) {
		
			suma = suma+i;
			
		}System.out.println(suma);
	}

}
