package prueba_2;
import java.util.*;
public class base_Rectangulo {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" ¿Cual es la base del rectangulo?");
		int opcion = input.nextInt();
		System.out.println("¿Cual es la altura del rectangulo? ");
		int opcion2 = input.nextInt();
		
			double base = opcion;
			double altura = opcion2;
			double resultado = opcion*opcion2;
			System.out.println ("El area del rectangulo es " + resultado + " metros cuadrados");
		}
	}
