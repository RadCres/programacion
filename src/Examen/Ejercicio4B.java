package Examen;

public class Ejercicio4B {

	public static void main(String[] args) {
		char letra = 'F';
		char volver = 'F';
		for (int i = 1; i <= 26; i++) {
			System.out.println(i + "----" + letra);
			letra++;
			if (letra == 'K') {
				letra = volver;
			}
		}
	}

}
