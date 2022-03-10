package Ejercicio3;

public class App {

	public static void main(String[] args) {
		
		Trabajador t1 = new Trabajador("Bill Gates", "Presidente", "Redmond", "","");
		Empleado e1 = new Empleado("Larry Ellison", "Presidente", "Redwood", "", "", 100000.0, 1000.0);
		Consultor c1 = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);
		
		System.out.println(t1.toString());
		System.out.println(e1.toString());
		System.out.println(c1.toString());
		
		System.out.println(e1.getNombre());
		
	}
	
	public static void imprimirNombreYPaga (Trabajador trabajador) {
		
	}
	

}
