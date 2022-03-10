package Arrays;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
//		Diseña un programa Java que trabaje con un array de 10 elementos, como este int []
//				a= {1,66,15,33,2,34,65,39,15,78}.
//				a. El programa contendrá una función que buscará un valor en el array y
//				devolverá la primera posición donde fue encontrado o -1 en caso de no
//				encontrarlo. La función llevará dos parámetros, el elemento buscado y el array.
//				b. Diseña también una función que cuente las veces que aparece o se repite un
//				valor en el array. La función llevará dos parámetros, el elemento buscado y el
//				array.
		Scanner entrada = new Scanner(System.in);
		int[] numero = { 1, 66, 15, 33, 2, 34, 65, 39, 15, 78 };
		System.out.println("Introduce un número");
		int numeros = entrada.nextInt();
		int buscavalor = buscavalor(numero, numeros);
		System.out.println("El número " + numeros + " se encuentra en la posicion " +buscavalor);
		int repeticion = repeticion (numero, numeros);
		System.out.println("El número " + numeros + " se repite " + repeticion + " vez");
	}

	public static int buscavalor(int numero[], int numero1) {
		int posicion = 0;
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == numero1) {
				posicion=i;
				i= numero.length;
			} else
				posicion = -1;
		}
		return posicion;

	}
	public static int repeticion (int b[],int numero1) {
		int j=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i]==numero1) {
				j++;
			}
			
		}return j;
	}
}
