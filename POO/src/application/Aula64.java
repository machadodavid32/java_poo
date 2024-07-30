package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

import entities.Triangle;

/*
O código abaixo foi refatorado para utilização de uma classe que criei, a classe
Triangle.
*/


public class Aula64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
	    double areaX = x.area();  // chamada do método criado em Trangle.java
	    
	   
	    double areaY = y.area();
		
	    // Math.sqrt calcula raiz quadrada
	    
	    System.out.printf("Area do triangulo x: %.4f%n", areaX);
	    System.out.printf("Area do triangulo y: %.4f%n", areaY);
	    
	    if (areaX > areaY) {
	    	System.out.println("A Mario area é x");
	    }
	    else {
	    	System.out.println("A Maior area é y");
	    }
	    
		sc.close();

	}

}
