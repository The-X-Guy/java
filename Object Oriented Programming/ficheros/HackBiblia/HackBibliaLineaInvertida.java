import java.io.*;
import java.lang.StringBuffer.*;

public class HackBibliaLineaInvertida {
    public static void main(String[] args) {
       String nombreFichero = "biblia_completa.txt";
       FileReader lectura;
       BufferedReader filtro;
       StringBuffer invertido;
       String linea;
       try {
            lectura = new FileReader(nombreFichero);
            filtro = new BufferedReader(lectura);
            linea = filtro.readLine();
            int numLinea = 1;
            while (linea != null) {
                invertido = new StringBuffer(linea).reverse();
                System.out.printf("%s5 : %s \n", numLinea, invertido);
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