public class UsaAlumno {
    public static void main (String[] args) {
        try {
            Alumno fran = new Alumno("Francisco", "Galvez", 21, "2 ASIR");
            System.out.print(fran);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}