/*Ejercicio9, TP1
 * Realizá un programa que resuelva el siguiente problema:
 * Tres personas aportan diferente capital a una sociedad. Se desea saber qué porcentaje del
 * total aportó cada una (indicando nombre y porcentaje) y cuál es el monto del total aportado por las tres.
 * Pedir por pantalla el ingreso del capital aportado por cada una de las personas y luego
 * mostrar lo pedido en el siguiente formato:
 * Nombre: capital aportado: $ … , Porcentaje del capital: %.... , Monto total aportado: $ ….
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio9 {
		private static	Scanner	input;
		public static void main(String[] args) {
			// TP1EJ9
			input = new Scanner (System.in);
			System.out.println("Ingrese su nombre: ");
			String name1 = input.nextLine();
	        System.out.println("Ingrese su aporte al capital: ");
	        int aporteName1 = input.nextInt();
	        input.nextLine();
	        System.out.println("Ingrese su nombre: ");
	        String name2 = input.nextLine();
	        System.out.println("Ingrese su aporte al capital: ");
	        int aporteName2 = input.nextInt();
	        input.nextLine();	        
			System.out.println("Ingrese su nombre: ");
			String name3 = input.nextLine();
	        System.out.println("Ingrese su aporte al capital: ");
	        int aporteName3 = input.nextInt();		
		
	        int totalAportes = aporteName1 + aporteName2 + aporteName3;
	        int porcName1 = (aporteName1 * 100) / totalAportes;
	        int porcName2 = (aporteName2 * 100) / totalAportes;
	        int porcName3 = (aporteName3 * 100) / totalAportes;
	        
	        System.out.println("Total de Capital aportado= " + totalAportes);
	        System.out.println(name1+ " capital aportado= $" + aporteName1 + " Porcentaje del capital: %" + porcName1);
	        System.out.println(name2+ " capital aportado= $" + aporteName2 + " Porcentaje del capital: %" + porcName2);
	        System.out.println(name3+ " capital aportado= $" + aporteName3 + " Porcentaje del capital: %" + porcName3);
	        
	        input.close();

	}

}
