/*. Realizar un programa en el cual se pida al usuario el ingreso de dos números enteros num1 y num2,
cuya relación de valores es que el primero es menor o igual al segundo y mostrar por pantalla la
secuencia de números que existe entre ambos:
a) Incluyéndolos;
b) Excluyéndolos.
Obs: Validar que el primer número sea menor o igual al segundo. Pedir el ingreso de ambos números
las veces que sea necesario hasta que se cumpla dicha condición.
¿Qué pasaría si esta validación no la realizáramos y el ingreso es incorrecto? */


package ar.edu.ort.thp.tp2;
import java.util.Scanner;

public class EjercicioCuatro {
	private static Scanner input; 
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int a,b;
        do {
    		System.out.println("Ingrese un numero entero");
    		a = input.nextInt();
    		System.out.println("Ingrese otro numero entero, que sea igual o mayor al anterior");
    		b = input.nextInt();
        } while (a >= b);
	    	System.out.println("La secuencia entre ["+a+"] ["+b+"] INCLUYENDOLOS es: ");
    		int secuencia;
    	    for (secuencia = a; secuencia <= b; secuencia++) {
    	        System.out.println(secuencia);
    	    }
	    	System.out.println("La secuencia entre ["+a+"] ["+b+"] EXCLUYENDOLOS es: ");
    	    for (secuencia = a+1; secuencia < b; secuencia++) {
    	        System.out.println(secuencia);
    	    }
    	input.close();
	}

}
