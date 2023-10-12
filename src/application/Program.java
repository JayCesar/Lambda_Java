package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// FUNCTION: Implementação a Interface (usando Stream)
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		// A função map aplica uma função pra cada elemento da stream, gerando uma nova stream com os elementos transformados
		// O map alica a função que tiver dentro dela pra cada elemento da lista
		names.forEach(System.out::println);
	}
}
