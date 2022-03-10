package Ejercicio7;

public class DvdCine {

	private String titulo;
	private String director;
	private String productora;
	private String actoresPrincipales;
	private String genero;
	private String resumen;
	private int durancion;

	public DvdCine(String titulo, String director, String productora, String actoresPrincipales, String genero,
			String resumen, int durancion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.productora = productora;
		this.actoresPrincipales = actoresPrincipales;
		this.genero = genero;
		this.resumen = resumen;
		this.durancion = durancion;
	}

	public DvdCine() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getActoresPrincipales() {
		return actoresPrincipales;
	}

	public void setActoresPrincipales(String actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public int getDurancion() {
		return durancion;
	}

	public void setDurancion(int durancion) {
		this.durancion = durancion;
	}

	public boolean esThriller(DvdCine generoPelicula) {
		if (this.genero.equals("Thriller")) {
			return true;

		}
		return false;
	}

	public boolean mismaProductora(DvdCine pelis) {
		if (this.productora.equals(pelis.getProductora())) {
			return true;
		}
		return false;

	}
}
