/*Ejercicio 6, TP1
 * Realiz� un programa que solicite al usuario el ingreso por teclado un valor entero mayor
 * que 0 en una variable llamada num1 y muestre un mensaje por pantalla indicando "el
 * n�mero es par" o "el n�mero es impar". Deber� utilizar el operador �m�dulo� es el caracter %
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio6 {
		private static	Scanner	input;	
	public static void main(String[] args) {
		// TP1EJ6
        input = new Scanner(System.in);

        System.out.printf( "Introduzca un n�mero entero mayor a 0(cero)" );
        int num1 = input.nextInt();

        //La forma de saber si un numero es par o impar, es dividirlo por 2, si el resto es 0(cero) es PAR, sino IMPAR.
        if ( num1 % 2 == 0 )  //Para ello, representamos ese resto con el modulo o % y en este caso, usamos el 2 para validarlo. 
        {
            System.out.println( "El numero es PAR" );
        }
        else
        {
            System.out.println( "El numero es IMPAR" );
        }
        input.close();
    }
}