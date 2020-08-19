/*Ejercicio 15, TP1
 *  Existen dos reglas que identifican dos conjuntos de valores:
 *  - El n�mero es de un solo d�gito.
 *  - El n�mero es impar.
 *  A partir de estas reglas, cre� un algoritmo que asigne a las variables booleanas estaEnA,
 *  estaEnB, estaEnAmbos y noEstaEnNinguno el valor verdadero o falso, seg�n corresponda,
 *  para indicar si el valor ingresado pertenece al primer conjunto, al segundo, a ambos o a
 *  ninguno, respectivamente. Defin� un lote de prueba de varios n�meros y prob� el algoritmo,
 *  escribiendo los resultados.
 *  
 *  Ejemplo usando bloque de datos hardcodeado.
 */

package ar.edu.ort.thp.tp1;
import java.io.IOException;

public class Ejercicio15 {

	public static void main(String[] args) throws RuntimeException, IOException {
		//TP1EJ15
		String newLine = System.getProperty("line.separator");
		
		int[] num = {-1, -2, 0, 1, 2, 10, 11, 15, 200, 333, 555, 9999};
		
		for(int cont = 0; cont < num.length; cont++){
			boolean estaEnA = (num[cont] - 10) <= -1;
			boolean estaEnB = (num[cont] % 2 == 0);
			boolean estaEnAmbos = (estaEnA && estaEnB);
			boolean noEstaEnNinguno = !(estaEnA || estaEnB);
			
			System.out.println("El numero " + num[cont] + newLine +  "estaEnA: " + estaEnA + newLine + "estaEnB: " 
			+ estaEnB + newLine + "estaEnAmbos: " + estaEnAmbos + newLine + "noEstaEnNinguno: " + noEstaEnNinguno + newLine + " ");
		}
	}
}