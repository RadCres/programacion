package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Diseña un programa Java que llene mediante un bucle for un array de 10
		// elementos enteros con valores al azar entre 1 y 100. Hecho esto, el programa
		// pedirá al usuario una posición de inicio y otra de fin y sumará los valores
		// del
		// array entre esas posiciones (incluidas). Controlar que las posiciones sean
		// válidas. Diseña una función que reciba como parámetro el array, las
		// posiciones
		// de inicio y fin y devuelva la suma de esos valores.
		Scanner entrada = new Scanner(System.in);
		int[] array = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100) + 1;
			System.out.println(array[i]);
		}
		int inicio = 0;
		int fin = 0;
		int mayor = 0;
		int menor = 0;
		System.out.println("Introduce las posiciones ");
		inicio = entrada.nextInt();
		fin = entrada.nextInt();

		if (inicio >= 0 && inicio <= 9) {
			if (fin >= 0 && inicio <= 9) {
				if (inicio > fin) {
					mayor = inicio;
					menor = fin;
				} else {
					menor = inicio;
					mayor = fin;
				}
			}
		}

		int suma = suma(array, menor, mayor);
		System.out.println(suma);
	}

	public static int suma(int numero[], int menor, int mayor) {
		int suma = 0;
		for (int i = menor; i <= mayor; i++) {
			suma += numero[i];

		}
		return suma;
	}

}
