import java.util.InputMismatchException;
import java.util.Scanner;

class FuncionesCadena {
    public static void main (String[] args) {
        // while (true) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ejercicios de funciones de cadena");
            System.out.println("---------------------------------");
            try {
                System.out.print("Introduce una cadena: ");
                String cadena = teclado.nextLine();
                
                System.out.print("\nLa cadena en mayusculas es: " + cadena.toUpperCase());
                System.out.print("\nLa cadena en minusculas es: " + cadena.toLowerCase());
                System.out.print("\nLa longitud de la cadena es " + cadena.length());

                String hack = cadena.replace('a', '4').replace('e', '3').replace('i', '1').replace('o', '0');
                System.out.println("\nLa cadena hackeada es " + hack);

                System.out.print("Buscar si una cadena esta dentro de otra: ");
                String str = teclado.nextLine();
                if (cadena.contains(str)) {
                    System.out.println("\nLa cadena " + str + " esta contenida en " + cadena);
                    System.out.println("\nLa posicion de " + str + " dentro de " + cadena + " es " + cadena.indexOf(str));
                } else {
                    System.out.println("\nLa cadena " + str + " no esta contenida en " + cadena);
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: introduce una cadena.");
                teclado.nextLine();
            }
        // }
        teclado.close();
    }
}