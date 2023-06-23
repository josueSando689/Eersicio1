package prueba_2;

import java.util.Scanner;

public class Interes {
    public static double calcularInteresSimple(double principal, double tasaInteres, double año) {
        double interes = (principal * tasaInteres * año) / 100;
        return interes;
    }

    public static double calcularInteresCompuesto(double principal, double tasaInteres, double año) {
        double interes = principal * Math.pow(1 + (tasaInteres / 100), año) - principal;
        return interes;
    }

    public static void main(String[] args) {
        double principal = 10000;
        double tasaInteres = 8;
        double año = 5;
        
    Scanner texto = new Scanner(System.in);     
    System.out.println("Ingresa el monto");
    principal = texto.nextFloat();
    
    System.out.println("Ingresa el interes");
    tasaInteres = texto.nextFloat();
    
    System.out.println("Ingresa el tiempo");
    año = texto.nextFloat();
    
      
if (tasaInteres > 5) {
	año =10;
	double interesSimple = calcularInteresSimple(principal, tasaInteres, año);
    double interesCompuesto = calcularInteresCompuesto(principal, tasaInteres, año);

    System.out.println("El interés simple es: " + interesSimple);
    System.out.println("El interés compuesto es: " + interesCompuesto);
	
}

        double interesSimple = calcularInteresSimple(principal, tasaInteres, año);
        double interesCompuesto = calcularInteresCompuesto(principal, tasaInteres, año);

        System.out.println("El interés simple es: " + interesSimple);
        System.out.println("El interés compuesto es: " + interesCompuesto);
    }
}