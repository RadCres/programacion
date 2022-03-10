package Ejercicio7;

public class App {
	public static void main(String[] args) {
		DvdCine peliculaUno = new DvdCine("Harry Potter", "JK. Rowling", "Warner Bros.", "Pepito,Jaimito", "Fantasía",
				"Resumen:...", 120);
		DvdCine peliculaDos = new DvdCine("Joker", "Todd Phillips", "DC", "Joker,Batman", "Thriller", "Resumen:...",
				140);
		DvdCine peliculaTres = new DvdCine("Titanic", "Lurdes", "DC", "Maria,Antonio", "Thriller", "Mueren casi todos",
				140);

		System.out.println("\n" + peliculaUno.esThriller(peliculaUno));
		System.out.println("\n" + peliculaDos.esThriller(peliculaDos));
		System.out.println("\n" + peliculaTres.esThriller(peliculaDos));
		
		System.out.println();
		
		System.out.println(peliculaUno.mismaProductora(peliculaDos));
		System.out.println(peliculaDos.mismaProductora(peliculaTres));
		System.out.println(peliculaTres.mismaProductora(peliculaUno));
	}

}
