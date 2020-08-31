package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio12v3 {
	public static Scanner input;
	public static final int VALOR_DADO = 6;
	public static void main(String[] args) {
		// Ejemplo Ejercicio 12 TP1
		
		input = new Scanner(System.in);
		
		int contador = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Ingrese el valor del dado " + i);
			int dado = Integer.parseInt(input.nextLine());
			if (dado == VALOR_DADO) {
				contador++;
			}
		}
			switch (contador) {
			case 3: System.out.println("Excelente");
			break;
			
			case 2: System.out.println("Muy Bien");
			break;
			
			case 1: System.out.println("Regular");
			break;
			
			default: System.out.println("Insuficiente");
			break;
			}
		
		input.close();

	}

}
