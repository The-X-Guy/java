import java.util.Random;

class Matrices1 {
    static Random rnd = new Random();
    static int filas = 10;
    static int columnas = 10;
    static int[][] numeros = new int[filas][columnas];

    public static float calcularMediaFila (int n) {
        int suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += numeros[n][j];
            }
        return suma/(float)columnas;
        
    }
    public static float calcularMediaColumna (int n) {
        int suma = 0;
            for (int j = 0; j < filas; j++) {
                suma += numeros[j][n];
            }
        return suma/(float)filas;
        
    }
    public static void main (String[] args) {
        

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = rnd.nextInt(1000);
            }
        }

        System.out.print("     ");
        for (int i = 0; i < columnas; i++) {
            System.out.print("C" + i + "  ");
        }
        System.out.print("  Media");

        System.out.print("\n");
        System.out.print("     ");
        for (int i = 0; i < columnas; i++)
            System.out.print("--- ");
        System.out.printf("  ------");

        float total = 0f;
        System.out.print("\n");
        for (int i = 0; i < filas; i++) {
            System.out.print("F" + i + " | ");
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%3d ", numeros[i][j]);
            }
            float mediafila = calcularMediaFila(i);
            total += mediafila;
            System.out.print("| " + mediafila + "\n");
        }
        
        System.out.println("\t\t\t\t\t       -----");
        System.out.printf("\t\t\t\t\t       %5.1f", total/10);
        
    }
}