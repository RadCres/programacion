package Arrays;

//import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
		char letra = 'F';
		char volver = 'F';
		for (int i = 1; i <= 26; i++) {
			System.out.println(i + "----"+letra);
			letra++;
			if (letra == 'K') {
				letra = volver;
			}
		}
	}
}
