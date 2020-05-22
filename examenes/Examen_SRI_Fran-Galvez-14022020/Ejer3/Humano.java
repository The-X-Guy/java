public class Humano extends SerVivo {
    private String nombre = "";
    public Humano (String nombre, int edad) {
        super(edad);
        this.nombre = nombre;
    }

    public String getNombre () {
        return this.nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public boolean equals (Humano otro) {
        if ((this.nombre.equals(otro.nombre))&&(this.edad == otro.edad))
            return true;
        else
            return false;
    }
    
    public String toString () {
        return "nombre: " + this.nombre + ", " + this.edad + "annos.";
    }
}