//Alumno: Fran Gálvez. 2º ASIR.

import java.util.*;
import java.io.*;
import java.lang.Math;


public class Recursividad {
    public static void calcularFactorialRecursivo (Scanner teclado) {
        MiClase.clearScreen();
        System.out.println("1. Calcular el factorial de un numero desde 1 hasta N.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                if (numero > 20) {
                    System.out.println("\n\tError: introduce un número entre 0 y 21.");
                    System.out.println("\n\tDebido al tipo de dato long, el número máximo del que se puede calcular el factorial es 20.");
                    continue;
                }
                String[] factorial = new String[numero];
                System.out.println();
                for (int i = 0, aux = 1; aux <= numero; i++, aux++) {
                    factorial[i] = ClaseRecursividad.factorialLargo(aux);
                }
                for (int i = 0, j = 1; i < factorial.length; i++, j++) {
                    System.out.println("\t" + factorial[i]);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void calcularPotencia (Scanner teclado) {
        MiClase.clearScreen();
        System.out.println("2. Calcular la potencia de un numero real a uno entero.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce la base: ");
                float base = teclado.nextFloat();
                System.out.print("\n\tIntroduce el exponente: ");
                int exp = teclado.nextInt();
                float resultado = ClaseRecursividad.elevarNumero(base, exp);
                System.out.println("\n\t" + base + " elevado a " + exp + " es " + resultado);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void calcularSuma (Scanner teclado) {
        MiClase.clearScreen();
        System.out.println("3. Calcular la suma de los N primeros numeros naturales (1 a N).");
        while (true) {
            try {
                System.out.print("\n\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                int resultado = ClaseRecursividad.sumarNaturales(numero);
                System.out.println("\n\tLa suma de los " + numero + " primeros numeros naturales es " + resultado);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void visualizarNaturales (Scanner teclado) {
        MiClase.clearScreen();
        System.out.println("4. Método para visualizar los primeros N numeros naturales (1 a N).");
        while (true) {
            try {
                System.out.print("\n\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                System.out.println("\n\tLos numeros desde 1 hasta " + numero + " son:");
                ClaseRecursividad.Naturales.visualizarNaturales(numero);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void visualizarNaturalesInvertidos (Scanner teclado) {
        MiClase.clearScreen();
        System.out.println("5. Método para visualizar los primeros N numeros naturales (N a 1).");
        while (true) {
            try {
                System.out.print("\n\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                System.out.println("\n\tLos numeros desde " + numero + " hasta 1 son:");
                ClaseRecursividad.visualizarNaturalesInvertidos(numero);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    // public static void visualizarNaturalCifrasLinea (Scanner teclado) {
    //     MiClase.clearScreen();
    //     System.out.println("7. Método para visualizar las cifras de un numero natural, de uno en uno por linea.");
    //     while (true) {
    //         try {
    //             System.out.print("\n\tIntroduce un numero: ");
    //             int numero = teclado.nextInt();
    //             System.out.println("\n\tLos numeros desde " + numero + " hasta 1 son:");
    //             ClaseRecursividad.CifrasLinea.visualizarCifrasLinea(numero);
    //             break;
    //         } catch (NumberFormatException e) {
    //             System.out.println("Error: Introduce un numero entero.");
    //             teclado.nextLine();
    //         } catch (InputMismatchException e) {
    //             System.out.println("Error: introduce un numero.");
    //             teclado.nextLine();
    //         }
    //     }
    // }

    public static void calcularFibonacci (Scanner teclado) {
        MiClase.clearScreen();
        System.out.println("8. Calcular el termino N de la serie de fibonacci.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce el termino a calcular: ");
                int numero = teclado.nextInt();
                int fib = ClaseRecursividad.fibonacci(numero);
                System.out.println("\n\tEl termino " + numero + " de la serie de fibonacci es " + fib + ".");
                
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void sumarCifras (Scanner teclado) {
        MiClase.clearScreen();
        System.out.println("7. Calcular la suma de las cifras de un numero.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce el numero: ");
                int numero = teclado.nextInt();
                int suma = ClaseRecursividad.numeroCifras.sumarCifras(numero);
                System.out.println("\n\tLa suma de las cifras de " + numero + " es " + suma + ".");
                
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void calcularDivision (Scanner teclado) {
        MiClase.clearScreen();
        System.out.println("9. Calcular la operacion division mediante restas sucesivas.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce el dividendo: ");
                int dividendo = teclado.nextInt();
                System.out.print("\n\tIntroduce el divisor: ");
                int divisor = teclado.nextInt();
                int[] resultado = ClaseRecursividad.divisionRestas(dividendo, divisor, 0);
                System.out.println("\n\tEl resultado de " + dividendo + "/" + divisor + " es " + resultado[0] + ", con resto " + resultado[1] + ".");
                
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void calcularMCD (Scanner teclado) {
        MiClase.clearScreen();
        System.out.println("12. Calcular el maximo comun divisor de dos numeros.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce el primer numero: ");
                int n1= teclado.nextInt();
                System.out.print("\n\tIntroduce el segundo numero: ");
                int n2 = teclado.nextInt();
                int resultado = ClaseRecursividad.mcd(n1, n2);
                System.out.println("\n\tEl mcd de " + n1 + " y " + n2 + " es " + resultado + ".");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void resultadoCombinatorio (int[] combinatorio, Scanner teclado, int opcion) {
        long resultado = 0;
        switch (opcion) {
            case 1:
                resultado = ClaseRecursividad.combinatorioFactorial(combinatorio[0], combinatorio[1]);
                break;
            case 2:
                resultado = ClaseRecursividad.combinatorioRecurSimp(combinatorio[0], combinatorio[1]);
                break;
            case 3:
                resultado = ClaseRecursividad.combinatorioRecurMult(combinatorio[0], combinatorio[1]);
                break;
        }
        System.out.println("\n\tEl resultado de " + combinatorio[0] + " sobre " + combinatorio[1] + " es " + resultado + ".");
        MiClase.pressAnyKeyToContinue(teclado);
    }

    public static int[] pedirDatosCombinatorio (Scanner teclado, int opcion) {
        int[] combinatorio = new int[2];
        while (true) {
            try {
                System.out.print("\n\tIntroduce el numero m: ");
                combinatorio[0] = teclado.nextInt();
                System.out.print("\n\tIntroduce el numero n: ");
                combinatorio[1]= teclado.nextInt();
                if (combinatorio[0] < 0 || combinatorio[1] < 0) {
                    System.out.println("\n\tError: ninguno de los números puede ser menor de cero.");
                    MiClase.pressAnyKeyToContinue(teclado);
                    continue;
                }
                if (combinatorio[1] > combinatorio[0]) {
                    System.out.println("\n\tError: m tiene que ser mayor o igual que n");
                    MiClase.pressAnyKeyToContinue(teclado);
                    continue;
                }
                resultadoCombinatorio(combinatorio, teclado, opcion);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
                continue;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
                continue;
            }
        }   
        return combinatorio;
    } 

    public static void calcularCombinatorio (Scanner teclado) {
        MiClase.clearScreen();
            while (true) {
                try {
                    MiClase.clearScreen();
                    System.out.println("13. Calcular el numero combinatorio de 'm' sobre 'n' elementos.");
                    System.out.println("---------------------------------------------------------------\n");
                    String [] menu = new String[] {
                        "0. Volver al menu",
                        "1. Aplicando la formula del factorial",
                        "2. Aplicando la ley de recurrencia. Recursividad Directa Simple.",
                        "3. Aplicando la ley de recurrencia. Recursividad Directe Multiple"
                    };
                    MiClase.menu(menu);
                    System.out.print("\n\tSelecciona una opcion: ");
                    int opcion_comb = teclado.nextInt();
                    
                    if (opcion_comb < 0 || opcion_comb > 3) {
                        if (opcion_comb == 0) break;
                        else {
                            System.out.println("\n\tError: introduce una opcion entre 0 y 4.");
                            MiClase.pressAnyKeyToContinue(teclado);
                            continue;
                        }
                    }
                    MiClase.clearScreen();
                    switch (opcion_comb) {
                        case 1:
                            System.out.println("13.1. Aplicando la formula del factorial");
                            pedirDatosCombinatorio(teclado, 1);
                            break;
                        case 2:
                            System.out.println("13.2. Aplicando la ley de recurrencia. Recursividad Directa Simple.");
                            pedirDatosCombinatorio(teclado, 2);
                            break;
                        case 3:
                            System.out.println("13.3. Aplicando la ley de recurrencia. Recursividad Directa Múltiple.");
                            pedirDatosCombinatorio(teclado, 3);
                            break;
                    }      
                } catch (Exception e) {
                    System.out.println("\n\tError: introduce un numero.");
                    MiClase.pressAnyKeyToContinue(teclado);
                    teclado.nextLine();
                    continue;
            }
            break;
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (true) {
            try {
                MiClase.clearScreen();
                System.out.println("\nJava. Ejercicios de recursividad (Fran Galvez).");
                System.out.println("------------------------------------------------\n");
                MiClase.menu (new String[] {
                    "0. Salir",
                    "1. Factorial de un numero desde 1 hasta N.",
                    "2. Potencia de un numero real elevado a un entero",
                    "3. Suma de los primeros N numeros naturales",
                    "4. Visualizar los primeros N numeros naturales de 1 a N.",
                    "5. Visualizar los primeros N numeros naturales de N a 1.",
                    // "6-10. Invertir un numero natural.",
                    // "7. Visualizar los digitos de un numero natural N uno a uno por linea.",
                    "8. Calcular el N-esimo termino de la serio de Fibonacci.",
                    "9. Division mediante restas sucesivas.",
                    "11. Calcular la suma de los digitos de un numero.",
                    "12. Calcular el maximo comun divisor de dos numeros.",
                    "13. Calcular el numero combinatorio n sobre m."
                });
                System.out.print("\n\tIntroduce una opcion: ");
                opcion = teclado.nextInt();
                if (opcion < 0 || opcion > 13) {
                    System.out.println("\tError: introduce un numero entre 0 y 13.");
                    continue;
                } else {
                    switch (opcion) {
                        case 0:
                            MiClase.clearScreen();
                            System.gc();
                            System.exit(0);
                        case 1:
                            calcularFactorialRecursivo(teclado);
                            break;
                        case 2:
                            calcularPotencia(teclado);
                            break;
                        case 3:
                            calcularSuma(teclado);
                            break;
                        case 4:
                            visualizarNaturales(teclado);
                            break;
                        case 5: 
                            visualizarNaturalesInvertidos(teclado);
                            break;
                        // case 6:
                        //     visualizarNaturalInvertido(teclado);
                        //     break;
                        // case 7:
                        //     visualizarNaturalCifrasLinea(teclado);
                        //     break;
                        case 8:
                            calcularFibonacci(teclado);
                            break;
                        case 9:
                            calcularDivision(teclado);
                            break;
                        case 11:
                            sumarCifras(teclado);
                            break;
                        case 12:
                            calcularMCD(teclado);
                            break;
                        case 13:
                            calcularCombinatorio(teclado);
                            break;
                    }
                    
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero entero.");
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero.");
            } finally {
                teclado.nextLine();
                MiClase.pressAnyKeyToContinue(teclado);
            }
        }
    }
}