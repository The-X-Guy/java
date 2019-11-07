//Alumno: Fran Gálvez. 2º ASIR.

import java.util.*;
public class FactorialIterativo {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            int numero, resultado = 1;
            System.out.println("Calculo del factorial de un numero.");
            System.out.print("Introduce un numero: ");
            numero = teclado.nextInt();
            if (numero < 0) {
                System.out.print("Error: has introducido un numero negativo.");
            }
            for (int i = 1; i <= numero; i++)
                resultado *= i;
            System.out.print("El fatorial de " + numero + " es " + resultado);
            teclado.close();
           //} catch (IOException e) {
        } catch (InputMismatchException e) {
            System.out.print("Error: introduce un numero entero y positivo.");            
        }
    }
}