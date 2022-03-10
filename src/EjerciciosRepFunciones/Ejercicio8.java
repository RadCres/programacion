package EjerciciosRepFunciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce una temperatura");
		double centigrados = entrada.nextDouble();
		
		double pan = gradosCK(centigrados);
		System.out.println(pan);
		
		double bimbo = gradosCF(centigrados);
		System.out.println(bimbo);
		
	}

	public static double gradosCK(double centigrados) {
		double kelvin = centigrados + 273.15;
		return kelvin;

	}

	public static double gradosCF(double centigrados) {
		double fa = (centigrados * 1.8) + 32;
		return fa;

	}

}
