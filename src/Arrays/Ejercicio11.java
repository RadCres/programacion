package Arrays;

public class Ejercicio11 {

	public static void main(String[] args) {
//		11. Diseña un programa que partiendo de un array como este
//		String [] nombres = {"Elena", "Ana", "Gema", "Pablo", "Sara", "David"};
//		muestre en pantalla cada una de esas cadenas y el número de caracteres de la misma.
		String[] nombres = { "Elena", "Ana", "Gema", "Pablo", "Sara", "David" };

		for (int i = 0; i < nombres.length; i++) {
			int contador = nombres[i].length();
			System.out.println(nombres[i] + " " + contador);
		}
	}

}
