/*Ejercicio 4, TP1
 * Realizá un programa que pida al usuario ingresar dos números enteros num1 y num2.
 * Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato: 
 * “La suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio4 {
		private static	Scanner	input;	
	public static void main(String[] args) {
		// TP1EJ4
		input = new Scanner(System.in);
		System.out.println("Ingrese	un numero entero");	//Pedimos ingresar el numero
		int	num1=input.nextInt();	//Guardamos el valor en una variable de tipo INT (para numeros enteros).
		System.out.println("Por favor, ingrese otro numero entero. Puede ser igual al anterior.");	
		int num2=input.nextInt();	
		System.out.println("La suma entre "+ num1 +" y "+ num2 +" da como resultado= " + (num1 + num2)); //Mostramos por pantalla los valores usando + para concatenarlos.		
		input.close();
	}

}
