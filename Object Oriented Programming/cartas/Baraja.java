import java.util.Random;

public class Baraja{
    private Carta[] mazo;
    private int tam;
    private int mano = 0;
    public Baraja(){
        String[] valores={"As","2","3","4","5","6","7","8","9","10","Sota","Caballo","Rey"};
        String[] palos={"Oros","Copas","Espadas","Bastos"};
        int k=0;
        this.tam = (valores.length)*(palos.length);
        mazo = new Carta[tam];
        for(int j=0;j<palos.length;j++){
            for (int i=0;i<valores.length;i++){
                mazo[k]=new Carta(valores[i],palos[j]);
                k++;
            }
        }
    }

    public String toString(){
        String res="";
        for(int i=1;i<=mazo.length;i++){
            res+=String.format("%2d: %-19s",i,mazo[i-1]);
            if (i%4==0) res+="\n";
        }
        return res;
    }

    public void barajar() {
        Carta aux;
        Random r = new Random();
        for (int i = 0; i < this.mazo.length; i++) {
            int position = r.nextInt(52);
            aux = this.mazo[i];
            this.mazo[i] = this.mazo[position];
            this.mazo[position] = aux;
        }
    }
    public Carta repartirCartas () {
        if (mano < tam) {
            return this.mazo[mano++]; 
        } else 
            return null;
    }
}