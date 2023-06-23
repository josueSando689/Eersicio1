package prueba_2;
import java.util.*;
// Atributos
public class Coches {
	String marca;
	String color;
	int año;
	float precio;
	
	// metodos 
	public static void main (String [] args) {
		Coches coche1 = new Coches();
		
		coche1.marca = "Lamboghni";
		coche1.color = "Amarillo";
		coche1.año = 2002;
		coche1.precio = 189000;
		
		System.out.println ("La marca del primero coche es " + coche1.marca);
	} 

}
