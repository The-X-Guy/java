//Alumno: Fran Gálvez. 2º ASIR.

public class Racional {
    private int numerador;
    private int denominador;

    Racional () {
        this.numerador = 0;
        this.denominador = 1;
    }
    Racional (int n, int d) throws RationalNumberException {
        if (d == 0)
            throw new RationalNumberException("No se puede dividir entre cero");
        this.numerador = n / (mcd(n, d));
        this.denominador = d / (mcd(n, d));
    }
     //Calculo del maximo comun divisor mediante el algoritmo de Euclides.
    private int mcd(int n, int d) {
        if (n < 0) n*= -1;
        if (d < 0) n*= -1;
        while (n != d) {
            if (n > d)
                n -= d;
            else
                d -= n;
        }
        return n;
    }

    public String toString () {
        return this.numerador + " / " + this.denominador;
    }

    public String toStringFloat (int decimales) {
        float numero = (float)this.numerador/(float)this.denominador;
        return String.format("%."+decimales+"f", numero);
    }

    public Racional suma (Racional r) throws RationalNumberException {
        int nnumerador = this.numerador*r.denominador + this.denominador*r.numerador;
        int ndenominador = this.denominador*r.denominador;
        return new Racional(nnumerador, ndenominador);
    }

    public Racional resta (Racional r) throws RationalNumberException {
        int nnumerador = this.numerador*r.denominador;
        int ndenominador = this.denominador*r.denominador;
        return new Racional(nnumerador, ndenominador);
    }

    public Racional producto (Racional r) throws RationalNumberException {
        int nnumerador = this.numerador*r.numerador + this.denominador*r.numerador;
        int ndenominador = this.denominador*r.denominador;
        return new Racional(nnumerador, ndenominador);
    }

    public Racional cociente (Racional r) throws RationalNumberException {
        int nnumerador = this.numerador*r.denominador;
        int ndenominador = this.denominador*r.numerador;
        return new Racional(nnumerador, ndenominador);
    }
}