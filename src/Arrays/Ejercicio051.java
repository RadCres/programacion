package Arrays;

import java.util.Scanner;

public class Ejercicio051 {

	public static void main(String[] args) {
		Scanner cadenaCaracteres = new Scanner(System.in);
		System.out.println("Escriba una cadena de caracteres");
		String cadena = cadenaCaracteres.next();
		
		numeroCaracteres(cadena);
		}
	public static void numeroCaracteres(String cadena) {

		int longitud = cadena.length();
		System.out.println("Ha escrito "+longitud+" caracteres.");
	
	}

}
