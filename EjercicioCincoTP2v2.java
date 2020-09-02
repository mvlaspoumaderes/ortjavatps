package ar.edu.ort.thp.tp2;
import java.util.Scanner;

public class EjercicioCincov2 {

	static Scanner input;
	public static final int TOPE = 20;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		double promedio;
		int contador = 0;
		int acumulador = 0;
		
		do {
			System.out.println("Ingrese un numero");
			int numero = Integer.parseInt(input.nextLine());
			contador++;
			acumulador += numero; // acumulador = acumulador + numero;
			promedio = acumulador / contador;
		} 	while (promedio < TOPE);
		System.out.println("La cantidad de valores ingresados fue: " + contador);
	}

}
