package Examen;

public class Ejercicio1B {

	public static void main(String[] args) {
//		Dise�a un programa Java que muestre los n�meros 901, 801, 701, ***601***, 501,
//		400,�.hasta llegar al cero. Observa que el valor 601 van entre asteriscos.
		for (int i = 901; i >0; i-=100) {
			if (i==601) {
				System.out.println("**"+i+"**");
			}else if (i==1) {
				System.out.println(i-1);
			}else
				System.out.println(i);
		}
	}

}
