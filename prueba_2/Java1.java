package prueba_2;
import java.util.*;
public class Java1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Elige una opcion ");
		System.out.println(" 1. para conversion de Farenheit a Celsius ");
		System.out.println(" 2. para conversion de Celcius a Farenheit ");
		
		int opcion = input.nextInt();

		if (opcion ==1) {
			System.out.println ("Ingrese la temperatura de Farenheit");
			double farenheit = input.nextDouble();
			double celcius = (farenheit-32)+5/9;
			System.out.println ("La temperatura en grados celicus es " + celcius);
		}
		
		else if (opcion == 2) {
			System.out.println ("Ingresa la temperatura en Celcius");
			double celcius = input.nextDouble();
			double farenheit = celcius * 9/5 +32;
			System.out.println ("La temperatura en Farenheit es " + celcius);
		}
			
		else {
			System.out.println ("Esa opcion es invalida");
			}
		input.close(); 
		}
}

		
