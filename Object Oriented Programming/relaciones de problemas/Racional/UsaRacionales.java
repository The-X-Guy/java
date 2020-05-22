//Alumno: Fran Gálvez. 2º ASIR.

import java.util.Scanner;


public class UsaRacionales {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("\nIntroduce los valores del primer numero racional: ");
            System.out.print("\n\tIntroduce el numerador: ");
            int numerador1 = teclado.nextInt();
            System.out.print("\n\tIntroduce el denominador: ");
            int denominador1 = teclado.nextInt();
            System.out.print("\nIntroduce los valores del primer segundo racional: ");
            System.out.print("\n\tIntroduce el numerador: ");
            int numerador2 = teclado.nextInt();
            System.out.print("\n\tIntroduce el denominador: ");
            int denominador2 = teclado.nextInt();
            Racional numero1 = new Racional(numerador1, denominador1);
            Racional numero2 = new Racional(numerador2, denominador2);

            System.out.println("\n\tEl valor del primer racional es: " + numero1.toStringFloat(2));
            System.out.println("\n\tEl valor del primer racional es: " + numero2.toStringFloat(2));
            System.out.println("\n\tSuma: " + numero1.suma(numero2));
            System.out.println("\n\tResta: " + numero1.resta(numero2));
            System.out.println("\n\tProducto: " + numero1.producto(numero2));
            System.out.println("\n\tCociente: " + numero1.cociente(numero2));
        } catch (RationalNumberException e) {
            System.out.print(e);
        }
    }
}