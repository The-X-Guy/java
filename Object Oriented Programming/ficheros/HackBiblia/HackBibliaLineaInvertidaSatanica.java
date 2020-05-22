import java.io.*;
import java.lang.StringBuffer.*;

public class HackBibliaLineaInvertidaSatanica {
    public static void main(String[] args) {
       String nombreFichero = "biblia_completa.txt";
       String bibliaSatanica = "bliblia_satanica.txt";
       FileReader lectura;
       FileWriter escritura;
       BufferedReader filtro;
       BufferedWriter filtro1;
       String linea;
       try {
            lectura = new FileReader(nombreFichero);
            escritura = new FileWriter(bibliaSatanica);
            filtro = new BufferedReader(lectura);
            filtro1 = new BufferedWriter(escritura);
            linea = filtro.readLine();
            int numLinea = 1;
            while (linea != null) {
                linea = linea.replace("Dios", "Satán").replace("a", "4").replace('e', '3').replace('i', '1').replace('o', '0');
                linea = String.format("%5d : %s \n", numLinea, new StringBuffer(linea).reverse());
                filtro1.write(linea.toUpperCase());
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