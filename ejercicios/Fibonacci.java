import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Fibonacci {
    public static void main(String[] args) {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Calculo de la serie de fibonacci.");
                System.out.println("Introduce el numero de la seria hasta el que quieres calcular: ");
                int n = teclado.nextInt();
                long salida = FibonacciRecursivo(n);
                System.out.print("Fib(" + n + ") = " +salida);

            } catch (StackOverflowError e) {
                System.out.println("Error: has introducido un numero negativo");
            }
    }
    public static long FibonacciRecursivo (int n) {
            if (n == 0)
                return 0;
            else if (n == 1)
                return 1;
            else
                return Fib(n-1) + Fib(n-2);
        
    }
    public static long FibonacciIterativo (int n) {
        long actual;
        long ultimo = 1;
        long penultimo = 0;
        if (n == 0 || n == 1)
            if (n == 0)
                actual = penultimo;
            else
                actual = ultimo;
        else {
            for (int i = 2; i <= n; i++) {
                actual = penultimo + ultimo;
                penultimo = ultimo;
                ultimo = actual;
            }
            actual = penultimo + ultimo;
        }
        return actual;
    }
    
}