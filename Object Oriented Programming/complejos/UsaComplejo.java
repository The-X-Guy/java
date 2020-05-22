import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class UsaComplejo {
    private static void imprimirMenu(String[] menu) {
        for (int i = 0; i < menu.length; i++)
            System.out.println(menu[i]);
    }

    private static void imprimirNumeros (Complejo[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("\t" + numeros[i]);
        }
    }
    private static void pressAnyKeyToContinue(Scanner teclado) { 
        try {
            System.out.println("\nPresiona intro para continuar...");
            System.in.read();
            clearScreen();
        } catch (IOException e) {}         
    }

    private static void clearScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException e) {         
        } catch (InterruptedException e){}
    }

    public static float[] parteRealMax(Complejo[] numeros){
        float maximo = numeros[0].getReal();
        float posicion = 0f;
        for (int i = 1;i < numeros.length; i++){
          if (numeros[i].getReal() > maximo){
            maximo = numeros[i].getReal();
            posicion = i*1f;
            }
        }
        float[] resultado = {maximo, posicion};
        return resultado;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            clearScreen();
            System.out.println("Programa para operar numero complejos.");
            System.out.println("--------------------------------------\n");
            String[] menu = {
                "0. Salir.",
                "1. Sumar.",
                "2. Restar.",
                "3. Multiplicar.",
                "4. Buscar parte real maxima.",
                "5. Buscar parte imaginaria maxima"
                // "4. Dividir."
            };
            imprimirMenu(menu);
            try {
                System.out.print("\nSelecciona una opcion: ");
                int opcion = sc.nextInt();
                if (opcion == 0) System.exit(0);
                System.out.print("Cantidad de numeros complejos a operar: ");
                int cantidad = sc.nextInt();
                Complejo[] numeros = new Complejo[cantidad];
                for (int i = 0; i < cantidad; i++) {
                    System.out.println("\nIntroduce el numero complejo " + (i+1));
                    System.out.print("\tIntroduce la parte real: ");
                    float real = sc.nextInt();
                    System.out.print("\tIntroduce la parte imaginaria: ");
                    float imag = sc.nextInt();
                    numeros[i] = new Complejo(real, imag);
                }
                
                switch (opcion) {
                    case 1:
                        Complejo suma = new Complejo();
                        System.out.println("\nLos numero a sumar son: ");
                        imprimirNumeros(numeros);
                        for (int i = 0; i < numeros.length; i++)
                            suma = suma.sumar(numeros[i]);
                        System.out.println("\tLa suma de todos los numeros es " + suma);
                        pressAnyKeyToContinue(sc);
                        break;
                    case 2:
                        Complejo resta = new Complejo();
                        System.out.println("\nLos numero a restar son: ");
                        imprimirNumeros(numeros);
                        for (int i = 0; i < numeros.length; i++)
                            resta = resta.restar(numeros[i]);
                        System.out.println("\tLa resta de todos los numeros es " + resta);
                        pressAnyKeyToContinue(sc);
                        break;
                    // case 3:
                    case 4:
                        float[] salida = getRealMax(numeros);
                        System.out.println("\n\tParte real maxima: " + salida[0] + ". Posicion: " + (salida[1]/1f));
                        pressAnyKeyToContinue(sc);
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un numero entero.");
                pressAnyKeyToContinue(sc);               
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero entero.");
                pressAnyKeyToContinue(sc);
            }
        }
    } 
}