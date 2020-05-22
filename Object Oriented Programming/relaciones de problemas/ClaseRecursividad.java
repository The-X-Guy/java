//Alumno: Fran Gálvez. 2º ASIR.

import java.lang.Math;

public class ClaseRecursividad {
    public static String factorialLargo(int n) {
        String cadena = "";
        cadena = n + "! = ";
            for (int i = 1; i < n; i++)
                cadena += i + " * ";
        cadena += n + " = " + factorial(n);
        return cadena;
    }
    public static long factorial (int numero) {
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero - 1);
    }

    public static float elevarNumero(float base, int exp) {
        if (exp == 0)
            return 1;
        else
            return base * elevarNumero(base, exp - 1);
    }

    public static int sumarNaturales (int n) {
        if (n == 1)
            return 1;
        else
            return n + sumarNaturales(n - 1); 
    }

    public static void ShowNaturales (int n) {
        if (n >= 1) {
            ShowNaturales(n-1);
            System.out.print("\n\t" + n);
        }
    }

    public static void ShowInvNaturales (int n) {
        if (n >= 1) {
            System.out.print("\n\t" + n);
            ShowInvNaturales(n-1);
        }
    }

    public static void Invertir(int n) {
        if (n < 10)
            System.out.print(n);
        else {
            System.out.print(n%10);
            Invertir(n/10);
        }
    }

    public static void cifrasLinea(int n) {
        if (n < 10)
            System.out.println(n);
        else {
            cifrasLinea(n/10);
            System.out.println(n%10);
            
        }
    }

    public static int fibonacci (int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int divisionRestas (int dividendo, int divisor) {
        if (dividendo < divisor)
            return 0;
        else {
            return 1 + divisionRestas(dividendo-divisor, divisor);
        }
    }

    public static int sumarCifras (int n) {
        if (n < 10)
            return n;
        else {
            return n%10 + sumarCifras (n/10);
        }
    }
    public static int mcd (int p, int q) {
        if (q == 0)
            return p;
        else
            return mcd(q, p%q);
    }

    public static long combinatorioFactorial (int m, int n) {
        return factorial(m)/((factorial(n)*factorial(m-n)));
    }

    public static int combinatorioRecurSimp (int m, int n) {
        if (n == 0)
            return 1;
        else
            return combinatorioRecurSimp(m, n-1) * (m-n+1)/n;
    }

    public static int combinatorioRecurMult (int m, int n) {
        if (n == 0)
            return 1;
        if (n == m)
            return 1;
        if (n > m)
            return 0;
        else
            return combinatorioRecurMult(m-1, n) + combinatorioRecurMult(m-1, n-1);
    }
}
