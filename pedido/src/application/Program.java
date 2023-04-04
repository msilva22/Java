package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data");
		System.out.println("Name");
		String name = sc.nextLine();
		System.out.println("Email");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY)");
		Date barthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, barthDate);
		
		System.out.println("Enter order data");
		System.out.println("Status");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(),status,client);
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter #" + i + " item data");
			System.out.println("Prodduct name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product Price");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		
		sc.close();

	}

}
