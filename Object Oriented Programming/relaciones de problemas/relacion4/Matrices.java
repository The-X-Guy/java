import java.util.Random;

class Matrices {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numeros = new int[10];
        int tam = numeros.length;
        int suma = 0;
        int sumapares = 0;
        int sumaimpares = 0;

        System.out.println("Los elementos de la matriz son:");
        for (int i = 0; i < tam; i++) {
            numeros[i] = rnd.nextInt(100);
            suma += numeros[i];
            System.out.println("\tElemento " + i + ": " + numeros[i]);
        }
        
        System.out.println("\nLa suma de los elementos de la matriz es " + suma + ".");
        System.out.println("\nLa media de los elementos de la matriz es " + (suma/(float)tam) + ".");
        
        System.out.println("\nLa matriz invertida es: ");
        for (int i = 0; i < tam; i++) {
            System.out.println("\tElemento " + i + ": " + numeros[tam - (i+1)]);
        }

        System.out.print("\nLa suma de las posiciones pares es ");
        for (int i = 0; i < tam; i+=2)
            sumapares += numeros[i];
        System.out.println(sumapares);

        System.out.print("\nLa suma de las posiciones pares es ");
        for (int i = 1; i < tam; i+=2)
            sumaimpares += numeros[i];
        System.out.println(sumaimpares);
    }
}