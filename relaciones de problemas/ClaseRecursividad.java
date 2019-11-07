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

    public static class Naturales {
        private static int aux = 1;
        public static int visualizarNaturales (int n) {
            while (aux <= n) {
                System.out.println("\n\t" + aux);
                aux++;
                return visualizarNaturales(n);
            }
            aux = 1;
            return 1;
        }
    }

    public static class numeroCifras {
        private static int suma = 0;
        public static int sumarCifras(int n) {
            if(n > 0) {
                suma += n % 10;
                sumarCifras (n / 10);
            }
            return suma;
        }
    }

    // public static class CifrasLinea {
    //     // private static String invertido = "";
    //     public static int visualizarCifrasLinea (int n) {
    //         if (n > 0) {
    //             System.out.println("\n\t"+ (n % 10));
    //             int m = (n / 10) - (n % 10);
    //             return visualizarCifrasLinea(m);
    //         }
    //         // return invertido;
    //     }
    // }

    public static int visualizarNaturalesInvertidos (int n) {
        while (n > 0) {
            System.out.println("\n\t" + n);
            return visualizarNaturalesInvertidos(--n);
        }
        return 1;
    }


    public static int fibonacci (int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int[] divisionRestas (int dividendo, int divisor, int cont) {
        if (dividendo >= divisor) {
            cont++;
            return divisionRestas (dividendo - divisor, divisor, cont);
        } else {
            int[] resultado = {cont, dividendo};
            return resultado;
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
