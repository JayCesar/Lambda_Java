package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>(); 
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		// Agora eu criei uma expressão lambda
		// Aqui eu defini uma função anônima (arrow function) - de um lado vem os parâmetros e no lado a implementação da função
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		// Meu com será uma fnção que receberá dois  argumentos p1 e p2 e a implementação é o que estará entre as chaves;
	
		list.sort(comp);

		for (Product p : list) System.out.println(p);
		
	}
}
