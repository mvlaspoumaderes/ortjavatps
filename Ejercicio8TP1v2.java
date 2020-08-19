/*Ejercicio 8, TP1
 * Suponiendo que el primer día de la semana es el Domingo, pedir un número entre 1 y 7
 * (inclusive) y mostrar el nombre del día correspondiente. Si el día no está en el rango
 * permitido debe emitir por pantalla el mensaje de error "El día ingresado no es válido".
 * 
 * EJEMPLO USANDO SWITCH
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio8v2 {
		private static Scanner input;
	public static void main(String[] args) {
		// TP1EJ8
        input = new Scanner(System.in);
        System.out.println( "Introduzca un número entre 1 y 7, inclusives" );
        int numDia = input.nextInt();

		switch (numDia) {
		  case 1:
		    System.out.println("Domingo");
		    break;
		  case 2:
		    System.out.println("Lunes");
		    break;
		  case 3:
		    System.out.println("Martes");
		    break;
		  case 4:
		    System.out.println("Miércoles");
		    break;
		  case 5:
		    System.out.println("Jueves");
		    break;
		  case 6:
		    System.out.println("Viernes");
		    break;
		  case 7:
		    System.out.println("Sábado");
		    break;
		    default:
		    System.out.println("El dia ingresado no es válido");		    
		    }
        
        input.close();		
	}

}
