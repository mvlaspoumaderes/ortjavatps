package ar.edu.ort.thp.tp2;
import java.util.Scanner;

public class EjercicioSeis {
	static Scanner input;
	public static final int CANT_ALUMNOS = 10;
	public static void main(String[] args) {
		// EJ6TP2

		input = new Scanner(System.in);
		String nombre;
		String mejorAlumno = "";
		double promedio, mejorPromedio = 0.0;
		
		for (int contador = 1; contador <= CANT_ALUMNOS; contador++) {
			System.out.println("Ingrese el nombre del alumno: " + contador);
			nombre = input.nextLine();
			System.out.println("Ingrese el promedio del alumno " + nombre);
			promedio = Double.parseDouble(input.nextLine());
			if (promedio > mejorPromedio) {
				mejorPromedio = promedio;
				mejorAlumno = nombre;
			}
		}

		System.out.println(mejorAlumno + " es el mejor alumno y su promedio es: " + mejorPromedio);
		
		input.close();
	}
}
