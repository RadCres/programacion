package Examen;

import java.util.Scanner;

public class Ejercicio3A {
	public static void main(String[] args) {
		double[] alturas = { 2.15, 2.02, 1.98, 1.80, 1.78, 2.02 };
		String[] nombres = { "Carlos", "Ana", "Eva", "Antonio", "Elena", "Sara" };
		nombrePersonaMasAltaYAltura(nombres, alturas);
		calcularMediaAlturas(alturas);
		nombresPersonasSuperanAltura(nombres, alturas);

	}

	public static void nombrePersonaMasAltaYAltura(String[] nombres, double[] alturas) {
		double alturaMax = 0;
		int posicionAlturaMax = 0;
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > alturaMax) {
				alturaMax = alturas[i];
				posicionAlturaMax = i;
			}
		}
		System.out.println("Nombre: " + nombres[posicionAlturaMax] + " altura: " + alturaMax);
	}

	public static void calcularMediaAlturas(double[] alturasArray) {
		double media = 0;
		for (int i = 0; i < alturasArray.length; i++) {
			media = (alturasArray[i] + media);
		}
		media = media / alturasArray.length;
		System.out.println("Meida: " + media);
	}

	public static void nombresPersonasSuperanAltura(String[] nombre, double[] alturas) {
		System.out.println("Introduce una altura");
		Scanner entrada = new Scanner(System.in);
		double alturaPedida;
		alturaPedida = entrada.nextDouble();
		for (int i = 0; i < alturas.length; i++) {
			if (alturaPedida < alturas[i]) {
				System.out.println(nombre[i]);
			}
		}

	}

}
