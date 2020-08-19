/*Ejercicio 13, TP1
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
 * • Si trabaja 40 horas o menos se le paga $16 por hora (crear una constante para almacenar el 16)
 * • Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20
 * por cada hora extra. (crear una constante para almacenar el 20)
 * Pedir al usuario que ingrese la cantidad de horas trabajadas en la semana, y mostrar por
 * pantalla el salario correspondiente.
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio13 {
		private static Scanner input;
		private static int SALARIO_40 = 16;
		private static int SALARIO_M40 = 20;
	public static void main(String[] args) {
		//TP1EJ13
		input = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de horas trabajadas en la semana");
		int cantidadHoras = input.nextInt();
		int horasExtra = cantidadHoras - 40;
		
		if (cantidadHoras <= 40) {
			System.out.println("El salario semanal es de: $" + (cantidadHoras * SALARIO_40));
		} else {
			System.out.println("El salario semanal es de: $" + ((cantidadHoras - horasExtra) * SALARIO_40 + horasExtra * SALARIO_M40));
		}
			
		input.close();
	}

}
