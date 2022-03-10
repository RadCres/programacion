package Arrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una contraseña");
		String contraseña = entrada.nextLine();
		System.out.println(contraseña(contraseña));
	}

	public static boolean contraseña(String cadena) {
		int longitud = cadena.length();
		if (longitud >= 4 && longitud <= 20 && longitud % 2 != 0) {
			return true;

		} else {
			return false;
		}
	}
}
