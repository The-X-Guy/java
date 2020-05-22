import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Euromillones {
    public static int[] generaCombinacionEuroMillones () {
        int[] combinaciones = new int[7]; // Declaro el array.
        Random rnd = new Random();
        Arrays.fill(combinaciones, 100); // Inicializo el array con un valor mayor a 49.
        for (int i = 0; i < combinaciones.length; i++) {
            Arrays.sort(combinaciones, 0, 5); // Genera numeros enteros aleatorios en el rando 1-49.
            int valorPosible = i < 5 ? rnd.nextInt(50)+1 : rnd.nextInt(12)+1; 
            int pos = (i < 5) ? Arrays.binarySearch(combinaciones, 0, 5, valorPosible) : Arrays.binarySearch(combinaciones, 5, 7, valorPosible);
            if (pos < 0) { // Si el no existe en la matriz se guarda.
                combinaciones[i] = valorPosible;
            } else i--; // Si el numero existe en la matriz, se decrementa el contados para que se vuelva a realizar la iteracion.
        }
        Arrays.sort(combinaciones, 5, 7);
        // System.out.print(Arrays.toString(combinaciones));
        return combinaciones;
    }
    public static void main (String[] args) {
        System.out.println("Juego de loteria Euromillones.");
        System.out.println("---------------------------");
        Scanner teclado = new Scanner(System.in);
        int[] miEuro = new int[7];
        int[] ganadora = new int[7];
        Boolean continuar = true;
        do {
            miEuro = generaCombinacionEuroMillones ();
            ganadora = generaCombinacionEuroMillones ();
            
            long inicio = System.currentTimeMillis();
            int contador = 0;
            while (!Arrays.equals(miEuro, ganadora)) {
                miEuro= generaCombinacionEuroMillones ();
                contador++;
            }

            long fin = System.currentTimeMillis();
            float ejecucion = (fin - inicio)/1000f;
            
            System.out.printf("Has ganado en " + contador + " intentos y se ha tardado %.2f s. La combinacion es " + Arrays.toString(miEuro) + ".\n", ejecucion);
            System.out.print("Quieres continuar? (s/n) ");
            if (teclado.next().equals("n")) continuar = false;
        } while (continuar);
        teclado.close();
    }   
}
