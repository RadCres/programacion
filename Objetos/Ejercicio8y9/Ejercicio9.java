package Ejercicio8y9;

import java.util.Scanner;

public class Ejercicio9 {
	private String[] opciones;

	public Ejercicio9(String[] opciones) {
		this.opciones = opciones;
	}

	public String mostrarMenu() {
		Scanner entrada = new Scanner(System.in);
// mostrar opciones menu
		for (String string : opciones) {
			System.out.println(string);
		}
		String opc = entrada.next();
		return opc;
	}
}