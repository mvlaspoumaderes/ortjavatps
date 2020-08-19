/*Ejercicio 8, TP1
 * Suponiendo que el primer día de la semana es el Domingo, pedir un número entre 1 y 7
 * (inclusive) y mostrar el nombre del día correspondiente. Si el día no está en el rango
 * permitido debe emitir por pantalla el mensaje de error "El día ingresado no es válido".
 * 
 * EJEMPLO USANDO IF/ELSE IF
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio8 {
		private static Scanner input;
	public static void main(String[] args) {
		// TP1EJ8
        input = new Scanner(System.in);
        System.out.println( "Introduzca un número entre 1 y 7, inclusives" );
        int numDia = input.nextInt();
        if (numDia == 1){
    		System.out.printf( "Domingo");
        } else if (numDia == 2){
    		System.out.printf( "Lunes");        	
        } else if (numDia == 3) {
    		System.out.printf( "Martes");
        } else if (numDia == 4){
    		System.out.printf( "Miércoles");
        } else if (numDia == 5){
    		System.out.printf( "Jueves");
        } else if (numDia == 6) {
    		System.out.printf( "Viernes");
        } else if (numDia == 7){
    		System.out.printf( "Sábado");
        } else {
    		System.out.println( "El dia ingresado no es válido");
    	} 
         input.close();		
	}

}
