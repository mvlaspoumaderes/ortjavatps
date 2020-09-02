package ar.edu.ort.thp.tp2;
import java.util.Scanner;

public class EjercicioSeisV2 {
	static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);
		String nombre;
		String mejorAlumno = "";
		double promedio, mejorPromedio = 0.0;
		
		for (int contador = 1; contador <= 10; contador++) {
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
