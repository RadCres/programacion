package Alumnos;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno(1000, "Pablo", "Sánchez Díaz", LocalDate.of(2002, 11, 13), "DAM1", 2, 3);
		Alumno a2 = new Alumno(1001, "Juan", "Pérez Cano", LocalDate.of(2001, 12, 22), "DAM1", 4, 7);

		// mostrar alumnos

		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println("*********************");
		// cambiar nombre a alumno
		System.out.println(a1.getApellidos());
		System.out.println(a1.getNombre());
		System.out.println(a1.getFechaNacimiento());
		// mostrar alumno

		if (a1.getNombre().equals(a2.getNombre()))
			System.out.println("Se llaman igual");
		else
			System.out.println("No se llaman igual");

		System.out.println("-------------");

		System.out.println(a1.mediaNotas());
		System.out.println(a2.mediaNotas());
		
		System.out.println("-------------");
		System.out.println(a1.NumeroExpediente_Nombre_NotaMedia());
		System.out.println(a2.NumeroExpediente_Nombre_NotaMedia());
	}

}
