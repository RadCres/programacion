package Arrays;

public class Ejercicio10 {

	public static void main(String[] args) {
//		 Diseña un array que guarde los nombres de los meses del año y los muestre en
//		pantalla uno a uno junto al número de caracteres del propio nombre.
		String meses[] = { "Enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };

		for (int i = 0; i < meses.length; i++) {
			int a = meses[i].length();
			System.out.println(meses[i] + " " + a);
		}

	}

}
