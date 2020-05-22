class Estudiante extends Persona {
    protected int puntuacionTotal;
    protected int numeroCalificaciones;

    public Estudiante (String nombre, Fecha fechaNacimiento, int dni, int puntuacionTotal, int numeroCalificaciones) {
        super(nombre, fechaNacimiento, dni);
        this.puntuacionTotal = puntuacionTotal;
        this.numeroCalificaciones = numeroCalificaciones;
    }

    public void nuevaCalificacion (int calificacion) {
        this.puntuacionTotal += calificacion;
        this.numeroCalificaciones++;
    }

    public double getNotaMedia () {
        return (double) this.puntuacionTotal / this.numeroCalificaciones;
    }

    public String toString () {
        return super.toString() + "\n\tPuntuacion total: " + this.puntuacionTotal + "\n\tNumero de calificaciones: " + this.numeroCalificaciones + "\n\tNota media: " + this.getNotaMedia() + "\n";
    }
}