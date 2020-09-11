package ar.edu.ort.thp.tp2;
import java.util.Scanner;

public class EjercicioOnce {
	public static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int a, b, resultado;
		
		a = ingNumA();
		b = ingNumB();
		resultado = prodNum(a,b);
		
		System.out.print("El producto entre " + a + "x" + b + " es = " + resultado);
		
		input.close();

	}
	private static int prodNum(int a, int b) {
		int producto;
		producto = 0;
		
		while (b > 0){
			producto = producto + a;
			b = b -1;
		}
	
		return producto;
	}
		
	private static int ingNumB() {
		int b;
		
		System.out.println("Ingrese un numero entero positivo: ");
		b = Integer.parseInt(input.nextLine());
		
		while (b < 0) {
			System.out.println("El numero debe ser entero positivo. \nPor favor ingrese un numero entero positivo: ");
			b = Integer.parseInt(input.nextLine());
		}
		
		return b;

	}
	private static int ingNumA() {
		int a;
		
		System.out.println("Ingrese un numero entero positivo: ");
		a = Integer.parseInt(input.nextLine());
		
		while (a < 0) {
			System.out.println("El numero debe ser entero positivo. \nPor favor ingrese un numero entero positivo: ");
			a = Integer.parseInt(input.nextLine());
		}
		
		return a;
		}
}
