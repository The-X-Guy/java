import java.util.ArrayList;
import java.util.Random;

public class Ejer3 {
    public static void main (String[] args) {
        SerVivo x = new SerVivo(3);
        SerVivo y = new SerVivo(5);
        
        if (x.mayor(y))
            System.out.println(x);
        else
            System.out.println(y);

        x = new Humano("Homero", 34);
        y = new Humano("Bart", 9);

        String[] nombres = {"Marge", "Maggie", "Homero", "Bart", "Lisa"};
        int[] edad = {39, 38, 9, 8, 2};

        ArrayList<SerVivo> lista = new ArrayList<SerVivo>(10);
        Random rnd = new Random();
        
        for (int i = 0; i < 10; i++) {
            if ((int)rnd.nextDouble()*5 == 1)
                lista.add(new SerVivo (edad[(int)rnd.nextDouble()*5]));
            else {
                lista.add(new Humano (nombres[(int)rnd.nextDouble()*5], edad[(int)rnd.nextDouble()*5]));
            }
        }
    }
}