package Ejercicios;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner anno = new Scanner(System.in);
		System.out.println("Introduzca un año");
		int anio = anno.nextInt();
		Scanner mes = new Scanner(System.in);
		System.out.println("Introduce un mes");
		String mesecito = mes.nextLine();
		String repetir = "";
		int dias;
		do {
		switch (mesecito) {
		case "enero":
			dias = 31;
			System.out.println(mesecito + " " + dias);
			break;
		case "febrero":
			if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
				dias = 29;
				System.out.println(mesecito + " " + dias);
			} else {
				dias = 28;
				System.out.println(mesecito + " " + dias);
			}
			break;
		}
		
		System.out.println("¿Quiere repetir? S/N");
		repetir = mes.nextLine();
	}
		while(repetir.equals("S"));
	}
}
