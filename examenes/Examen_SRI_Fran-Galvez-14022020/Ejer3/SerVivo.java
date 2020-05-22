public class SerVivo {
    protected int edad = 0;
    public SerVivo (int edad) {
        this.edad = edad;
    }

    public int getEdad () {
        return this.edad;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public boolean equals (SerVivo otro) {
        if (this.edad == otro.edad)
            return true;
        else
            return false;
    }

    public String toString () {
        return "El ser vivo tiene " + this.edad + " annos.";
    }

    public boolean mayor (SerVivo otro) {
        if (this.edad > otro.edad)
            return true;
        else
            return false;
    }
}