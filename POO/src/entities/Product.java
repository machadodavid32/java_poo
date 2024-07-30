package entities;

public class Product {
	private String name;  //antes os atributos eram public, agora vamos encapsular mudando para private
	private double price;
	private int quantity;
	
	//Criando um construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//método setName criado para poder ALTERAR o nome do produto. Esse método deve ser chamado no aplicativo
	public void setName(String name) {
		this.name = name;
	}
	
	//método criado para poder ACESSAR o nome do produto
	public String getName() {
		return name; 
	}
	
	//criando método mostrar o preço
	public double getPrice() {
		return price;
	}
	
	//Criando método para alterar o preço.
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Criando método para acessar quantidade>
	public int getQuantity() {
		return quantity;
	}
	
	/* Existe uma forma para criar construtores de forma automática no Eclipse
	 * clique nesta tela com o botão direito em Source, Generator constructor using fields*/
	
	/*E para gerar os get e set, botão direito nesta tela, Source, Generate getters and Setters*/
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		//this.quantity se refere ao acesso ao atributo da classe e não o parametro quantity da função
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price) //para imprimir duas casas decimais
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}

}
