package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
//		Dise�a un programa Java que solicite dos n�meros enteros al usuario y nos diga si el
//		primero es divisor del segundo. 2 es divisor de 16 ya que al dividir 16 entre 2 el resto
//		de la divisi�n es cero. Dar la opci�n de repetir.
		Scanner entrada = new Scanner(System.in);
		int a=0;
		int b=0;
		String repetir;
		do{
			System.out.println("Introduce dos n�meros");
		a = entrada.nextInt();
		b = entrada.nextInt();
		if (b%a==0 ) {
			System.out.println("El n�mero "+a+ " es divisor de " +b);
		}else 
			System.out.println("El n�mero "+a+ " no es divisor de " +b);
		if (a%b==0) {
			System.out.println("El n�mero "+b+ " es divisor de " +a);

		}else
			System.out.println("El n�mero "+b+ " no es divisor de " +a);
		
		System.out.println();
		System.out.println("�Quieres repetir? S/N");
		repetir = entrada.next();
		}while (repetir.equals("S"));
	}

}
