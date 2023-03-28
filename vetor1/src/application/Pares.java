package application;

import java.util.Locale;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int sum = 0;
		
		for(int i= 0; i<vect.length;i++) {
			sc.nextLine();
			System.out.println("Digite o "+(i + 1)+"º número");
			vect[i] = sc.nextInt();
			}
		System.out.println("NUMEROS PARES: ");
		
		for(int i= 0; i<vect.length;i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i]+ " ");
			}
		}
		System.out.println();
		for(int i= 0; i<vect.length;i++) {
			if(vect[i] % 2 == 0) {
				sum++;
			}
		}
		System.out.println("QUANTIDADE DE NUMEROS PARES " + sum);
		
		

	}

}
