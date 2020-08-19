/*Ejercicio 15, TP1
 *  Existen dos reglas que identifican dos conjuntos de valores:
 *  - El número es de un solo dígito.
 *  - El número es impar.
 *  A partir de estas reglas, creá un algoritmo que asigne a las variables booleanas estaEnA,
 *  estaEnB, estaEnAmbos y noEstaEnNinguno el valor verdadero o falso, según corresponda,
 *  para indicar si el valor ingresado pertenece al primer conjunto, al segundo, a ambos o a
 *  ninguno, respectivamente. Definí un lote de prueba de varios números y probá el algoritmo,
 *  escribiendo los resultados.
 *  
 *  Ejemplo usando ingreso de datos por teclado.
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

	public class EjemploTp1Ej15 {
	private static Scanner input;	
	public static void main(String[] args) {
			//TP1EJ15
			input = new Scanner(System.in);
			
			System.out.println("Ingrese un numero entero");
			int numero = input.nextInt();
			
				boolean estaEnA = (numero >-10 && numero <10);
				boolean estaEnB = (numero % 2 == 0);
				boolean estaEnAmbos = (estaEnA && estaEnB);
				boolean noEstaEnNinguno = !(estaEnA || estaEnB);
				
				System.out.println("El numero " +numero+  "\nestaEnA: " + estaEnA + "\nestaEnB: " 
				+ estaEnB + "\nestaEnAmbos: " + estaEnAmbos + "\nnoEstaEnNinguno: " + noEstaEnNinguno);
			}
}