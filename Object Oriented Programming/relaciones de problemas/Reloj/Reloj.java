import java.util.*;
import java.io.*;

public class Reloj {
    public static void pressAnyKeyToContinue(Scanner teclado) { 
        try {
            System.out.println("\nPresiona intro para continuar...");
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
    public static void main (String[] args) {
        clearScreen();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ejercicios clase Horas.");
            System.out.println("-----------------------");
            try {
                System.out.print("\tIntroduce las horas (0-23): ");
                int h = sc.nextInt();
                System.out.print("\tIntroduce los minutos (0-59): ");
                int m = sc.nextInt();
                System.out.print("\tIntroduce los segundos (0-59): ");
                int s = sc.nextInt();
                Hora reloj = new Hora(h, m, s);

                System.out.print("\n\tQuieres imprimir la hora en formato de 12 horas?(s/n): ");
                String formato = sc.next();
                if (formato.equals("s")) 
                    System.out.println("\n\tLa hora es "+reloj.printHoraAM_PM());
                else 
                    System.out.println("\n\tLa hora es "+reloj.printHora());

                System.out.print("\n\tQuieres establecer la hora?(s/n): ");
                String establecer = sc.next();
                if (establecer.equals("s")) {
                    System.out.print("\tIntroduce las horas (0-23): ");
                    h = sc.nextInt();
                    System.out.print("\tIntroduce los minutos (0-59): ");
                    m = sc.nextInt();
                    System.out.print("\tIntroduce los segundos (0-59): ");
                    s = sc.nextInt();
                    reloj.setReloj(h, m, s);
                    System.out.println("\n\tLa nueva hora es "+reloj);
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: solo puede introducir numeros.");
                pressAnyKeyToContinue(sc);
                sc.nextLine();
                continue;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: solo pueden introducir numeros.");
                pressAnyKeyToContinue(sc);
                sc.nextLine();
                continue;
            }
        }
        sc.close();
    }
}