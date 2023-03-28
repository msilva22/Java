package application;

import java.util.Locale;
import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros vai digitar");
		int n = sc.nextInt();
		
		
		double[] vect = new double[n];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			System.out.println("Digite o "+(i + 1)+"º número");
			vect[i] = sc.nextDouble();
		}
		double maior = vect[0];
		int indice = 0;
		for(int i= 0; i<vect.length;i++) {
			if(vect[i] > maior ) {
				maior = vect[i];
				indice = i;	
			}
				
			}
		System.out.printf("Maior Valor %.1f%n", maior);
		System.out.println("Posição do maior valor = " + indice);

	}

}
