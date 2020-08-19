/*Ejercicio 11, TP1
 *  Realizá un programa que resuelva el siguiente problema:
 *  Deberás solicitar el ingreso de una fecha de compra (String en el siguiente formato:
 *  YYYYMMDD), un nombre de comprador, un nombre de producto y una cantidad y precio del
 *  producto comprado. Mostrá a modo de ticket, la información ingresada y el monto a pagar.
 *  Modelo de Ticket:
 *  Fecha de Compra: YYYYMMDD
 *  Nombre del Comprador: xxxxx xxxxx
 *  Producto solicitado: xxxxx
 *  Cantidad solicitada: xx
 *  Precio Unitario: $xxx
 *  Total a Pagar: $xxxxx
 */

package ar.edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio11 {
	private static Scanner input;	
	public static void main(String[] args) {
		// TP1EJ11
		input = new Scanner(System.in);
		System.out.println("Ingrese la fecha de compra en el siguiente formato YYYYMMDD");
		String fechaCompra = input.nextLine();
		System.out.println("Ingrese el nombre del comprador");
		String nombreCompra = input.nextLine();
		System.out.println("Ingrese nombre del producto comprado");
		String productoCompra = input.nextLine();
		System.out.println("Ingrese la cantidad de productos comprados");
		int cantidadCompra = input.nextInt();
		System.out.println("Ingrese el precio unitario");
		int unitarioCompra = input.nextInt();
		
		System.out.println(	"Fecha de Compra: " + fechaCompra + "\nNombre del Comprador: " + nombreCompra + "\nProducto solicitado: " + productoCompra + "\nCantidad solicitada: " + cantidadCompra + "\nPrecio Unitario: $" + unitarioCompra + "\nTotal a Pagar: $" + (unitarioCompra * cantidadCompra));
		//usamos \n para realizar un salto de linea en los datos que mostramos por pantalla
		input.close();
	}
}
