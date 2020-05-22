import java.lang.Error;
class Alumno  {
    private String nombre;
    private String apellidos;
    private int edad;
    private String grupo;

    Alumno (String nombre, String apellidos, int edad) throws Exception {
        if (nombre == null || apellidos == null || nombre.equals("") || apellidos.equals(""))
            throw new Exception("Valores de nombre y/o apellidos no validos.");
        if (edad <= 0)
            throw new Exception ("Valor de edad no valido;");
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;      
    }
    
    Alumno (String nombre, String apellidos, int edad, String grupo) throws Exception {
        this(nombre, apellidos, edad);
        if (grupo == null)
            throw new Exception("Valor de grupo no valido");
        this.grupo = grupo;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nEdad: " + this.edad + "\nGrupo: " + this.grupo;
    }
}