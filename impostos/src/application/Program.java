package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.println("Enter the number of tax payers");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer # " + i + " data ");
			sc.nextLine();
			System.out.print("Individual or company (i/c) ?");
			char ch = sc.next().charAt(0);
			System.out.print("Name ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual icome ");
			double anualIcome = sc.nextDouble();

			if (ch == 'i') {

				System.out.print("Heath expenditures ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIcome, healthExpenditures));
			} else {

				System.out.print("Number of employees ");
				int numberOfEmployee = sc.nextInt();
				list.add(new Company(name, anualIcome, numberOfEmployee));
			}

		}
		System.out.println();
		System.out.println("TAXES PAID");
		for (TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + " $ " + String.format("%.2f", taxPayer.tax()));
		}
		System.out.println();
		System.out.print("TOTAL TAXES ");
		double sum = 0.0;
		for (TaxPayer taxPayer : list) {
			sum += taxPayer.tax();
		}
		System.out.print(": $ " + String.format("%.2f", sum));
		sc.close();
	}

}
