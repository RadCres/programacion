package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
//		Diseña un programa Java que calcule el IMC (índice de masa corporal) de una
//		persona conocidas su altura y peso. Dar la opción de repetir. IMC = peso(kg)/talla(m2)

		Scanner entrada = new Scanner (System.in);
		double altura = 0;
		double peso = 0;
		double IMC =0;
		String repetir;
		
		do {
		System.out.println("Introduzca su altura en metros y su peso en Kilogramos");
		altura = entrada.nextDouble();
		peso = entrada.nextDouble();
		IMC = peso / Math.pow(altura, 2);
		System.out.println("Su IMC es de "+IMC+ " Kg/m2");
		System.out.println();
		System.out.println("Quiere repetir? S/N");
		repetir=entrada.next();
		
	}while (repetir.equals("S"));
	}
}
