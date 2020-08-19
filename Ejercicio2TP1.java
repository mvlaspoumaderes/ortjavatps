/*Ejercicio 2, TP1
 * Realizá un programa que, siendo num1 y num2 variables enteras con valores 4 y 5,
 * respectivamente, realice la operación correspondiente y muestre el resultado en pantalla:
 * a. Suma
 * b. Producto 
*/

package ar.edu.ort.thp.tp1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TP1EJ2
		//definimos primero nuestras variables
		int num1;
		int num2;
		int suma;
		int producto;
		
		//asignamos valor a las variables definidas arriba
		num1 = 4; //valor indicado en el enunciado
		num2 = 5; //valor indicado en el enunciado
		suma = num1 + num2; //asignamos a la variable suma el resultado de num1 + num2
		System.out.println(suma); //mostramos por pantalla el valor de suma
		
		producto = num1 * num2; //asignamos a la variable producto el resultado de multiplicar num1*num2
		System.out.println(producto); //mostramos por pantalla el valor de producto
	}

}
