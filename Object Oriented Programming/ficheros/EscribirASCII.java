import java.io.*;

public class EscribirASCII {
    public static void main(String[] args) {
        String nombreFichero = "codigo_ascii.txt";
        FileWriter fichero;
        try {
            fichero = new FileWriter(nombreFichero);
            for (int i = 1; i < 255; i++)
                fichero.write((char)i);
            fichero.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}