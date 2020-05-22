public class CreaPersona {
    public static void main (String[] args) {
        Persona p1 = new Persona ("Manolo", new Fecha(23, 4, 2010), 123456789);
        Persona p2 = new Estudiante ("Juan", new Fecha(9, 1, 1998), 987654321, 80, 6);
        Persona p3 = new Empleado ("David", new Fecha(8, 6, 1995), 123498765, 1400);
        Persona p4 = new EmpleadoComision("Laura", new Fecha(11, 11, 1980), 129834765, 1350, 400, 0.2);
        System.out.print(p1);
        // System.out.println(p1.getClass());
        System.out.print(p2);
        System.out.print(p3);
        System.out.print(p4);
    }
}