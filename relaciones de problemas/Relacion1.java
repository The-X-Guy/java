//Alumno: Fran Gálvez. 2º ASIR.
// Método main() comienza en la línea 405.

import java.util.*;
import java.io.*;
// import java.lang.Math;

public class Relacion1 {
    public static void calculoEcuacionSegundoGrado (Scanner teclado) {
        System.out.println("\n1. Calculo de las soluciones reales de una ecuacion de segundo grado dados los términos según la fórmula ax^2 + bx+ c = 0.");
        while (true) {                   
            try {
                double a, b, c;
                double[] resultado;
                int res_length;
                String ecuacion, c_sign;
                System.out.print("\n\tIntroduce el primer termino: ");
                a = teclado.nextInt();
                System.out.print("\tIntroduce el segundo termino: ");
                b = teclado.nextInt();
                System.out.print("\tIntroduce el tercer termino: ");
                c = teclado.nextInt();
                c_sign = (c>0)?"+":"";
                ecuacion = a + "x^2 + " + b + "x " + c_sign + "" + c;
                resultado = MiClase.ecuacionSegundoGrado(a, b, c);
                res_length = resultado.length;
                switch (res_length) {
                    case 0:
                        System.out.println("\n\tLa ecuacion " + ecuacion + " tiene soluciones complejas.\n");
                        break;
                    case 1:
                        System.out.println("\n\tLa ecuacion " + ecuacion + " tiene solucion unica: " + resultado[0] + "\n");
                        break;
                    case 2:
                        System.out.println("\n\tLas soluciones de la ecuacion " + ecuacion + " son " + resultado[0]  + " y " + resultado[1] + "\n");
                        break;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            }
        }
    }     
    public static void calculoAreaCirculo (Scanner teclado) {
        System.out.println("\n2. Calculo  del area del circulo.\n");
        while (true) {
            try {
                double radio, area;
                System.out.print("\tIntroduce un radio: ");
                radio = teclado.nextDouble();
                area = MiClase.areaCirculo(radio);
                System.out.print("\n\tEl area del circulo es " + area + " cm^2,\n");
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void calcularLongitudCircunferencia (Scanner teclado) {
        System.out.println("\n3. Calculo de la longitud de una circunferencia.\n");
        while(true) {
            try {
                double radio, longitud;
                System.out.print("\tIntroduce un radio: ");
                radio = teclado.nextDouble();
                longitud = MiClase.longitudCircunferencia(radio);
                System.out.println("\n\tLa longitud de la circunferencia es " + longitud + " cm^2.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void comprobarSonIguales (Scanner teclado) {
        System.out.println("\n4. Se piden dos numeros por teclado y se comprueba si son iguales o no.\n");
        while (true) {
            try {
                int numero1, numero2;
                String salida;
                System.out.print("\tIntroduce el primer numero: ");
                numero1 = teclado.nextInt();
                System.out.print("\tIntroduce el segundo numero: ");
                numero2 = teclado.nextInt();
                salida = (MiClase.sonIguales(numero1, numero2))?" son ":" no son ";
                System.out.println("\n\t" + numero1 + " y " + numero2 + salida + "iguales.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void comprobarEsNegativo (Scanner teclado) {
        System.out.println("\n5. Calcular si un numero es positivo o negativo.\n");
        while (true) {
            try {
                double numero;
                String salida;
                System.out.print("\tIntroduce un numero: " );
                numero = teclado.nextDouble();
                salida = (MiClase.numeroNegativo(numero))?"negativo":"positivo";
                System.out.println("\n\tEl numero " + numero + " es " + salida);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void comprobarEsMultiplo (Scanner teclado) {
        System.out.println("\n6. Introduce dos numeros y comprueba si uno es multiplo del otro.\n");
        while (true) {
            try {
                int numero1, numero2;
                int[] salida;
                System.out.print("\tIntroduce el primer numero: ");
                numero1 = teclado.nextInt();
                System.out.print("\tIntroduce el segundo numero: ");
                numero2 = teclado.nextInt();
                salida = MiClase.esMultiplo(numero1, numero2);
                if (salida.length != 0)
                    System.out.println("\n\tEl numero " + Integer.toString(salida[0]) + " es multiplo " + Integer.toString(salida[1]) + ".");
                else
                    System.out.println("\n\tNingun numero es multiplo del otro.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            }
        }
    }
    public static void ordenarMayorMenor(Scanner teclado) {
        System.out.println("\n7-9. Dados varios numeros, se ordenan de mayor a menor (minimo dos).");
        while(true) {
            try {
                System.out.print("\n\tIntroduce la cantidad de numeros a ordenar: ");
                int array_length = teclado.nextInt();
                if (array_length <= 1) {
                    System.out.println("\n\tError: no se pueden ordenar menos de dos numeros.");
                    continue;
                }
                int[] numeros = new int[array_length];
                for (int i = 0, j = i+1; i < array_length;j++, i++) {
                    System.out.print("\tIntroduce el numero " + j + ": ");
                    numeros[i] = teclado.nextInt();
                }
                int[] salida = MiClase.ordenarMayorMenor(numeros);
                System.out.print("\n\tLos numeros ordenados de mayor a menor son: ");
                for (int i = 0; i < salida.length - 2; i++) {
                    System.out.print(numeros[i] + ", ");
                }
                System.out.print(Integer.toString(numeros[salida.length - 2]));
                System.out.println(" y " + numeros[salida.length - 1] + ".");
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            }
        }
    }
    public static void ordenarMayorMenorIguales (Scanner teclado) {
        System.out.println("\n8. Ordenar dos numeros de menor a mayor, o indicar si son iguales en caso de serlo.\n");
        while (true) {
            try {
                System.out.print("\tIntroduce el primer numero: ");
                int numero1 = teclado.nextInt();
                System.out.print("\tIntroduce el segundo numero: ");
                int numero2 = teclado.nextInt();
                int array_length = 2;
                int[] numeros = new int[array_length];
                numeros[0] = numero1;
                numeros[1] = numero2;
                int[] salida = MiClase.ordenarMayorMenor(numeros);
                if (salida[0] == salida[1])
                    System.out.println("\n\tLos numeros son iguales.");
                else
                    System.out.println("\n\tLos numeros ordenados de mayor a menor son " + salida[0] + " y " + salida[1]);
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            }
        }
    }
    public static void calcularCifras (Scanner teclado) {
        System.out.println("\n10. Dado un numero hasta 9.999, se calcula el numero de cifras.\n");
        while (true) {
            try {
                System.out.print("\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                int cifras = MiClase.calcularCifras(numero);
                System.out.println("\n\tEl numero " + numero + " tiene " + cifras + " cifras.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            }
        }
    }
    public static void invertirNumero (Scanner teclado) {
        System.out.println("\n11. Dado un numero por teclado, se invierten sus cifras.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                int invertido = MiClase.invertirNumero(numero);
                System.out.print("\n\tEl numero invertido es " + invertido + ".\n");
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            }
        }
    }
    public static void comprobarCapicua (Scanner teclado) {
        System.out.println("\n12. Dado un numero por teclado, se comprueba si es capicua.");
        while (true) {
            try {
                System.out.print("\n\tIntroduce un numero: ");
                int numero = teclado.nextInt();
                int invertido = MiClase.invertirNumero(numero);
                if (numero == invertido)
                    System.out.println("\n\tEl numero " + numero + " es capicua.");
                else
                    System.out.println("\n\tEl numero " + numero + " no es capicua.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            }
        }
    }
    public static void imprimirNota (Scanner teclado) {
        System.out.println("\n13. Introducir una nota numerica, si:");
        while (true) {
            try {
                MiClase.menu (new String[] {
                    "0-4 -> Insuficiente.\n",
                    "5 -> Suficiente.\n",
                    "6 -> Bien.\n",
                    "7-8 -> Notable.\n",
                    "9-10 -> Sobresaliente\n"
                });
                System.out.print("\n\tIntroduce una nota: ");
                int nota = teclado.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: introduce una nota entre 0 y 10.");
                    continue;
                }
                if (nota >= 0 && nota < 5)
                    System.out.println("\n\tUn " + nota + " es un insuficiente.");
                else if (nota == 5)
                    System.out.println("\n\tUn " + nota + " es un suficiente.");
                else if (nota == 6)
                    System.out.println("\n\tUn " + nota + " es un bien.");
                else if (nota == 7 || nota == 8)
                    System.out.println("\n\tUn " + nota + " es un notable.");
                else
                    System.out.println("\n\tUn " + nota + " es un sobresaliente.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            }
        }
    }
    public static void comprobarFecha (Scanner teclado) {
        System.out.println("\n14. Pedir el día, mes y anno de una fecha e indicar si la fecha es correcta.");
        while (true) {
            try {
                System.out.print("\tIntroduce un dia: ");
                int dia = teclado.nextInt();
                System.out.print("\tIntroduce un mes: ");
                int mes = teclado.nextInt();
                System.out.print("\tIntroduce un anno: ");
                int anno = teclado.nextInt();
                if ((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || (anno < 0)) {
                    System.out.println("\n\tError: por favor, introduce los datos con el formato: ");
                    System.out.println("\t\tDia: numero entero entre 1 y 31.");
                    System.out.println("\t\tMes: numero entero entre 1 y 12.");
                    System.out.println("\t\tAnno: numero entero meyor que cero.\n");
                    continue;
                } else {
                    int mes_31 = 0;
                    int[] meses_31 = new int[] {1, 3, 5, 7, 8, 10, 12};
                    if (mes == 2) {
                        if (dia >= 1 && dia <= 28) 
                            System.out.println("\n\tLa fecha " + dia + "/" + mes + "/" + anno + " es correcta.");
                        else
                            System.out.println("\n\tLa fecha " + dia + "/" + mes + "/" + anno + " es incorrecta.");
                    } else {
                        if (dia >= 1 && dia <=31) {
                            for (int i = 0; i < meses_31.length; i++) {
                                if (mes == meses_31[i]) mes_31 = 1;
                                if (mes_31 == 1) break;
                            }
                        }
                        if (mes_31 == 1) {
                            if (dia >= 1 && dia <= 31)
                                System.out.println("\n\tLa fecha " + dia + "/" + mes + "/" + anno + " es correcta.");
                            else
                                System.out.println("\n\tLa fecha " + dia + "/" + mes + "/" + anno + " es incorrecta.");
                        } else {
                            if (dia >= 1 && dia <= 30)
                                System.out.println("\n\tLa fecha " + dia + "/" + mes + "/" + anno + " es correcta.");
                            else
                                System.out.println("\n\tLa fecha " + dia + "/" + mes + "/" + anno + " es incorrecta.");
                        }
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            }
        }
    }
    public static void horaSegundoSiguiente (Scanner teclado) {
        System.out.println("\n15. una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.\n");
        while (true) {
            try {
                System.out.print("\tIntroduce la hora: ");
                int horas = teclado.nextInt();
                if (horas < 0 || horas > 23) {
                    System.out.println("\n\tError: introduce una hora entre 0 y 24.");
                    continue;
                }
                System.out.print("\tIntroduce los minutos: ");
                int minutos = teclado.nextInt();
                if (minutos < 0 || minutos > 59) {
                    System.out.println("\n\tError: introduce un minuto entre 0 y 59.");
                    continue;
                }
                System.out.print("\tIntroduce los segundos: ");
                int segundos = teclado.nextInt();
                if (segundos < 0 || segundos > 59){
                    System.out.println("\n\tError: introduce un segundo entre 0 y 59.");
                    continue;
                }
                int horas_s = 0, minutos_s = 0, segundos_s = 0;

                if (segundos >= 0 && segundos < 59) {
                    segundos_s = segundos + 1;
                    minutos_s = minutos;
                    horas_s = horas;
                } else {
                    segundos_s = 0;
                    minutos_s = minutos + 1;
                    horas_s = horas;
                    if (minutos >= 0 && minutos < 58) {
                        minutos_s = minutos + 1;
                        horas_s = horas;
                    } else {
                            minutos_s = 0;
                            horas_s = horas + 1;
                            if (horas >= 0 && horas < 23)
                                horas_s = horas + 1;
                                else
                                    horas_s = 0;
                    }
                }
                System.out.print("\n\tLa hora introducida es " + horas + ":" + minutos + ":" + segundos + ".");
                System.out.print("\n\tLa hora mas un segundo es " + horas_s + ":" + minutos_s + ":" + segundos_s + ".\n");
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("\n\tError: introduce un numero entero.");
                teclado.nextLine();
            }
        }
    }
    // public static void escribirNumero (Scanner teclado) {
    //     while (true) {
    //         try {
    //             System.out.println("16. Dado un numero de 0 a 99, mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.\n");
    //             System.out.print("Introduce un numero:");
    //             int numero =  teclado.nextInt();
    //             if (numero < 0 || numero > 99) {
    //                 System.out.println("Error: introduce un numero entre 0 y 99.");
    //                 continue;
    //             }

    //             break;
    //         } catch (InputMismatchException e) {
    //             System.out.println("\n\tError: introduce un numero entero.");
    //             teclado.nextLine();
    //         } catch (NumberFormatException e) {
    //             System.out.println("\n\tError: introduce un numero entero.");
    //             teclado.nextLine();
    //         }
    //     }
    // }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (true) {
            try {
                MiClase.clearScreen();
                System.out.println("\nJava. Primera relacion de ejercicios (Fran Galvez).");
                System.out.println("---------------------------------------------------\n");
                MiClase.menu (new String[] {
                    "1. Ecuacion de segundo grado.",
                    "2. Area de un circulo.",
                    "3. Longitud de una circunferencia.",
                    "4. Calcular si dos numeros son iguales.",
                    "5. Comprobar si un numero es positivo o negativo.",
                    "6. Comprobar si un numero es multiplo de otro.",
                    "7-9. Ordenar numeros de mayor a menor.",
                    "8. Comprobar si un numero es mayor que otro o si son iguales.",
                    "10. Calcular las cifras de un numero.",
                    "11. Invertir un numero.",
                    "12. Comprobar si un numero es capicua.",
                    "13. Dada una nota numerica e indicar si es insuficiente, bien, ...",
                    "14. Dados el dia, mes y anno de una fecha e indicar si la fecha es correcta.",
                    "15. Dada una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente."
                    // "16. Dado un numero de 0 a 99, mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis."
                });
                System.out.print("\nEscoge una opcion:");
                opcion = teclado.nextInt();
                MiClase.clearScreen();
                if (opcion < 0|| opcion > 16) {
                    System.out.println("Error: escoge una opcion entre 1 y 16.");
                    MiClase.pressAnyKeyToContinue(teclado);
                    continue;
                } else if (opcion == 0) {
                    MiClase.clearScreen();
                    System.gc();
                    System.exit(0);
                } else {
                    switch (opcion) {
                        case 1:
                            calculoEcuacionSegundoGrado(teclado);
                            break;
                        case 2:
                            calculoAreaCirculo(teclado);
                            break;
                        case 3:
                            calcularLongitudCircunferencia(teclado);
                            break;  
                        case 4:
                            comprobarSonIguales(teclado);
                            break;
                        case 5:
                            comprobarEsNegativo(teclado);
                            break;
                        case 6:
                            comprobarEsMultiplo(teclado);
                            break;
                        case 7:
                            ordenarMayorMenor(teclado);
                            break;
                        case 8:
                            ordenarMayorMenorIguales(teclado);
                            break;
                        case 9:
                            ordenarMayorMenor(teclado);
                            break;
                        case 10:
                            calcularCifras(teclado);
                            break;
                        case 11:
                            invertirNumero(teclado);
                            break;
                        case 12:
                            comprobarCapicua(teclado);
                            break;
                        case 13:
                            imprimirNota(teclado);
                            break;
                        case 14:
                            comprobarFecha(teclado);
                            break;
                        case 15:
                            horaSegundoSiguiente(teclado);
                            break;
                        // case 16:
                        //     escribirNumero (teclado);
                        //     break;
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