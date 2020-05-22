class Persona {
    protected String nombre;
    protected Fecha fechaNacimiento;
    protected int dni;

    public Persona (String nombre, Fecha fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getNombre () {
        return this.nombre;
    }

    public Fecha getFechaNacimiento () {
        return this.fechaNacimiento;
    }

    public int getDni () {
        return this.dni;
    }

    public String toString () {
        return "\n\tNombre: " + this.nombre + "\n\tFecha de nacimiento: " + this.fechaNacimiento + "\n\tDNI: " + this.dni;
    }
}