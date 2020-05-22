import java.util.Random;


public class CreaPersonaMatriz {
    static private String[] nombres = {"Fran", "Paula", "Laura", "Antonio", "Sebastian", "Victoria"};
    static private Persona[] personas = new Persona[100];

    public static void main (String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int tipo = rnd.nextInt(4);

            Fecha fechaNacimiento = new Fecha(rnd.nextInt(30), rnd.nextInt(12), rnd.nextInt(2002 - 1960) + 1960);
            // (2002 - 1960) + 1960: generar años entre 1960 y 2002.

            int dni = rnd.nextInt((int)Math.pow(10, 10)) + 1; //generar un número de 9 cifras.
            switch (tipo) {
                case 0:
                    personas[i] = new Persona(nombres[rnd.nextInt(6)], fechaNacimiento, dni);
                    break;
                case 1:
                    personas[i] = new Empleado(nombres[rnd.nextInt(6)], fechaNacimiento, dni, rnd.nextInt(3000) + 500);
                    break;
                case 2:
                    personas[i] = new Estudiante(nombres[rnd.nextInt(6)], fechaNacimiento, dni, rnd.nextInt(75), rnd.nextInt(15) + 1);
                    break;
                case 3:
                    personas[i] = new EmpleadoComision(nombres[rnd.nextInt(6)], fechaNacimiento, dni, rnd.nextInt(3000) + 500, rnd.nextInt(1000) + 1, rnd.nextDouble());
                    break;
            }
        }    
        for (int i = 0; i < 100; i++) {
            /*
            String cad = "Persona";
            if (personas[i] instanceof Estudiante) cad = "Estudiante";
            else if (personas[i] instanceof Empleado) cad = "Empleado"
            else if (personas[i] instanceof EmpleadoComision) = cad = "EmpleadoComision";
            System.out.println("\n\n" + cad + " numero " + (i+1));
            */
            System.out.println("\n\t-------------------------------------");    
            System.out.print("\n\t" + personas[i].getClass().getName() + " " + (i+1));
            System.out.print(personas[i]);
        }
    }
}