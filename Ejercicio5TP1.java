/*Ejercicio 5, TP1
 * Realizá un programa que, dados dos números enteros num1 y num2 cargados desde
 * teclado por el usuario, muestre el resultado de la división del primero por el segundo
 * siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado.
 * En el caso de que el segundo valor num2 sea cero, mostrar el siguiente mensaje de error:
 * “No se puede dividir por cero”.
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio5 {
		private static	Scanner	input;	
	public static void main(String[] args) {
		// TP1EJ5
		input = new Scanner(System.in);
		System.out.println("Ingrese	un numero entero");	
		int	num1=input.nextInt();	
		System.out.println("Por favor, ingrese otro numero entero, distinto de cero.");	
		int num2=input.nextInt();	
		if (num2 == 0){//con if validamos primero si el valor de num2 = 0, y devolvemos el mensaje en caso afirmativo. 
			System.out.println("No se puede dividir por cero");
		} else {//Si num2 es distinto de 0 (cero), entonces muestra por pantalla el resultado de la division.
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); //como usamos el signo + para concatenar, las operaciones deben resolverte entre ().
			}		
		input.close();
	}

}
