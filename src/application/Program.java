package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>(); // A estrutura List possui um método COmaprator, logo não preciso por no produto o comparable
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		// Collections.sort(list); // Só é possível quando o objeto tem o comparable implementado
		
		list.sort(new MyComparator());
		
		for (Product p : list) System.out.println(p);
		
	}
}
