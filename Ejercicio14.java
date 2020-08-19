/*Ejercicio 14, TP1
 * Construir un programa que simule el funcionamiento de una calculadora que puede
 * realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros.
 * En un principio, el usuario debe especificar la operación que desea realizar (s para la suma,
 * r para la resta, p para el producto y d para la división) y luego, deberá ingresar dos números
 * enteros para así realizar la operación. Informar el resultado por pantalla. 
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio14 {
	private static Scanner input;

	public static void main(String[] args) {
		// TP1E14
		input = new Scanner(System.in);
		System.out.println(
				"Por favor indique la operación ingresando la letra correspondiente \n[s] para suma \n[r] para resta \n[p] para producto \n[d] para division");
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
					"La división entre " + primerNumero + "/" + segundoNumero + " es = " + divisionTotal);
			break;
		default:
			System.out.println("Atencion: ha ingresado un valor erroneo.");
		}
		input.close();
	}
}