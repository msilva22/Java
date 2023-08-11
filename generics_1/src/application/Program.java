package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService();
		
		System.out.println("Quantos valores");
		int n = sc.nextInt();
		
		for(int i=0; i< n;i++) {
			Integer valor = sc.nextInt();
			ps.addValue(valor);
		}
		ps.print();
		System.out.println("Primeiro: " + ps.first());
		
		sc.close();

	}

}
