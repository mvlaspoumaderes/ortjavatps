/*Ejercicio 3, TP1
 * Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario que
 * ingrese su nombre, y luego muestre un mensaje de bienvenida incluyendo el mismo.
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner; //Importamos la clase Scanner para el ingreso de datos por teclado.

public class Ejercicio3 {
		private static	Scanner	input;	//Declaramos la clase Scanner
	public static void main(String[] args) {
		// TP1EJ3
		input = new Scanner(System.in); //Definimos la clase Scanner
		System.out.println("Ingrese su nombre"); //Pedimos el ingreso por teclado del nombre
		String nombre = input.nextLine(); //Usamos la variable tipo String nombre para guardar el valor ingresado
		System.out.println("Bienvenido " + nombre);	//Mostramos por pantalla el saludo y el nombre. Usamos el signo + para concatenar los datos.
	 	input.close(); //Cerramos la clase Scanner. <-- Esto es MUY importante, en especial cuando nuestro codigo es largo, pesado y procesa muchos datos.
	}

}
