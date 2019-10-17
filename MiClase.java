import java.util.Scanner;
import java.io.*;

public class MiClase {
    public static void menu(String[] menu_items) {
        for (int i = 0; i < menu_items.length; i++) {
            System.out.print("\t" + menu_items[i] + "\n");
        }
    }
    public static void pressAnyKeyToContinue(Scanner teclado) { 
        try {
            System.out.println("\nPresiona intro para volver al menu...");
            System.in.read();
            clearScreen();
        } catch (IOException e) {}         
    }

    public static void clearScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException e) {         
        } catch (InterruptedException e){}
    }
    public static boolean esPar (int numero) {
        return (numero%2 == 0)?true:false;
    }
    public static boolean esPrimo (int numero) {
		int cont = 2;
		while (cont < numero) {
			if (numero%cont == 0)
                return false;	
            if (cont > Math.sqrt(numero))
                return false;
			cont++;
		}
		return true;
	}
    public static double[] ecuacionSegundoGrado(double a, double b, double c) {
        double discriminante = b*b - 4 * a * c;
        if (discriminante > 0) {
            return new double[] { 
                (-b + Math.sqrt(discriminante)) / (2 * a),
                (-b - Math.sqrt(discriminante)) / (2 * a) 
            };
        } else if (discriminante == 0)
            return new double[] { (-b + Math.sqrt(discriminante)) / (2 * a) };
        return new double[] {};
    }
    
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double longitudCircunferencia (double radio) {
        return 2 * Math.PI * radio ;
    }

    public static boolean sonIguales (double numero1, double numero2) {
        return  (numero1 == numero2)?true:false;
    }

    public static boolean numeroNegativo (double numero) {
        return (numero > 0)?false:true;
    }

    public static int[] esMultiplo (int numero1, int numero2) {
        if (numero1%numero2 == 0)
            return new int[] {numero1, numero2}; //numero1 es multiplo de numero2
        else if (numero2%numero1 == 0)
            return new int[] {numero2, numero1}; //numero2 es multiplo de numero1
        else
            return new int[] {}; 
    }
    public static int[] ordenarMayorMenor(int[] numeros) {
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j] > numeros[i]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        return numeros;
    }
    public static int calcularCifras (int numero) {
        int cifras = 0;
        while (numero/10 != 0) {
            numero /= 10;
            cifras++;
        }
        cifras++;
        return cifras;
    }
    public static int invertirNumero (int numero) {
        int numero_cifras = calcularCifras(numero);
        int[] cifras = new int[numero_cifras];
        while (numero/10 > 0) {
            for (int i = 0; i < cifras.length; i++) {
                cifras[i] = numero % 10;
                numero /= 10;
            }
        }
        int invertido = 0;
        for (int i = 0, exp = cifras.length - 1; i < cifras.length; i++, exp--)
            invertido += cifras[i] * Math.pow(10, exp);
        return invertido;
    }

    public static int sumarNumeros(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++)
            suma += numeros[i];
        return suma;
    }

    public static int factorial(int numero) {
        int fact = 1, suma = 1;;
        for (int i = numero; i > 0; i--)
            suma *= i;
        return fact;
    }
}