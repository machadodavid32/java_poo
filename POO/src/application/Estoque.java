package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um produto em estoque: Em seguida
		 * mostrar os dados do produto, realizar uma entrada de estoque e mostrar novamente os produtos
		 * realizar uma saída de estoque e mostrar novamente os produtos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.println();
		Product product = new Product(name, price);
		
		product.setName("Computer"); //Nome alterado para Computador devido a um método set criado na classe
		System.out.println("Updated name: " + product.getName()); //imprimindo nome atualizado usando o método get
		product.setPrice(1200);
		System.out.println("Updated price: " + product.getPrice());
		
		
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}
