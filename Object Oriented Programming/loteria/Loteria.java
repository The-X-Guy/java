// Alumno: Fran Gálvez. 2º ASIR.

import java.util.Arrays;
import java.util.Scanner;

public class Loteria {
    public static int[] generaCombinacionPrimitiva() {
        int[] combinaciones = new int[6]; // Declaro el array.
        Arrays.fill(combinaciones, 50); // Inicializo el array con un valor mayor a 49.
        int n;
        for (int i = 0; i < 6; i++) {
            n = 1 + (int)(Math.random()*49); // Genera numeros enteros aleatorios en el rando 1-49.
            if (Arrays.binarySearch(combinaciones, n) < 0) { // Si el no existe en la matriz se guarda.
                combinaciones[i] = n;
                Arrays.sort(combinaciones); // Ordeno el array tras cada iteracion.
            } else i--; // Si el numero existe en la matriz, se decrementa el contados para que se vuelva a realizar la iteracion.
        }
        // System.out.print(Arrays.toString(combinaciones));
        return combinaciones;
    }
    public static void main (String[] args) {
        System.out.println("Juego de loteria primitiva.");
        System.out.println("---------------------------");
        Scanner teclado = new Scanner(System.in);
        int[] miPrimitiva = new int[6];
        int[] ganadora = new int[6];
        Boolean continuar = true;
        do {
            miPrimitiva = generaCombinacionPrimitiva();
            ganadora = generaCombinacionPrimitiva();
            
            long inicio = System.currentTimeMillis();
            int contador = 0;
            while (!Arrays.equals(miPrimitiva, ganadora)) {
                miPrimitiva = generaCombinacionPrimitiva();
                contador++;
            }

            long fin = System.currentTimeMillis();
            float ejecucion = (fin - inicio)/1000f;
            
            System.out.printf("Has ganado en " + contador + " intentos y se ha tardado %.2f s. La combinacion es " + Arrays.toString(miPrimitiva) + ".\n", ejecucion);
            System.out.print("Quieres continuar? (s/n) ");
            if (teclado.next().equals("n")) continuar = false;
        } while (continuar);
        teclado.close();
    }   
}
