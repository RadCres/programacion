package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
//		Utilizaci�n de acumuladores. Dise�a un programa Java que pida un n�mero entero al
//		usuario y sume los valores que van desde 1 a ese n�mero e imprima el resultado.
		
		Scanner entrada = new Scanner (System.in);
		int numero =0;
		System.out.println("Introduce un n�mero");
		numero = entrada.nextInt();
		int suma =0;
		for (int i = 1; i <= numero; i++) {
		
			suma = suma+i;
			
		}System.out.println(suma);
	}

}
