package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
//		M�s contadores. Dise�a un programa Java que solicite n�meros enteros al usuario y
//		cuente las veces que ha sido tecleado el n�mero cero (0). Dejar� de solicitar n�meros
//		cuando se teclee el -9999.
		
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		int contador=0;
		do {
		System.out.println("Introduzca un n�mero");
		numero= entrada.nextInt();
		if (numero==0) {
			contador++;
		}
			
		}while(numero!=-9999); {
			
		}System.out.println("Usted ha tecleado el n�mero 0 "+ contador+ " veces.");
	
		}
}
