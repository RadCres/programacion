package Arrays;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
//		Dise�a un programa Java que trabaje con un array de 10 elementos, como este int []
//				a= {1,66,15,33,2,34,65,39,15,78}.
//				a. El programa contendr� una funci�n que buscar� un valor en el array y
//				devolver� la primera posici�n donde fue encontrado o -1 en caso de no
//				encontrarlo. La funci�n llevar� dos par�metros, el elemento buscado y el array.
//				b. Dise�a tambi�n una funci�n que cuente las veces que aparece o se repite un
//				valor en el array. La funci�n llevar� dos par�metros, el elemento buscado y el
//				array.
		Scanner entrada = new Scanner(System.in);
		int[] numero = { 1, 66, 15, 33, 2, 34, 65, 39, 15, 78 };
		System.out.println("Introduce un n�mero");
		int numeros = entrada.nextInt();
		int buscavalor = buscavalor(numero, numeros);
		System.out.println("El n�mero " + numeros + " se encuentra en la posicion " +buscavalor);
		int repeticion = repeticion (numero, numeros);
		System.out.println("El n�mero " + numeros + " se repite " + repeticion + " vez");
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
