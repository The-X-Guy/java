//Alumno: Fran Gálvez. 2º ASIR.

import java.io.*;
public class EsPrimo {
	public static boolean primo (int numero) {
		int cont = 2;
		while (cont < numero) {
			if (numero%cont == 0) {
				return false;
			}		
			cont++;
		}
		return true;
	}
	public static boolean primo1 (int numero) {
		int cont = 2;
		while (cont < numero) {
			if (numero%cont == 0) {
			}		
			cont++;
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int numero = -1;
		long time_start, time_end;
		time_start = System.currentTimeMillis();
		String aux, primo;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		do {
			try{
				System.out.println("CALCULADORA DE UN NUMERO PRIMO");
				System.out.println("------------------------------");
				System.out.println("Introduce un numero cualquiera para comprobar si es primo.");
				System.out.print("Introduce un numero: ");
				aux = teclado.readLine();
				numero = Integer.parseInt(aux);
			} catch (IOException e) {
			} catch (NumberFormatException e) {
				System.out.println("Error: introduce un numero entero.\n");
			}
			time_start = System.currentTimeMillis();
			if (numero != -1) {
				primo = (primo(numero))?" es primo":" no es primo";
				System.out.println("El numero " + numero + primo);
			}
		} while (numero == -1);
		time_end = System.currentTimeMillis();
		System.out.println("La operacion ha tomado " + ((time_end - time_start)/1000f) + " segundos.");
	}
}