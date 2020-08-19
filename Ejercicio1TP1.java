/*Ejercicio 1, TP1
 * Realizá un programa donde se cree una variable entera llamada num1, que inicialmente
 * valdrá 0. Luego incrementá su valor en 2 y mostralo por pantalla. Después mostrá el
 * resultado de multiplicarlo por sí mismo.
 */

package ar.edu.ort.thp.tp1; //nombre del paquete, que se mantendrá constante en todo el TP1

public class Ejercicio1 {

	public static void main(String[] args) {
		// TP1EJ1
		int num1 = 0; //iniciamos la variable num1 en 0 (cero).
		num1 = num1 + 2; //sumamos un 2 al valor de num1
		System.out.println(num1); //mostramos en pantalla el valor actual de num1
		num1 = num1 * num1; //multiplicamos num1 por si misma (o sea 2x2)
		System.out.println(num1); //mostramos el nuevo valor de num1
	}

}
