package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio12v2 {
	public static Scanner input;
	public static void main(String[] args) {
		// Ejemplo Ejercicio 12 TP1
		
		input = new Scanner(System.in);
		System.out.println("Ingrese un numero entre 1 y 6");
		int dadoUno = Integer.parseInt(input.nextLine());
		
		while (dadoUno < 1 || dadoUno > 6) {
			System.out.println("El numero ingresado es incorrecto. \nIngrese un numero entre 1 y 6");
			dadoUno = Integer.parseInt(input.nextLine());
		}

		System.out.println("Ingrese un numero entre 1 y 6");
		int dadoDos = Integer.parseInt(input.nextLine());
		
		while (dadoDos < 1 || dadoDos > 6) {
			System.out.println("El numero ingresado es incorrecto. \nIngrese un numero entre 1 y 6");
			dadoDos = Integer.parseInt(input.nextLine());
		}
		
		System.out.println("Ingrese un numero entre 1 y 6");
		int dadoTres = Integer.parseInt(input.nextLine());
		
		while (dadoTres < 1 || dadoTres > 6) {
			System.out.println("El numero ingresado es incorrecto. \nIngrese un numero entre 1 y 6");
			dadoTres = Integer.parseInt(input.nextLine());
		}
		
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
