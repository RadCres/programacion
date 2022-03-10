package Ejercicio8y9;

import java.util.Scanner;

public class GestionDvd {
	private DvdCine[] peliculas = {
			new DvdCine("El hobbit. La desolación de Smaug", "Peter Jackson", "New Line Cinema", "Metro-Goldwyn-Mayer",
					"Ian McKellen, Martin Freeman ", "Ciencia Ficcion", 123),
			new DvdCine("El Padrino", "Francis Ford Copola", "Paramount Pictures", "Al Pacino,Marlon Brando", "Drama",
					"Bla...", 175),
			new DvdCine("Titanic", "Francis Ford Copola", "Paramount Pictures 20th Century Fox", "Di Caprio", "Drama",
					"Bla...", 123),
			new DvdCine("El Rey León", "WD", "Walt Dysney", "------", "Animación", "Bla...", 86),
			new DvdCine("Los Vengadores", "--", "Marvel Studios. Walt Dysney", "--", "Ciencia ficción", "Bla...", 114),
			new DvdCine("Avatar", "Francis Ford Copola", "20th Century Fox", "--", "Ciencia ficción", "Bla...", 126),
			new DvdCine("Harry Potter. Las reliquias de la muerte", "--", "Warner Bros.", "--", "Ciencia ficción",
					"Bla...", 131),
			new DvdCine("El señor de los anillos. El retorno del rey", "Francis Ford Copola", "New Line Cinema", "--",
					"Ciencia ficcion", "Bla...", 175),
			new DvdCine("Toy Story 3", "----", "Dysney/Pixar", "--", "Animación", "Bla...", 78),
			new DvdCine("The Dark Knight Rises", "--", "Warner Bros.", "--", "Ciencia ficción", "Bla...", 99) };

	public void mostrarListaPeliculas() {
		for (int i = 0; i < peliculas.length; i++) {
			System.out.println(
					"Titulo = " + peliculas[i].getTitulo() + "     " + "Productora = " + peliculas[i].getProductora());

		}

	}

	public void mostrarPeliculaMayorDuracion() {
		DvdCine duracionMayor = peliculas[0];
		for (int i = 0; i < peliculas.length; i++) {

			if (peliculas[i].getDurancion() > duracionMayor.getDurancion()) {
				duracionMayor = peliculas[i];
			}
		}
		System.out.println("Titulo:" + duracionMayor.getTitulo() + " -- Duración:" + duracionMayor.getDurancion());
	}

	public void pedirGeneroyMostrarTituloDelGenero() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un género");
		String pedirGenero = entrada.next();
		for (int i = 0; i < peliculas.length; i++) {
			if (peliculas[i].getGenero().equals(pedirGenero)) {
				System.out.println(peliculas[i].getTitulo());
			}
		}
	}
}
