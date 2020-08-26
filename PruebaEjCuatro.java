package ar.edu.ort.thp.tp2;
import java.util.Scanner;

/**
 * Demostracion de metodos sobrecargados * A. Garcia-Beltran - marzo, 2002
 */
public class PruebaEjCuatro {
	private static Scanner input;
    public static void main (String[] args) {
		input = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int a = input.nextInt();
		System.out.println("Ingrese otro numero entero");
		int b = input.nextInt();
 
        System.out.println("El mayor de a y b es: " + mayor(a,b));
    }
 
    // Definicion de mayor de dos numeros enteros
    public static int mayor (int x, int y) {
        return x>y ? x : y;
    }

}