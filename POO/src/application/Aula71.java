package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

import entities.Calculator;
/*Está aula vai falar sobre membros estáticos. Segue um programa como exemplo
 * Fazer um programa para ler um valor númerico qualquer e daí mostrar o quanto seria o valor
 * de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor do
 * pi com duas casas decimais*/


public class Aula71 {
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, informe o valor do raio: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		
		sc.close();

	}
	

}
