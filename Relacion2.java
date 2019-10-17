import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;
import java.lang.Math;

public class Relacion2 {
    public static void numeroPrimo (Scanner teclado) {
        System.out.println("\n1. Comprobar si un numero entero positivo es primo o no.");
       while (true) {
            try{
                System.out.print("\n\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                if (numero < 0 || numero == 0) {
                    System.out.println("\tError: introduce un número entero y positivo.");
                } else {
                    String primo = (MiClase.esPrimo(numero))?"":" no";
                    System.out.println("\n\tEl numero " + numero + primo + " es primo");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }  
    }
    public static void cuadradoNumero (Scanner teclado) {
        System.out.println("\n2. Mostrar el cuadrado de un numero, hasta introducir un numero negativo.");
        while (true) {
            try {
                while (true) {
                    System.out.print("\n\tIntroduce un numero: ");
                    int numero = teclado.nextInt();
                    if (numero < 0)
                        break;
                    else {
                        System.out.println("\n\tEl cuadrado de " + numero + " es " + numero*numero + ".");
                        continue;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero positivo.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void esNegativo (Scanner teclado) {
        System.out.println("3. Indicar si un numero es positivo o negativo, hasta introducir un cero.");
        while (true) {
            try {
                while (true) {
                    System.out.print("\n\tIntroduce un numero: ");
                    int numero = teclado.nextInt();
                    if (numero == 0)
                        break;
                    else {
                        String salida = (MiClase.numeroNegativo(numero)?"":" no");
                        System.out.println("\n\tEl numero " + numero + salida + " es negativo.");
                        continue;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero positivo.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void numeroPar (Scanner teclado) {
        System.out.println("4. Indicar si un numero es par o impar, hasta introducir un cero.");
        while (true) {
            try {
                while (true) {
                    System.out.print("\n\tIntroduce un numero: ");
                    int numero = teclado.nextInt();
                    if (numero == 0)
                        break;
                    else {
                        boolean par = (MiClase.esPar(numero));
                        if (par)
                            System.out.println("\n\tEl numero " + numero + " es par.");
                        else
                            System.out.println("\n\tEl numero " + numero + " es impar.");
                        continue;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero positivo.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void cantidadNumerosIntroducidos (Scanner teclado) {
        System.out.println("5. Se piden numeros hasta que se introduzca uno negativo, entonces se muestra cuantos numeros se han introducido.");
        int contador = 0;
        while (true) {
            try {
                while (true) {
                    System.out.print("\n\tIntroduce un numero: ");
                    int numero = teclado.nextInt();
                    boolean negativo = (MiClase.numeroNegativo(numero));
                    if (negativo) {
                        System.out.println("\n\tSe han introducido " + contador + " numeros.");
                        break;
                    }
                    contador++;  
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero positivo.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void adivinarNumero (Scanner teclado) {
        System.out.println("\n6. Dado un numero introducido por teclado, ir pidiendo numeros indicando 'mayor' o 'menor' segun sea meyor o menos con respecto al introducido. El programa termina cuando aciertes.");
        int numero = 0;
        while (true) {
            try {
                System.out.print("\n\tIntroduce el numero a adivinar: ");
                numero = teclado.nextInt();
                MiClase.clearScreen();
                while (true) {
                    System.out.print("\n\tIntroduce un numero: ");
                    int aux = teclado.nextInt();
                    if (aux < numero)
                        System.out.println("\n\tEl numero " + aux + " es menor.");
                    else if (aux > numero)
                        System.out.println("\n\tEl numero " + aux + " es mayor.");
                    else if (aux == numero)
                        break;
                }
                System.out.println("\n\tHas adivinado el numero.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void sumarNumeros (Scanner teclado) {
        System.out.println("\n7. Se piden numeros hasta introdcir un 0, entonces se muestra la suma de dichos numeros.");
        int suma = 0;
        while (true) {
            try {
                while (true) {
                    System.out.print("\n\tIntroduce un numero: ");
                    int numero = teclado.nextInt();
                    if (numero == 0) {
                        System.out.println("\n\tLa suma de todos los numeros es " + suma + ".");
                        break;
                    } else
                        suma += numero;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void calcularMedia (Scanner teclado) {
        System.out.println("\n8. Se piden numeros hasta introducir un 0, y se muestra su media.");
        double suma = 0.0;
        int total_elementos = 0;
        while (true) {
            try {
                while (true) {
                    System.out.print("\n\tIntroduce un numero: ");
                    int numero = teclado.nextInt();
                    if (numero != 0) {
                        suma += numero;
                        total_elementos++;
                    } else {
                        double resultado = suma/total_elementos;
                        System.out.println("\n\tLa media de los numeros introducidos es " + resultado + ".");
                        break;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (ArithmeticException e) {
                System.out.println ("\n\tError: " + e);
                teclado.nextLine();
            }
        }
    }

    public static void numeros1N(Scanner teclado) {
        System.out.println("9. Mostrar todos los numeros desde 1 hasta el numero introducido.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                String cadena = "\n\t";
                for (int i = 1; i <= numero; i++)
                    cadena += i + " ";
                System.out.println("\n\tLos números desde 1 hasta " + numero + " son " + cadena);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (ArithmeticException e) {
                System.out.println ("\n\tError: " + e);
                teclado.nextLine();
            }
        }
    }
    public static void imprimir100a0_7(Scanner teclado) {
        System.out.println("10. Mostrar los numeros del 100 al 0 de 7 en 7. ");
        while (true) {
            try {
                String cadena = "\n\t"; 
                for (int i = 100; i > 0; i -= 7)
                    cadena += i + " ";
                System.out.println(cadena);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void sumar15Numeros (Scanner teclado) {
        System.out.println("11. Pedir 15 numeros y se calcula su suma");
        int[] numeros = new int[15];
        int index = 0;
        while (true) {
            try {
                for (int i = index; i < numeros.length; i++, index++) {
                    System.out.print("\n\tIntroduce el numero " + (i+1) + ": ");
                    numeros[i] = teclado.nextInt();
                }
                int suma = MiClase.sumarNumeros(numeros);
                System.out.println("\n\tLa suma de los numeros es " + suma);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void sumar10impares(Scanner teclado) {
        System.out.println("12. Calcular la suma de los primeros 10 numeros impares.");
        while (true) {
            try {
                String cadena = "\n\t";
                int[] impares = new int[10];
                int suma = 0;
                for (int i = 0, j = 1; j <= 10; i++, j++) {
                    impares[i] = 2*j - 1;
                    suma += impares[i];
                }
                for (int i= 0; i < impares.length - 2; i++)
                    cadena += impares[i] + ", ";
                cadena += impares[impares.length - 2];
                cadena += " y " + impares[impares.length - 1];
                System.out.println("\n\tLos 10 primeros numeros impares son " + cadena + ", y su suma es " + suma + ".");
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void calcularFactorial (Scanner teclado) {
        System.out.println("13. Calcula el factorial de un numero.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                int fact = MiClase.factorial(numero);
                System.out.println("\n\tEl factorial de " + numero + " es " + fact);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void mediaNumeros_Ceros (Scanner teclado) {
        System.out.println("14. Pedir 10 números. Mostrar la media de los positivos, los negativos y la cantidad de ceros.");
        int[] numeros = new int[10];
        int ceros = 0, cont_p = 0, cont_n = 0;
        double negativos = 0.0, positivos = 0.0;
        while (true) {
            try {
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("\n\tIntroduce el numero " + (i+1) + ": ");
                    numeros[i] = teclado.nextInt();
                }
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] > 0) {
                        cont_p++;
                        positivos += numeros[i];
                    } else if (numeros[i] < 0){ 
                        cont_n++;
                        negativos += numeros[i];
                    } else
                        ceros++;
                }
                double media_positivos = positivos/cont_p;
                double media_negativos = negativos/cont_n;
                System.out.println("\n\tLos resultados son: \n\t\t-> Media positivos: " + media_positivos + "\n\t\t-> Media negativos: " + media_negativos + "\n\t\t-> Cantidad de ceros: " + ceros); 
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void mediaSueldos (Scanner teclado) {
        System.out.println("15. Pedir 10 sueldos. Mostrar su suma y cuantos son mayores de 1000 euros.");
        int[] sueldos = new int[10];
        while (true) {
            try{
                for (int i = 0; i < sueldos.length; i++) {
                    System.out.print("\n\tIntroduce el sueldo " + (i+1) + ": ");
                    sueldos[i] = teclado.nextInt();
                }
                int suma = 0;
                int mayor1000 = 0;
                for (int i = 0; i < sueldos.length; i++){
                    suma += sueldos[i];
                    if (sueldos[i] > 1000)
                        mayor1000++;
                }
                System.out.println("\n\tLa suma de todos los sueldos es " + suma + " y hay " + mayor1000 + " sueldos mayores de 1000 euros.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void estadisticasAlumnos (Scanner teclado) {
        System.out.println("16. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18, y la cantidad de alumnos que miden más de 1.75.");
        int cont_alum = 0;
        int[] edad = new int[5];
        double[] estatura = new double[5];
        while (true) {
            try {
                for (int i = cont_alum; i < 5; i++, cont_alum++) {
                    System.out.println("\n\tIntroduce los datos del alumno " + (i+1) + ":");
                    System.out.print("\n\t\t-> Edad: ");
                    edad[i] = teclado.nextInt();
                    System.out.print("\n\t\t-> Estatura: ");
                    estatura[i] = teclado.nextDouble();
                }
                double suma_edad = 0.0, suma_estatura = 0.0;
                int mayoredad = 0, mayor175 = 0;
                double edad_media = 0.0, estatura_media = 0.0;
                for (int i = 0; i < 5; i++) {
                    suma_edad += edad[i];
                    if (edad[i] >= 18)
                        mayoredad++;
                    suma_estatura += estatura[i];
                    if (estatura[i] > 1.75)
                        mayor175++;
                }
                edad_media = suma_edad / edad.length;
                estatura_media = suma_estatura/ estatura.length;
                System.out.println("\n\tLos resultados son: ");
                MiClase.menu (new String [] {
                    "\t-> La edad media es: " + edad_media + ".",
                    "\t-> La estatura media es: " + estatura_media + ".",
                    "\t-> Hay " + mayoredad + " alumnos mayores de edad.",
                    "\t-> Hay " + mayor175 + " almnos que miden mas de 1.75m."
                });
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void tablaMultiplicar(Scanner teclado) {
        System.out.println("17. Pedir un numero entre 1 y 10 y mostrar la tabla de multiplicar.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce un número: ");
                int numero = teclado.nextInt();
                if (numero < 1 && numero > 10) {
                    System.out.println("\n\tError: introduce un numero entre 1 y 10.");
                    continue;
                } else {
                    for (int i = 0; i <= 10; i++)
                        System.out.println("\t" + numero + " x " + i + " = " + numero*i);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void contarNotas(Scanner teclado) {
        System.out.println("18. Dadas 6 notas, escribir la cantidad de aprobados, condicionados (=4) y suspensos.");
        int[] notas = new int[6];
        int index = 0, suspensos = 0, condicionados = 0, aprobados = 0;
        while (true) {
            try{
                for (int i = index; i < notas.length; i++, index++) {
                    System.out.print("\n\tIntroduce la nota " + (i+1) + ": ");
                    notas[i] = teclado.nextInt();
                }
                for (int i = 0; i < notas.length; i++) {
                    if (notas[i] < 4)
                        suspensos++;
                    else if (notas[i] == 4)
                        condicionados++;
                    else if (notas[i] >= 5)
                        aprobados++;
                }
                System.out.println("\n\tHay " + suspensos + " suspensos, " + condicionados + " condicionados y " + aprobados + " aprobados.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }

    public static void sueldoMaximo(Scanner teclado) {
        System.out.println("19. Pedir un numero N, introducir N sueldos, y mostrar el sueldo maximo.");
        int Nsueldos = 0, index = 0;
        int[] sueldos;
        do {
            System.out.print("\n\tIntroduce el numero de sueldos a procesar: ");
            Nsueldos = teclado.nextInt();
            if (Nsueldos <= 0) {
                System.out.println("\n\tError: introduce un numero mayor de cero.");
                continue;
            }
        } while (Nsueldos <= 0);
        while (true) {
            try {
                sueldos = new int[Nsueldos];
                for (int i = index; i < sueldos.length; i++, index++) {
                    System.out.print("\n\tIntroduce el sueldo " + (i+1) + ": ");
                    sueldos[i] = teclado.nextInt();
                }         
                int[] sueldos_ordenados = MiClase.ordenarMayorMenor(sueldos);
                System.out.println("\n\tEl mayor de los sueldos introducidos es " + sueldos_ordenados[0]);  
                break;  
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
            
        }
    }

    public static void comprobarMultiplos3(Scanner teclado) {
        System.out.println("20. Pedir 5 numeros e indicar si alguno es multiplo de 3.");
        int[] numeros = new int[5];
        int index = 0;
        while (true) {
            try {
                for (int i = index; i < numeros.length; i++, index++) {
                    System.out.print("\n\tIntroduce el numero " + (i+1) + ": ");
                    numeros[i] = teclado.nextInt();
                }
                String multiplos = "";
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i]%3 == 0)
                        multiplos += numeros[i] + ". ";
                }
                if (multiplos == "")
                    System.out.println("\n\tNinguno de los numeros es multiplo de 3.");
                else
                    System.out.println("\n\tLos siguientes numeros son multiplos de 3: " + multiplos);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: Introduce un numero entero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (true) {
            try {
                MiClase.clearScreen();
                System.out.println("\nJava. Segunda relacion de ejercicios (Fran Galvez).");
                System.out.println("---------------------------------------------------\n");
                MiClase.menu (new String[] {
                    "0. Salir",
                    "1. Comprobar si un numero entero positivo es primo o no.",
                    "2. Mostrar el cuadrado de un numero, hasta introducir un numero negativo.",
                    "3. Indicar si un numero es positivo o negativo, hasta introducir un cero.",
                    "4. Indicar si un numero es par o impar, hasta introducir un cero.",
                    "5. Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido.",
                    "6. Adivina el numero.",
                    "7. Sumar numeros.",
                    "8. Calcular media.",
                    "9. Mostrar todos los numeros desde 1 hasta N.",
                    "10. Escribir todos los numeros de 100 a 0 de 7 en 7.",
                    "11. Pedir 15 numeros y escribir la suma total.",
                    "12. Producto de los primeros 10 numeros impares.",
                    "13. Calcular factorial de un número.",
                    "14. Pedir 10 numeros. Mostrar la media de los positivos, los negativos y la cantidad de ceros.",
                    "15. Pedir 10 sueldos. Mostrar su suma y cuantos son mayores de 1000 euros.",
                    "16. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18, y la cantidad de alumnos que miden más de 1.75.",
                    "17. Pedir un numero entre 1 y 10 y mostrar la tabla de multiplicar.",
                    "18. Dadas 6 notas, escribir la cantidad de aprobados, condicionadso y suspensos.",
                    "19. Pedir un numero N, introducir N sueldos, y mostrar el sueldo maximo.",
                    "20. Pedir 5 numeros e indicar si alguno es multiplo de 3."
                });
                System.out.print("\nEscoge una opcion: ");
                opcion = teclado.nextInt();
                MiClase.clearScreen();
                if (opcion < 0 || opcion > 20) {
                    System.out.println("Error: escoge una opcion entre 1 y 21.");
                    MiClase.pressAnyKeyToContinue(teclado);
                    continue;
                } else if (opcion == 0) {
                    MiClase.clearScreen();
                    System.exit(0);
                } else {
                    switch (opcion) {
                        case 1:
                            numeroPrimo(teclado);
                            break;
                        case 2:
                            cuadradoNumero(teclado);
                            break;
                        case 3:
                            esNegativo(teclado);
                            break;
                        case 4:
                            numeroPar(teclado);
                            break;
                        case 5:
                            cantidadNumerosIntroducidos(teclado);
                            break;
                        case 6:
                            adivinarNumero(teclado);
                            break;
                        case 7:
                            sumarNumeros(teclado);
                            break;
                        case 8:
                            calcularMedia(teclado);
                            break;
                        case 9:
                            numeros1N(teclado);
                            break;  
                        case 10:
                            imprimir100a0_7(teclado);
                            break;
                        case 11:
                            sumar15Numeros(teclado);
                            break;
                        case 12:
                            sumar10impares(teclado);
                            break;
                        case 13:
                            calcularFactorial(teclado);
                            break;
                        case 14:
                            mediaNumeros_Ceros(teclado);
                            break;
                        case 15:
                            mediaSueldos(teclado);
                            break;
                        case 16:
                            estadisticasAlumnos(teclado);
                            break;
                        case 17:
                            tablaMultiplicar(teclado);
                            break;
                        case 18:
                            contarNotas(teclado);
                            break;
                        case 19:
                            sueldoMaximo(teclado);
                            break; 
                        case 20:
                            comprobarMultiplos3(teclado);
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