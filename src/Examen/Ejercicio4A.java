package Examen;

import java.util.Scanner;

public class Ejercicio4A {
	public static void main(String[] args) {
		System.out.println("Introduzca un valor");

		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		PrimerosTerminosFibonacci(n);
	}

	public static void PrimerosTerminosFibonacci(int fibo) {
		int numero = 0;
		int siguiente = 1;
		for (int i = 1; i < fibo; i++) {
			int valor = numero + siguiente;
			System.out.println(valor);
			numero = siguiente;
			siguiente = valor;
		}
	}
}