package prueba_2;
import java.util.*;
public class Ejersicio {

	private int numero;
	
	public void incrementarNumero () {
		numero ++;
	}
	
	public static void main(String[] args) {
		
		Ejersicio objeto = new Ejersicio();
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Ingresa un numero");
		objeto.numero = input.nextInt();
		
		
		System.out.println ("El numero ingresado es " + objeto.numero);
		objeto.incrementarNumero();
		System.out.println ("El numero nuevo es " + objeto.numero);
		input.close();
		
	}
}
