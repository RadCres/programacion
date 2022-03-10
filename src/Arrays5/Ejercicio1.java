package Arrays5;
import java.util.Scanner;
public class Ejercicio1 {

	

	public static void main(String[] args) {
//		// Diseña un programa que pida 5 valores por teclado y los almacene en un array operador1, igual
//		con otro operador2, y en otro array almacene la suma de los dos, posición a posición.
		Scanner entrada =new Scanner(System.in);
		int operador1 [] = new int [5];
		System.out.println("Introduce 5 números");
		for (int i = 0; i < operador1.length; i++) {
			operador1[i]=entrada.nextInt();

		}		System.out.println("Introduce 5 números");

		int operador2 [] = new int [5];
		for (int i = 0; i < operador2.length; i++) {
			operador2[i]=entrada.nextInt();

		}
		int suma [] = new int[5];
		for (int i = 0; i < suma.length; i++) {
			suma[i] = operador1[i]+operador2[i];
			System.out.println(suma[i]);
		}
	}

}
