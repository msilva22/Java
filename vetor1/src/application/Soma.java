package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		double[] vect1 = new double[n];
		double[] vect2 = new double[n];
		double[] vect3 = new double[n];
		
		for(int i = 0;i<vect1.length;i++ ) {
			System.out.println("Digite os valores de A "+(i+1)+"° número");
			vect1[i] = sc.nextDouble();	
			}
		
		for(int i = 0;i<vect2.length;i++ ) {
			System.out.println("Digite os valores de A "+(i+1)+"° número");
			vect2[i] = sc.nextDouble();	
			}
		
		for(int i = 0;i<vect3.length;i++ ) {
			vect3[i] = vect1[i] + vect2[i];	
			}
		
		for(int i = 0;i<vect3.length;i++ ) {
			System.out.println(vect3[i]);	
			}
		

	}

}
