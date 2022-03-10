package Examen;

public class EjercicioClase2 {

	public static void main(String[] args) {
//		a _ _ _ A
//		b _ _ _ B
//		c _ _ _ C
//		d _ _ _ D
//		a _ _ _ A
//		b _ _ _ B
//		c _ _ _ C
//		d _ _ _ D
//			.
//			.
//			.
// 30 veces
		char letra1 = 'a';
		char letra2 = 'A';
		for (int i = 0; i < 29; i++) {
			System.out.println(letra1 + " _ _ _ " + letra2);
			letra1++;
			letra2++;
			if (letra1 == 'e'&& letra2=='E') {
				letra1 = 'a';
				letra2 = 'A';
				
				
			}
		}
	}

}
