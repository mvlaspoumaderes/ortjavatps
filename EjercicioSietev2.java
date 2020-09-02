/*El ingreso a un sitio web se valida por nombre de usuario y contrase�a. Realizar un programa que
* impida que el usuario ingrese hasta poner los datos correctos. Si intenta m�s de 3 veces err�neamente,
* se debe mostrar el mensaje �Se ha bloqueado su cuenta�, de lo contrario, mostrar �Ha ingresado
* correctamente�.*/

package ar.edu.ort.thp.tp2;

import java.util.Scanner;

public class EjercicioSietev2 {
	public static final String USER = "pepa";
	public static final String PASSWORD = "MiPerro21";
	public static Scanner input;

	public static void main(String[] args) {
		// EJ7TP2
		input = new Scanner(System.in);
		
		String user, password;
		int contador;
		
		for (contador = 1; contador <= 3; contador++){
			System.out.println("Ingrese su usuario: ");
			user = input.nextLine();
			System.out.println("Ingrese su contrase�a: ");
			password = input.nextLine();
			if (!USER.equals(user) || !PASSWORD.equals(password)) {
				System.out.println("Los datos ingresados son incorrectos. Este fue el intento " + contador + ". Quedan "
						+ (3 - contador) + " intentos. \nIngrese los datos nuevamente.");
			} else {
				contador = 4;
			}
		}
		
		if (contador == 4) {
			System.out.println("\nSe ha bloqueado su cuenta.");
		} else {
			System.out.println("\nHa ingresado correctamente.");
		}

		input.close();

	}

}
