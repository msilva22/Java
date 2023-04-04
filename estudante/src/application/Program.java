package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student =  new Student();
		System.out.println("Nome do Estudante");
		student.name = sc.nextLine();
		System.out.println("Digite a primeira nota");
		student.grade1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		student.grade2 = sc.nextDouble();
		System.out.println("Digite a terceira nota");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Nota FInal: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltan %.2f pontos%n", student.missingPoints());
		}else {
			System.out.println("Aprovado");
		}
		sc.close();

	}

}
