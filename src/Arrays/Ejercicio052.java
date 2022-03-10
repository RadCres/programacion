package Arrays;

import java.util.Scanner;

public class Ejercicio052 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca una contraseña");
		String password = entrada.next();
		System.out.println(contraseña(password));
	}

	public static boolean contraseña(String contrasena) {
		if (contrasena.length() >= 4 && contrasena.length() <= 20 && contrasena.length() % 2 == 0) {
			return true;
		} else
			return false;
	}

}
