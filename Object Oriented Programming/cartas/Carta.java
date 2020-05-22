class Carta{
    private String valor;
    private String palo;

    Carta(String valor, String palo){
        this.valor=valor;
        this.palo=palo;
    }

    public String toString(){
        return this.valor+" de "+this.palo;
    }
}