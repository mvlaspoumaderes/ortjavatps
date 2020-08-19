/*Ejercicio 10, TP1
 * Realizá un programa que resuelva el siguiente problema: Nos piden desarrollar un
 * programa que informe si un estacionamiento se encuentra o no abierto según la hora ingresada por el usuario.
 * Nosotros sabemos que el estacionamiento se encuentra abierto entre las 10 y las 18hs.
 * (Crear constante HORA_APERTURA = 10, y HORA_CIERRE = 18).
 * Al iniciar el programa, se le pedirá al usuario que ingrese la hora, y deberemos setear una
 * variable booleana llamada estaAbierto en true o false, según corresponda, e informar por
 * pantalla mediante la misma si el estacionamiento se encuentra abierto o no.
 * Obs: En el caso de que el usuario ingrese una hora menor a 0 o mayor a 24, mostrar el
 * mensaje: “Ha ingresado una hora incorrecta”
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio10 {
	private static Scanner input;
	public static final int HORA_APERTURA = 10; //Constante: es un valor que no cambia.
	public static final int HORA_CIERRE = 18; //Constante.

	public static void main(String[] args) {
		// TP1EJ10
		input = new Scanner(System.in);
		System.out.println("Ingrese la hora: ");
		int horaIng = input.nextInt();
		boolean estaAbierto = true; //seteamos la variable booleana es TRUE
		estaAbierto = (horaIng >= HORA_APERTURA) && (horaIng <= HORA_CIERRE); //Y le indicamos que condición debe cumplir para ser TRUE
		if (horaIng < 0 || horaIng > 24) {
			System.out.println("Ha ingresado una hora incorrecta."); //Descartamos las horas incorrectas
		} else if (estaAbierto) {
			estaAbierto = true; //Si la hora indicada esta dentro de la condición, entonces esta abierto es TRUE.
			System.out.println("El estacionamiento se encuentra abierto: " + estaAbierto);
		} else {
			estaAbierto = false; //Si no esta en la condición, es FALSE.
			System.out.println("El estacionamiento se encuentra abierto: " + estaAbierto);
		}
		input.close();
	}
}
