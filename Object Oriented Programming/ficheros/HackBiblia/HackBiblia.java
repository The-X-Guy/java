import java.io.*;

public class HackBiblia {
    public static void main(String[] args) {
       String nombreFichero = "biblia_completa.txt";
       String nuevoFichero = "bilbia_hack.txt";
       FileReader lectura;
       FileWriter escritura;
       try {
            lectura = new FileReader(nombreFichero);
            escritura = new FileWriter(nuevoFichero);
            int leer = lectura.read();
            while (leer != -1) {
                switch ((char)leer) {
                    case 'a':
                        escritura.write('4');
                        break;
                    case 'e': 
                        escritura.write('3');
                        break;
                    case 'i': 
                        escritura.write('1');
                        break;
                    case 'o': 
                        escritura.write('0');
                        break;
                    case 'A': 
                        escritura.write('4');
                        break;
                    case 'E': 
                        escritura.write('0');
                        break;
                    case 'I': 
                        escritura.write('1');
                        break;   
                    case 'O': 
                        escritura.write('0');
                        break;
                    default:
                        escritura.write((char)leer);                 
                    
                }
                leer = lectura.read();
            }
            lectura.close();
            escritura.close();
       } catch (IOException e) {
           System.out.println(e);
       }
    }
}