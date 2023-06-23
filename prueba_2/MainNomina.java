package prueba_2;

import java.util.Scanner;


public class MainNomina {
	
	double horasExtra = 25.96;
	
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		
		System.out.println("¿Cual es tu nombre?");
		String nombre = texto.nextLine();
		System.out.println("¿Cual es tu puesto?");
		String puesto = texto.nextLine();
		
		System.out.println("¿cuantas horas trabasjaste?"); 
		int horasTrabjadas = texto.nextInt();
		double horasTrabajo = 72.87;
		System.out.println("¿cuantas horas extras trabasjaste?");
		int horasExtras = texto.nextInt();
		double horasExtra = 25.96;
		
		MetodosNomina pagonormal2= new MetodosNomina(); 
		MetodosNomina pagoextra3 = new MetodosNomina(); 
		
		double PagoNormal = pagonormal2.pagonormal (horasTrabjadas, horasTrabajo);
		double PagoMas = pagoextra3.pagoextra (horasExtras, horasExtra);
		double Bruto = PagoNormal+PagoMas;
		System.out.println("El sueldo bruto es " + Bruto);
		
		if (Bruto < 2000) {
			double Total = Bruto + .16;
			System.out.println("El sueldo TOTAL es " + Total);}  
		
			else if (Bruto > 2000) {
				Double Total2 = Bruto + .18;
			System.out.println("El sueldo TOTAL es " + Total2);
			}
		}
}
	
