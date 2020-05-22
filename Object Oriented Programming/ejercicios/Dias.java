//Alumno: Fran Gálvez. 2º ASIR.

public class Dias {
	public enum DiaSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
	
	public static void main(String[] args) {
		DiaSemana hoy = DiaSemana.JUEVES;
		DiaSemana ultimo = DiaSemana.DOMINGO;
		System.out.println("Hoy es " + hoy);
		System.out.println("El último dia es " + ultimo);
	}
}