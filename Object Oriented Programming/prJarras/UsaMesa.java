import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.System.*;

public class UsaMesa {
    private static Mesa mesa;
    public static void main (String[] args) {
        // Mesa mesa = new Mesa(7, 5);
        // System.out.print(mesa);
        // mesa.j1.llena(4);
        // mesa.j2.llena(4);
        // System.out.println(mesa);
        // mesa.j1.llenaDesde(mesa.j2);
        // System.out.println(mesa);
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] menu = {
                "1. Crear mesa.",
                "2. Llenar jarra.",
                "3. Vaciar jarra.", 
                "4. Llenar una jarra con la otra.",
                "5. Ver mesa y jarras.",
                "--------------------------------",
                "6. Salir"
            };

            for (int i = 0; i < menu.length; i++)
                System.out.println(menu[i]);
            
            try {
                System.out.print("\nSelecciona una opcion: ");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        while (true) {
                            try {
                                System.out.println("Introduce la capacidad de la jarra 1: ");
                                int c1 = sc.nextInt();
                                System.out.println("Introduce la capacidad de la jarra 2: ");
                                int c2 = sc.nextInt();
                                mesa = new Mesa(c1, c2);
                                sc.nextLine();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Error: selecciona un numero.");
                                System.out.println("Presiona intro para continuar ...");
                                sc.nextLine();
                                sc.nextLine();
                                continue;
                            } catch (NumberFormatException e) {
                                System.out.println("Error: introduce un numero entero.");
                                System.out.println("Presiona intro para continuar ...");
                                sc.nextLine();
                                continue;
                            }
                        }
                        break;
                    case 2:
                        if (mesa == null) {
                            System.out.println("Error: primero debes crear una mesa.");
                            sc.nextLine();
                            continue;
                        } else {
                            while (true) {
                                try {
                                    System.out.print("Que jarra quieres llenar?: ");
                                    int jarra = sc.nextInt();
                                    switch (jarra) {
                                        case 1:
                                            mesa.j1.llenar();
                                            break;
                                        case 2:
                                            mesa.j2.llenar();
                                            break;
                                        default:
                                            System.out.println("Error: selecciona la jarra 1 o 2.");
                                            continue;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: introduce una opcion valida.");
                                    System.out.println("Presiona intro para continuar ...");
                                    continue;
                                }
                                break;
                            }
                        }
                        break;
                    case 3:
                        try {
                            System.out.print("Que jarra quieres vaciar?: ");
                            int jarra = sc.nextInt();
                            switch (jarra) {
                                case 1:
                                    mesa.j1.llenarDesde(mesa.j2);
                                    break;
                                case 2:
                                    mesa.j2.llenarDesde(mesa.j1);
                                    break;
                                default:
                                    System.out.println("Error: selecciona la jarra 1 o 2.");
                                    continue;
                                }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: introduce una opcion valida.");
                            System.out.println("Presiona intro para continuar ...");
                            continue;
                        }
                        break;
                    case 4:
                        try {
                            System.out.print("Que jarra quieres llenar con la otra?: ");
                            int jarra = sc.nextInt();
                            switch (jarra) {
                                case 1:
                                    mesa.j1.vaciar();
                                    break;
                                case 2:
                                    mesa.j2.vaciar();
                                    break;
                                default:
                                    System.out.println("Error: selecciona la jarra 1 o 2.");
                                    continue;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: introduce una opcion valida.");
                            System.out.println("Presiona intro para continuar ...");
                            continue;
                        }
                        break;
                    case 5:
                        if (mesa == null)
                            System.out.println("Error: no has creado ninguna mesa.");
                        else
                            System.out.print(mesa);
                        sc.nextLine();
                        break;
                    case 6:
                        sc.close();
                        System.exit(0);   
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: selecciona una opcion entre 5 y 6.");
                System.out.println("Presiona intro para continuar ...");
                sc.nextLine();
                continue;
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un numero entero.");
                System.out.println("Presiona intro para continuar ...");
                sc.nextLine();
                continue;
            } finally {
                System.out.println("Presiona intro para continuar ...");
                sc.nextLine();
                continue;
            }
        }
    }
}