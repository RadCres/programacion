package Ejercicios;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		String respuesta="";
		do {
		System.out.println("Escriba un a�o");
		Scanner entrada = new Scanner(System.in);
		Scanner res = new Scanner(System.in);
		int bisiesto=entrada.nextInt();
		if (bisiesto%4==0 && (bisiesto%100!=0 || bisiesto%400==0)) {
			System.out.println("El a�o "+bisiesto+" es un a�o bisiesto");
		}else {
			System.out.println("El a�o "+bisiesto+" no es un a�o bisiesto");
		}
		System.out.println("�Desea repetir? S/N");
		respuesta = res.nextLine();
	}while(respuesta.equals("S"));
		

}
}