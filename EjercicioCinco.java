/*Realizá un programa que lea una serie de números ingresados por el usuario mientras que el
promedio entre todos sea menor a 20. Informar la cantidad de valores leídos.*/

package ar.edu.ort.thp.tp2;
import java.util.Scanner;

public class EjercicioCinco {

	static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int promedio, numeroPedido, contadorValores;

		contadorValores = 0;
		numeroPedido = 0;

		do {
			contadorValores++;
			numeroPedido += pedirNumero();
			promedio = validarPromedio(numeroPedido, contadorValores);
		} while (promedio < 20);

		System.out.println("Se leyeron " + contadorValores + " valores. El promedio superÃ³ 20: " + promedio);

		input.close();

	} /* FIN DEL MAIN */

	/* INICIO SECCION DE FUNCIONES Y PROCEDIMIENTOS */

	static int pedirNumero() {
		int numero;

		System.out.println("Ingrese el siguiente nÃºmero: ");
		numero = input.nextInt();

		return numero;

	} // FIN DE LA FUNCION PARA PEDIR EL SIGUIENTE NUMERO

	static int validarPromedio(int promedio, int contador) {
		
		promedio = promedio / contador;
		 
		return promedio;
		
	}
}