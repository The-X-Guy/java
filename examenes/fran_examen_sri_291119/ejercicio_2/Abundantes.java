import java.util.Arrays;
class Abundantes {

    public static int[] calcularDivisores (int n) {
        int[] div = new int[10];
        Arrays.fill(div, 0);
        //---------- DEPURACIÓN --------------
        for (int i = 0; i < div.length; i++) {
            System.out.print(i + ", ");
        }
        //------------------------------------
        int cont = 1;
        int i = 0;
        while (cont <= n) {
            if (n%cont == 0) {
                div[i] = cont; //Error: ArrayIndexOutOfBoundsException
            } else cont++;
        }
        return div;
    }

    public static Boolean abundante(int n) {
        int suma = 0;
        int[] div = calcularDivisores(n);

        for (int i = 0; i < div.length; i++)
            suma += div[i];

        if (suma*2 > n)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Calculo de los primeros 1000 numeros abundantes.");
        System.out.println("------------------------------------------------\n");
        for (int n = 1; n <= 10; n++) {
            String esAbundante = (abundante(n))?" Si ":" No ";
            System.out.println("\tPrimer número: " + n + ". " + esAbundante + " es abundante.");

        }
    }
}