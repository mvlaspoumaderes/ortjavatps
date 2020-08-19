/*Ejercicio 12, TP1
 * En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje
 * obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes
 * resultados:
 * • Si los tres dados son seis, mostrar el mensaje “Excelente”
 * • Si dos dados son seis, mostrar el mensaje “Muy bien”
 * • Si un dado es seis, mostrar el mensaje “Regular”
 * • Si ningún dado se obtiene seis, mostrar el mensaje “Insuficiente”
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio12 {
		private static Scanner input;	
	public static void main(String[] args) {
		// TP1EJ12
		input = new Scanner(System.in);
		System.out.println("Ingrese el valor del 1er dado");
		int dadoUno = input.nextInt();
		System.out.println("Ingrese el valor del 2do dado");
		int dadoDos = input.nextInt();
		System.out.println("Ingrese el valor del 3er dado");
		int dadoTres = input.nextInt();
		
		if (dadoUno == 6 && dadoDos == 6 && dadoTres == 6) {
			System.out.println("Excelente");
		} else if (dadoUno == 6 && dadoDos == 6 || dadoUno == 6 && dadoTres ==6 || dadoDos == 6 && dadoTres == 6){
			System.out.println("Muy Bien");
		} else if (dadoUno == 6 || dadoDos == 6 || dadoTres == 6) {
			System.out.println("Regular");
		} else {
			System.out.println("Insuficiente");
		}
		input.close();
	}
}
