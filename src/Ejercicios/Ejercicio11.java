package Ejercicios;


public class Ejercicio11 {

	public static void main(String[] args) {
//		Diseña un programa Java que muestre en pantalla los enteros entre 1 y 20 y en la
//		misma línea el cubo de cada número.

		
		int cubo=0;
		for (int i = 0; i < 21; i++) {
			cubo = i*3;
			System.out.println(i +" \t"+cubo);
		}
	}

}
