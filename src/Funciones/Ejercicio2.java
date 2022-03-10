package Funciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un año");
		int anno = entrada.nextInt();

		System.out.println(anno(anno));
	}

	public static boolean anno(int anno) {
		if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
