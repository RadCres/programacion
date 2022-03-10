package EjerciciosRepFunciones;

public class Ejercicio1a {

	public static void main(String[] args) {
		// Datos
		int fin = 10;

		// Algoritmo

		piramide(fin);
	}

	public static void piramide(int numero) {
		for (int i = 1; i <= numero; i++) {
			System.out.print(i + "-->");
			for (int y = 1; y <= i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
