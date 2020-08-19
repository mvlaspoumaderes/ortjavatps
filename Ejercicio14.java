/*Ejercicio 14, TP1
 * Construir un programa que simule el funcionamiento de una calculadora que puede
 * realizar las cuatro operaciones aritm�ticas b�sicas (suma, resta, producto y divisi�n) con valores num�ricos enteros.
 * En un principio, el usuario debe especificar la operaci�n que desea realizar (s para la suma,
 * r para la resta, p para el producto y d para la divisi�n) y luego, deber� ingresar dos n�meros
 * enteros para as� realizar la operaci�n. Informar el resultado por pantalla. 
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio14 {
	private static Scanner input;

	public static void main(String[] args) {
		// TP1E14
		input = new Scanner(System.in);
		System.out.println(
				"Por favor indique la operaci�n ingresando la letra correspondiente \n[s] para suma \n[r] para resta \n[p] para producto \n[d] para division");
		char operacion = input.next().charAt(0);
		System.out.println("Ingrese un numero entero.");
		int primerNumero = input.nextInt();
		System.out.println("Ingrese otro numero entero.");
		int segundoNumero = input.nextInt();

		switch (operacion) {

		case 's': // Suma

			int sumaTotal = primerNumero + segundoNumero;
			System.out.println("La suma entre " + primerNumero + "+" + segundoNumero + " es =: " + sumaTotal);
			break;

		case 'r': // Resta

			int restaTotal = primerNumero - segundoNumero;
			System.out.println("La resta entre " + primerNumero + "-" + segundoNumero + " es =: " + restaTotal);
			break;

		case 'p': // Producto

			int productoTotal = primerNumero * segundoNumero;
			System.out.println("La multiplicacion entre " + primerNumero + "*" + segundoNumero + " es =: "
					+ productoTotal);
			break;

		case 'd': // Division

			int divisionTotal = primerNumero / segundoNumero;
			System.out.println(
					"La divisi�n entre " + primerNumero + "/" + segundoNumero + " es = " + divisionTotal);
			break;
		default:
			System.out.println("Atencion: ha ingresado un valor erroneo.");
		}
		input.close();
	}
}