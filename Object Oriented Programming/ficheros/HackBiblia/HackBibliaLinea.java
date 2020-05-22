import java.io.*;

public class HackBibliaLinea {
    public static void main(String[] args) {
       String nombreFichero = "biblia_completa.txt";
       FileReader lectura;
       BufferedReader filtro;
       String linea;
       try {
            lectura = new FileReader(nombreFichero);
            filtro = new BufferedReader(lectura);
            linea = filtro.readLine();
            int numLinea = 1;
            while (linea != null) {
                System.out.println(numLinea + ": " + linea.reverse());
                linea = filtro.readLine();
                numLinea++;
            }
            filtro.close();
            lectura.close();
       } catch (IOException e) {
           System.out.println(e);
       }
    }
}