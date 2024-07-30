package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
// Aula 66, agora vamos criar um método dentro desta classe Triangle para usar em Aula64.java
	
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p-a) * (p - b) * (p - c));
		return result;
	}
}



// Explicação. public double - public significa que a função poderá ser utilizada externamente
// double é o tipo de dado, nesse caso, números reais