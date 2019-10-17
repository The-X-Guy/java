import java.util.*;
import java.io.*;
import java.lang.Math;

public class Recursividad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (true) {
            try {
                MiClase.clearScreen();
                System.out.println("\nJava. Ejercicios de recursividad (Fran Galvez).");
                System.out.println("---------------------------------------------------\n");
                MiClase.menu (new String[] {
                    "\t1. Factorial de un numero."
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
            } finally {
                teclado.nextLine();
                MiClase.pressAnyKeyToContinue(teclado);
            }
        }
    }
}