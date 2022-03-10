package Funciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("Introduce un caracter");
		Scanner entrada = new Scanner(System.in);
		char caracter = entrada.next().charAt(0);
		System.out.println(caracter(caracter));
	}

	public static int caracter(char caracter) {
		int letra = (int) caracter;
		return letra;
	}

}
