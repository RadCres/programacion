package Ejercicios;

public class Ejercicio14 {

	public static void main(String[] args) {
//		Dise�a un programa Java que muestre en pantalla los n�meros del 5 al 25, su
//		cuadrado y su cubo. Recuerda que para usar la potencia se utiliza Math.pow (base,
//		exponente).
		
	
		for (int i = 5; i < 26; i++) {
			int cuadrado=(int) Math.pow(i, 2);
			int cubo=(int) Math.pow(i, 3);
			System.out.println("El cuadrado del n�mero "+i+" es "+ cuadrado+" y su cubo es "+cubo + ".");
		}
	}

}
