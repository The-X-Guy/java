import java.util.Random;

public class Casa {

    private Bombilla[] bombilla = new Bombilla[10];
    private Random rnd = new Random();
    private String[] lugares = {"Salon", "Cocina", "Baño", "Dormitorio 1", "Dormitorio 2", "Dormitorio 3", "Entrada", "Balcon"};
    private Boolean[] estados = {true, false};

    public Casa () {
        for (int i = 0; i < 10; i++)
            this.bombilla[i] = new Bombilla (lugares[rnd.nextInt(7)], estados[rnd.nextInt(2)], rnd.nextInt(60), rnd.nextInt(100));
    }

    public float consumoTotal () {
        float suma = 0f;
        for (int i = 0; i < 10; i++) {
            suma += this.bombilla[i].coste();
        }
        return suma / 10;
    }

    public String toString () {
        String str = "Casa[";
        for (int i = 0; i < 10; i++) {
            str += "Bombilla " + (i+1) + " (" + this.bombilla[i] + ", ";
        }
        str += "Consumo: " + this.consumoTotal() + "kWh";
        str += "]\n";
        return str; 
    }
}