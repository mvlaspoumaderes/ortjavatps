/*Escribí la función booleana esMultiplo(int num1, int num2) que recibirá dos enteros y devolverá
 * verdadero cuando el primero sea múltiplo de segundo (de lo contrario, devolverá falso). Para saber si
 * un número es múltiplo de otro utilizá el operador % (módulo), que devuelve el resto de la división. Probá
 * la función desde el main con los lotes de datos (5, 3) y (15, 3)*/


package ar.edu.ort.thp.tp2;
import java.util.Scanner;

public class EjercicioOcho {
	public static Scanner input;
	public static void main(String[] args) {
		// EJ8TP2
		input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero entero: ");
		int num2 = Integer.parseInt(input.nextLine());

		boolean esMultiplo;
		
		if (num1 % num2 == 0) {
			esMultiplo = true;
			System.out.println(esMultiplo);
		} else {
			esMultiplo = false;
			System.out.println(esMultiplo);
		}
		input.close();
	}

}
