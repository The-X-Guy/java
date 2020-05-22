class EmpleadoComision extends Empleado {
    protected int dineroVentas;
    protected double porcentajeComision;

    public EmpleadoComision (String nombre, Fecha fechaNacimiento, int dni, int sueldobase, int dineroVentas, double porcentajeComision) {
        super(nombre, fechaNacimiento, dni, sueldobase);
        this.dineroVentas = dineroVentas;
        this.porcentajeComision = porcentajeComision;
    }

    public double getPorcentajeComision () {
        return this.porcentajeComision;
    }

    public int getSueldo () {
        return this.sueldobase + (int)(this.dineroVentas*this.porcentajeComision);
    }

    public String toString () {
        return super.toString() + "\n\tComision: " + String.format("%5d", this.dineroVentas) + "\n\tPorcentaje comision: " + String.format("%.2f", (double)(this.porcentajeComision*100)) + "%\n\tSueldo: " + String.format("%5d", this.getSueldo());
    }
}