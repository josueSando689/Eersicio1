package prueba_2;
import java.util.*;
public class area_Circulo {

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.println(" ¿Cual es el radio del circulo?");
			double opcion = input.nextInt();
			
				double radio = opcion;
				double resultado = (3.1416 * opcion * 2);
				System.out.println ("El area del circulo es " + resultado + " metros cuadrados");
			}

}
