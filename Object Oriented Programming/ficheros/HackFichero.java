import java.io.*;

public class HackFichero {
    public static void main (String[] args){
        String nombreFichero = args[0];
        BufferedReader leer = new BufferedReader (new FileReader(args[0]));
        BufferedWriter escritura = new BufferedWriter (new FileWriter(args[0]));
        String line;
        try {
           line = leer.readLine();
            while (line != null) {
                    line = line.replace(replace(replace("e", "3")"a", "4");
                    switch (character) {
                        case "a":
                            escribirFichero.write("4");
                            break;
                        default:
                            escribirFichero.write((char)c);
                    }
                c = leerFichero.read();
            }
            leerFichero.close();
        } catch (IOException e) {
            System.out.println("Error: no se puede abrir el fichero para lectura.");
        }
    }
}