package ar.edu.ort.thp.tp2;
import java.util.Scanner;

public class EjercicioDiez {
	public static Scanner input;
	public static final int CORTE = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);

		/***********************VARIABLES****************************************/
		
		int corredor;
		int hora;
		int minutos;
		int segundos;
		int contador;
		int acumSeg;
		int acumHora;
		int acumMin;
		int ganador;
		int menUnaHora;
		double porcentaje;
		int calcMinSeg;
		int cantSegCorredor;

		
		hora = 0;
		minutos = 0;
		segundos = 0;
		contador = 0;
		acumHora = 0;
		acumSeg = 0;
		acumMin = 0;
		ganador = 0;
		menUnaHora = 0;
		calcMinSeg = 99999;
		cantSegCorredor = 0;
		
		System.out.println("Ingrese el numero del corredor: ");
		corredor = Integer.parseInt(input.nextLine());
		
		while (corredor != CORTE) { 
			
			hora = ingHora(corredor);
			acumHora = acumHora + hora;
			
			if (hora == 0) {
				menUnaHora++;	
			} 
			
			minutos = ingMinutos(corredor);
			acumMin = acumMin + minutos;
			
			segundos = ingSegundos(corredor);
			acumSeg = acumSeg + segundos;
			
			cantSegCorredor = (hora*3600) + (minutos*60) + segundos;
			
			if (calcMinSeg > cantSegCorredor) {
				calcMinSeg = cantSegCorredor;
				ganador = corredor;
			}
			
			contador++;
			
			System.out.println("Ingrese el numero del corredor: ");
			corredor = Integer.parseInt(input.nextLine());
			
		} 
		
		int promedio = devolverSegundos(acumHora, acumMin, acumSeg, contador);
		porcentaje = porcMenHora(menUnaHora, contador);
		
		System.out.println("Los resultados de la carrera de 10km son: \nGanador: " + ganador + "\nEl Promedio en segundos de los corredores fue: " + promedio + "\nEl Porcentaje de corredores que terminaron la carrera en menos de una hora fue: " + porcentaje + "%");
		
	input.close();
		
	}
	
	/***********************FUNCIONES****************************************/
	
	private static int ingSegundos(int corredor) {
		int segundos;
		
		System.out.println("Ingrese la cantidad de segundos: " + corredor);
		segundos = Integer.parseInt(input.nextLine());
		
		while (segundos < 0 || segundos > 59) {
			System.out.println("Los segundos deben estar en el rango de [0] a [59]. \nIngrese la cantidad de segundos: ");
			segundos = Integer.parseInt(input.nextLine());
		}
		
		return segundos;
	}
	
	private static int ingMinutos(int corredor) {
		int minutos;
		
		System.out.println("Ingrese la cantidad de minutos del corredor: " + corredor);
		minutos = Integer.parseInt(input.nextLine());
		
		while (minutos < 0 || minutos > 59) {
			System.out.println("Los minutos deben estar en el rango de [0] a [59]. \nIngrese la cantidad de minutos: ");
			minutos = Integer.parseInt(input.nextLine());
		}
		
		return minutos;
	}
	
	private static int ingHora(int corredor) {
		int hora;
		
		System.out.println("Ingrese la cantidad de horas del corredor: " + corredor);
		hora = Integer.parseInt(input.nextLine());
		
		return hora;
	}
	
	private static double porcMenHora(int menUnaHora, int contador) {
		
		double porcentaje;
		
		porcentaje = (menUnaHora * 100) / contador;
		
		return porcentaje;
	}
	
	private static int devolverSegundos(int acumHora, int acumMin, int acumSeg, int contador) {
		
		int totalSegundos;
		int promedio;
		
		totalSegundos = (acumHora * 3600) + (acumMin * 60) + acumSeg;
		System.out.println(totalSegundos);
		promedio = totalSegundos / contador;
		
		return promedio;
	}

}

