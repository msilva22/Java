package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0;i<vect.length;i++ ) {
			System.out.println("Digite o "+(i+1)+"° número");
			vect[i] = sc.nextDouble();	
			}
		double sum =0.0;
		double avg = 0.0;
		System.out.print("Valores: ");
		for(int i = 0;i<vect.length;i++ ) {
			System.out.print(vect[i] + " ");	
			sum += vect[i];
			}
		System.out.println();
		avg = sum / vect.length;
		System.out.printf("Soma = %.2f%n", sum);
		System.out.printf("Média = %.2f%n", avg);
		
	}

}
