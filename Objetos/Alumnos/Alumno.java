package Alumnos;

import java.time.LocalDate;

public class Alumno {
	private int NumeroExpediente;
	private String Apellidos;
	private String Nombre;
	private LocalDate FechaNacimiento;
	private String Curso;
	private int NotaUno;
	private int NotaDos;

	public Alumno(int numeroExpediente, String nombre, String apellidos, LocalDate fechaNacimiento, String curso,
			int notaUno, int notaDos) {
		super();
		this.NumeroExpediente = numeroExpediente;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.FechaNacimiento = fechaNacimiento;
		this.Curso = curso;
		this.NotaUno = notaUno;
		this.NotaDos = notaDos;
	}

	public int getNumeroExpediente() {
		return NumeroExpediente;
	}

	public void setNumeroExpediente(int numeroExpediente) {
		NumeroExpediente = numeroExpediente;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public int getNotaUno() {
		return NotaUno;
	}

	public void setNotaUno(int notaUno) {
		NotaUno = notaUno;
	}

	public int getNotaDos() {
		return NotaDos;
	}

	public void setNotaDos(int notaDos) {
		NotaDos = notaDos;
	}

	@Override
	public String toString() {
		return "Alumno [NumeroExpediente=" + NumeroExpediente + ", Apellidos=" + Apellidos + ", Nombre=" + Nombre
				+ ", FechaNacimiento=" + FechaNacimiento + ", Curso=" + Curso + ", NotaUno=" + NotaUno + ", NotaDos="
				+ NotaDos + "]";
	}

	public double mediaNotas() {
		double media = (NotaUno + NotaDos) / 2.0;
		return media;

	}

	public String NumeroExpediente_Nombre_NotaMedia() {
		return this.NumeroExpediente + "--" + this.Nombre + "--" + this.mediaNotas();
	}
}
