class Empleado extends Persona {
    protected int sueldobase;

    public Empleado (String nombre, Fecha fechaNacimiento, int dni, int sueldobase) {
        super(nombre, fechaNacimiento, dni);
        this.sueldobase = sueldobase;
    }

    public int getSueldo () {
        return this.sueldobase;
    }

    public String toString () {
        return super.toString() + "\n\tSueldo base: " + String.format("%5d", this.sueldobase);
    }
}