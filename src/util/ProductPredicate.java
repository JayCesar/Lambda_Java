package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{
	// Implmentação da inferface
	// Precitate é uma infercae funcional porque tem apenas um método para ser implementado
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}
	
}
