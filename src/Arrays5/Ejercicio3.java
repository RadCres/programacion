package Arrays5;

public class Ejercicio3 {

	public static void main(String[] args) {
//		Diseña un programa Java que mueva los valores de un array una posición hacia el final. El
//		último elemento pasará a ser el primero.
		
		int [] array = {1,2,3,4,5};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		int a= array[0];
		for (int i = 0; i < array.length; i++) {
			int cambio = array[i];
			array[i]=a;
			a=cambio;
		}
		array[0]=a;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
