public class Ejercicio1 {
    static int[] notas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int[] claseA = {0, 1, 2, 6, 6, 5, 2, 2, 0, 1};
    static int[] claseB = {1, 3, 1, 3, 4, 2, 1, 1, 1, 1};

    
    public static void imprimirNotas (int[] notas, int[] clase) {
        for (int i = 0; i < notas.length; i++)
            System.out.println("\tHay " + clase[i] + " alumnos con un " + notas[i] + ".");
    }
    public static float media (int[] notas, int[] clase) {
        int suma = 0;
        for (int i = 0; i < clase.length; i++) {
            for (int j = 0; j < clase[i]; j++) {
                suma += notas[i];
            }
        }
        float media = (float)suma / clase.length;
        return media;
    }

    public static void main (String[] args) {
        System.out.print("         ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(" " + notas[i] + " ");
        }
        System.out.print("\n");
        System.out.print("         ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(" --");
        }
        System.out.print("\nClase A | ");
        for (int i = 0; i < claseA.length; i++) {
            System.out.print(" " + claseA[i] + " ");
        }
        System.out.print("\nClase B | ");
        for (int i = 0; i < claseB.length; i++) {
            System.out.print(" " + claseB[i] + " ");
        }

        int totalA = 0;
        int totalB = 0;
        for (int i = 0; i < notas.length; i++) {
            totalA += claseA[i];
            totalB += claseB[i];
        }
        System.out.println("\n\nEl total de alumnos de la clase A es " + totalA + ", y en la clase B hay " + totalB + " alumnos.");
        System.out.println("\nLas calificaciones de la clase A son:");
        imprimirNotas(notas, claseA);
        System.out.println("\nLas calificaciones de la clase B son:");
        imprimirNotas(notas, claseB);

        float mediaA = media(notas, claseA);
        float mediaB= media(notas, claseB);
        System.out.println("\nLa media de la case A es de " + mediaB + ".");
        System.out.println("La media de la case B es de " + mediaB + ".");

        System.out.println("\nLa media total de todos los datos es " + ((mediaA+mediaB)/2));

        System.out.println("\nLa tabla total resultante con todos los datos es: ");
        System.out.print("         ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("  " + notas[i] + " ");
        }
        System.out.print("\n");
        System.out.print("         ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(" ---");
        }
        System.out.print("\nClase A | ");
        for (int i = 0; i < claseA.length; i++) {
            System.out.print(" " + claseA[i] + "  ");
        }
        System.out.println(" |  " + totalA);
        System.out.print("Clase B | ");
        for (int i = 0; i < claseB.length; i++) {
            System.out.print(" " + claseB[i] + "  ");
        }
        System.out.println(" |  " + totalB);
        System.out.print("         ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(" ---");
        }
        System.out.print("    ----");
        System.out.print("\nMedia   | ");
        float total = 0f;
        for (int i = 0; i < notas.length; i++) {
            total += (claseA[i] + claseB[i])/2f;
            System.out.print(((claseA[i] + claseB[i])/2f) + " ");
        }
        System.out.println(" | " + total);
    }
}
