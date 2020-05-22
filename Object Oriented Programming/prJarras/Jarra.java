public class Jarra {
    protected int contenido;
    protected final int capacidad;

    public Jarra (int capacidad) {
        this.capacidad = capacidad;
        this.contenido = 0;
    }

    public int capacidad () {
        return this.capacidad;
    }

    public int contenido () {
        return this.contenido;
    }

    public void llenar () {
        this.contenido = capacidad;
    }

    public void vaciar () {
        this.contenido = 0;
    }

    public void llenarDesde (Jarra j) {
        if (this.capacidad > j.capacidad) {
            if (this.capacidad >= this.contenido + j.contenido) {
                this.contenido += j.contenido;
                j.contenido = 0;
            } else {
                int aux = this.contenido; // guardar el contenido de la primera jarra
                this.contenido = this.contenido + (this.capacidad - this.contenido);
                j.contenido = j.contenido - (this.capacidad - aux);
            }
        }
        if (this.capacidad < j.capacidad) {
            if (this.capacidad >= this.contenido + j.contenido){
                this.contenido = this.contenido + j.contenido;
                j.contenido = 0;
            } else {
                int aux = this.contenido; // guardar el conteido de la primera jarra
                this.contenido = this.contenido + (this.capacidad - this.contenido);
                j.contenido = j.contenido - (this.capacidad - aux);
            }
        }
    }

    public String toString() {
        return "\n\tCapacidad: " + this.capacidad + "\n\tContenido: " + this.contenido + "\n";
    }
}