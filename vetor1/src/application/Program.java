package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual o tamanho do vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite o "+(i + 1)+"° valor");
			vect[i] = sc.nextDouble();
			//sc.nextLine();
		}
		double sum = 0.0;
		for(int i = 0;i < n; i++) {
			sum +=vect[i];
		}
		double avg = sum / n;
		System.out.println("AVERAGE HEIGHT: "+ avg);
		sc.close();

	}

}
