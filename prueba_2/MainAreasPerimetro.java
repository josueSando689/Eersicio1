package prueba_2;
import java.util.Scanner;

public class MainAreasPerimetro {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		System.out.println("Escribe un primer numero");
		double numero1 = texto.nextDouble();
		System.out.println("Escribe un segundo numero");
		double numero2 = texto.nextDouble();
		System.out.println("Escribe un tercer numero");
		double numero3 = texto.nextDouble();
		System.out.println("Escribe un cuarto numero");
		double numero4 = texto.nextDouble();
	
		
		//LLAMAR A LA CLASE
		Areas rectangulo = new Areas(); 
		Areas triangulo = new Areas(); 
		Perimetro rectangulo1 = new Perimetro ();
		Perimetro triangulo1 = new Perimetro ();
		
			
		//RESULADO
		double Rrectangulo = rectangulo.areaRectangulo (numero1, numero2);
		System.out.println("El area del rectangulo es " + Rrectangulo);
		double Rtriangulo = triangulo.areaTriangulo (numero1, numero2);
		System.out.println("El area del triangulo es " + Rtriangulo);
		double Rrectangulo2 = rectangulo1.perimetroCuadrado (numero1, numero2,numero3,numero4);
		System.out.println("El perimetro del rectangulo es " + Rrectangulo2);
		double Rtriangulo2 = triangulo1.perimetroTriangulo (numero1, numero2,numero3);
		System.out.println("El perimetro del triangulo es " + Rtriangulo2);
	 }
}
