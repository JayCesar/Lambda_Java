package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Referencia pra método
		// Coloco da classe onde o método está, e depois :: para acessar o método (é aceito também em Lambda)
		list.removeIf(Product::staticProductPredicate);
		list.forEach(p -> System.out.println(p));
		
	}
}
