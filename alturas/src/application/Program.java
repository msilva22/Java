package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Altura;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		Altura[] alt = new Altura[n];
		
		for(int i=0;i<alt.length; i++) {
			sc.nextLine();
			System.out.println("Dados da "+(i +1)+"º pessoa");
			System.out.println("nome: ");
			String nome = sc.nextLine();
			System.out.println("idade: ");
			int idade = sc.nextInt();
			System.out.println("altura: ");
			double altura = sc.nextDouble();
			alt[i] = new Altura(nome, idade, altura);
		}
		double sum = 0.0;
		double perc = 0.0;
		for(int i=0;i<alt.length; i++) {
			sum += alt[i].getAltura();
			if(alt[i].getIdade() < 16) {
				perc++;
			}
		}
		double avg = sum / alt.length;
		double percentagem = perc * 100.0 / alt.length;
		System.out.printf("Altura Média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 nos %.2f%%%n",percentagem);
		
		for(int i=0;i<alt.length;i++) {
			if(alt[i].getIdade() < 16) {
				System.out.println(alt[i].getNome());
			}
		}
		
		sc.close();
		
	}
	
}
