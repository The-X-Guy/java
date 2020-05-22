//Alumno: Fran Gálvez. 2º ASIR.

import java.util.Scanner;
public class DatosPersonales {
	public static void main(String[] args) {
		String nombre, apellidos, dni;
		int edad, anno_nacimiento;
		Scanner teclado = new Scanner(System.in);
		System.out.println("INTRODUCCION DE DATOS PERSONALES");
		System.out.print("Nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Apellidos:");
		apellidos = teclado.nextLine();
		System.out.print("Edad:");
		edad = teclado.nextShort();
		System.out.print("DNI:");
		dni = teclado.next();
		System.out.print("Año de nacimiento:");
		anno_nacimiento = teclado.nextInt();
		System.out.println("Te llamas " + nombre + " " + apellidos + ", tienes " + edad + " años, con DNI " + dni + " y naciste en " + anno_nacimiento + ".");
		teclado.close();
	}
}