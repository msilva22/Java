package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Shape #"+i+" data");
			System.out.print("Rectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK/BUE/RED)15");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.println("width: ");
				double width = sc.nextDouble();
				System.out.println("height: ");
				double height = sc.nextDouble();
				Shape shape = new Rectangle(color, width, height);
				list.add(shape);
			}else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				Shape shape = new Circle(color, radius);
				list.add(shape);
			}
			
		}
		System.out.println();
		for(Shape shape : list) {
			System.out.println(String.format("%.2f",shape.area()));
		sc.close();
		
		}
	}

}
