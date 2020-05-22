import java.io.*;
import java.util.*;

public class EstadisticasFichero {
    public static void main (String[] args){
        String nombreFichero = args[0];
        FileReader leerFichero;
        File fichero = new File(nombreFichero);
        int c;
        List<String> letras = new ArrayList<String>();
        List<Integer> contadores = new ArrayList<Integer>();
        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        try {
            leerFichero = new FileReader(nombreFichero);
            c = leerFichero.read();
            while (c != -1) {
                for (int i = 0; i < abc.length(); i++) {
                    String character = Character.toString(abc.charAt(i));
                    if (Character.toString((char)c).equals(character)) {
                        if (letras.contains(character)) {
                            int position = letras.indexOf(character);
                            Integer aux = new Integer(contadores.get(position));
                            contadores.set(position, aux.intValue() + 1);
                        } else {
                            letras.add(character);
                            contadores.add(new Integer(1));
                        }
                    }
                }
                c = leerFichero.read();
            }
            System.out.println("El peso del fichero es de " + fichero.length() + " Bytes.");
            for (int i = 0; i < letras.size(); i++) {
                System.out.println("La letra " + letras.get(i) + " aparece " + contadores.get(i) + " veces.");
            }
            leerFichero.close();
        } catch (IOException e) {
            System.out.println("Error: no se puede abrir el fichero para lectura.");
        }
    }
}