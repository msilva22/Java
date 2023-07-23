package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.forEach(new PriceUpdate());1°versão
		//list.forEach(Product::staticPriceUpdate);2°versão
		//list.forEach(Product::nonstaticPriceUpdate);3ºversão
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);4ºversão
		//list.forEach(cons);
		list.forEach( p -> p.setPrice(p.getPrice() * 1.1));
		list.forEach(System.out::println);

	}

}
