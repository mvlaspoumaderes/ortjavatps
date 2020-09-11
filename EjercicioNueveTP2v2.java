package ar.edu.ort.thp.tp2;
import java.util.Scanner;

public class EjercicioNuevev2 {

	public static Scanner input;
	public static final int TOPE_GRUPO = 5;
	public static final int TOPE_CICLOS = 3;		
	public static void main(String[] args) {
		// EJ9TP2v2
		input = new Scanner(System.in);
		
		for (int i = 0; i < TOPE_GRUPO; i++) {
			cicloGrupos();
		}
		input.close();
	}
	
	private static void cicloGrupos() {
		
		double acumulador;
		double numero;

		acumulador = 0.0;
		
		for (int i = 0; i < TOPE_CICLOS; i++){
			System.out.println("Ingrese un numero entero");
			numero = Double.parseDouble(input.nextLine());
			acumulador += numero;
		}

		System.out.println("El promedio del grupo es: " + acumulador /TOPE_CICLOS );
	}
}
