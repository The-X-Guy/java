public class Bombilla {

    private String nombre;
    private Boolean estado;
    private int potencia;
    private int horas;

    public Bombilla (String nombre, Boolean estado) {
        if (nombre == "") {
            System.out.println("Error: no pueden crearse bombillas sin nombre.");
        } else {
            this.nombre = nombre;
            this.estado = estado;
        }
    }

    public Bombilla (String nombre, Boolean estado, int potencia, int horas) {
        if (nombre == "") {
            System.out.println("Error: no pueden crearse bombillas sin nombre.");
        } else {
            this.nombre = nombre;
            this.estado = estado;
            this.potencia = potencia;
            this.horas = horas;
        }
    }

    public float coste () {
        return 0.2f * this.horas * (this.potencia/100f);
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setEstado (Boolean estado) {
        this.estado = estado;
    }
    public void setPotencia (int potencia) {
        this.potencia = potencia;
    }
    public void setHoras (int horas) {
        this.horas = horas;
    }

    public String getNombre () {
        return this.nombre;
    }
    public Boolean getEstado () {
        return this.estado;
    }
    public int getPotencia () {
        return this.potencia;
    }
    public int getHoras () {
        return this.horas;
    }

    public String toString () {
        String encendida = (this.estado == true)?" ON":" OFF";
        return "Bombilla (Lugar: " + this.nombre + ", Encendida:" + encendida + ", Potencia: " + this.potencia + "w, Tiempo: " + this.horas + " horas)\n";
    } 


}