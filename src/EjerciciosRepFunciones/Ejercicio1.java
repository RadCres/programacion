package EjerciciosRepFunciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		int fin = 10;
		piramide(fin);
	}

	public static void piramide(int numero) {
		for (int i = 1; i <= numero; i++) {
			System.out.print(i + "-->");

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
