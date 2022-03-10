package Ejercicios;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		String respuesta="";
		do {
		System.out.println("Escriba un año");
		Scanner entrada = new Scanner(System.in);
		Scanner res = new Scanner(System.in);
		int bisiesto=entrada.nextInt();
		if (bisiesto%4==0 && (bisiesto%100!=0 || bisiesto%400==0)) {
			System.out.println("El año "+bisiesto+" es un año bisiesto");
		}else {
			System.out.println("El año "+bisiesto+" no es un año bisiesto");
		}
		System.out.println("¿Desea repetir? S/N");
		respuesta = res.nextLine();
	}while(respuesta.equals("S"));
		

}
}