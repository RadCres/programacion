package Arrays5;

import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
//		Dise�a un programa Java que llene mediante un bucle for un array de 10 elementos enteros con
//		valores al azar entre 1 y 100. Tras esto, el programa mostrar� los valores del array desde el final al
//		principio, calcular� y mostrar� la media de esos valores.
			Random  rnd = new Random();
			int [] numeros = new int[10];
			for (int i = 0; i < numeros.length; i++) {
				numeros [i] = rnd.nextInt(100)+1;
				System.out.println(numeros[i]);
			}
			
	}

}
