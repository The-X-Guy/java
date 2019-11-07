//Alumno: Fran Gálvez. 2º ASIR.

import java.util.Scanner;
public class PedirDatos {
	public static void main(String[] args) {
		double radio;
		double altura;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca los datos del cilindro:\n");
		System.out.print("Radio: ");
		radio = teclado.nextDouble();
		System.out.print("Altura: ");
		altura = teclado.nextDouble();
		System.out.print("El area del cilindro es: ");
		System.out.println(Math.PI * radio * radio * altura);
		teclado.close();
	}
}