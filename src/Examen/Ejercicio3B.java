package Examen;

import java.util.Scanner;

public class Ejercicio3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] alumnos = { "Carlos", "Ana", "Eva", "Antonio", "Elena", "Sara" };
		double[] notas = { 4.25, 6.50, 7.75, 5.80, 3.75, 8.00 };
		nombrePersona(alumnos, notas);
		System.out.println(mediaNotas(notas));
		personasTeclado(alumnos, notas);
	}

	public static void nombrePersona(String[] personas, double[] notas) {
		double Max = 0;
		int posicionNotaMax = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > Max) {
				Max = notas[i];
				posicionNotaMax = i;
			}
		}
		System.out.println(personas[posicionNotaMax] + " " + Max);
	}

	public static double mediaNotas(double[] notas) {
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		media /= notas.length;
		return media;
	}

	public static void personasTeclado(String[] personas, double[] notas) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una nota");
		double nota = entrada.nextDouble();
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]>nota) {
				nota = notas[i];
				System.out.println(personas[i] + notas [i]);

			}
		}
	}
}
