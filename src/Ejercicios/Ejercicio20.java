package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
//		Más contadores. Diseña un programa Java que solicite números enteros al usuario y
//		cuente las veces que ha sido tecleado el número cero (0). Dejará de solicitar números
//		cuando se teclee el -9999.
		
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		int contador=0;
		do {
		System.out.println("Introduzca un número");
		numero= entrada.nextInt();
		if (numero==0) {
			contador++;
		}
			
		}while(numero!=-9999); {
			
		}System.out.println("Usted ha tecleado el número 0 "+ contador+ " veces.");
	
		}
}
