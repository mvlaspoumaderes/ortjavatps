/*Ejercicio 8, TP1
 * Suponiendo que el primer d�a de la semana es el Domingo, pedir un n�mero entre 1 y 7
 * (inclusive) y mostrar el nombre del d�a correspondiente. Si el d�a no est� en el rango
 * permitido debe emitir por pantalla el mensaje de error "El d�a ingresado no es v�lido".
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
        System.out.println( "Introduzca un n�mero entre 1 y 7, inclusives" );
        int numDia = input.nextInt();
        if (numDia == 1){
    		System.out.printf( "Domingo");
        } else if (numDia == 2){
    		System.out.printf( "Lunes");        	
        } else if (numDia == 3) {
    		System.out.printf( "Martes");
        } else if (numDia == 4){
    		System.out.printf( "Mi�rcoles");
        } else if (numDia == 5){
    		System.out.printf( "Jueves");
        } else if (numDia == 6) {
    		System.out.printf( "Viernes");
        } else if (numDia == 7){
    		System.out.printf( "S�bado");
        } else {
    		System.out.println( "El dia ingresado no es v�lido");
    	} 
         input.close();		
	}

}
