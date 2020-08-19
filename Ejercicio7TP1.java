/*Realizá un programa que al ingresar por teclado tres números enteros num1, num2 y
 * num3, muestre el valor del mayor de todos.
 * En caso de igualdad entre los tres imprimir "Los números son iguales".
 * Test1: num1 = 12, num2 = 4, num3= 7. Resultado esperado: El mayor número es num1
 * Test2: num1 = 2, num2 = 65, num3= 8. Resultado esperado: El mayor número es num2 
 * Test3: num1 = 3, num2 = 10, num3= 28. Resultado esperado: El mayor número es num3
 * Test4: num1 = 5, num2 = 5, num3= 5. Resultado esperado: Los números son iguales
*/

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio7 {
	private static Scanner input;

	public static void main(String[] args) {
		// TP1EJ7
		input = new Scanner(System.in);
		System.out.println("Introduzca el primer número: ");
		int num1 = input.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int num2 = input.nextInt();
		System.out.print("Introduzca tercer número: ");
		int num3 = input.nextInt();
		if (num1 == num2 && num2 == num3) {
			System.out.println("Los numeros son iguales");
		} else if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El mayor es: " + num1);
			} else {
				System.out.println("El mayor es: " + num3);
			}
		} else if (num2 > num3) {
			System.out.println("El mayor es: " + num2);
		} else {
			System.out.println("El mayor es: " + num3);
		}
		input.close();
	}

}
