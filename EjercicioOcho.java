/*Escrib� la funci�n booleana esMultiplo(int num1, int num2) que recibir� dos enteros y devolver�
 * verdadero cuando el primero sea m�ltiplo de segundo (de lo contrario, devolver� falso). Para saber si
 * un n�mero es m�ltiplo de otro utiliz� el operador % (m�dulo), que devuelve el resto de la divisi�n. Prob�
 * la funci�n desde el main con los lotes de datos (5, 3) y (15, 3)*/


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
