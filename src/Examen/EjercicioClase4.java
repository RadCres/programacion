package Examen;

import java.util.Scanner;

public class EjercicioClase4 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String[] dia = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		Scanner letra = new Scanner(System.in);
		String respuesta = "";
		do {
			int posicion = entrada.nextInt();
			System.out.println(dia[posicion - 1]);
			System.out.println("Pulse S para repetir");
			respuesta = letra.nextLine();
		} while (respuesta.equals("S")||respuesta.equals("s"));

	}

}
