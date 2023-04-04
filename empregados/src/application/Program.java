package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Employee #"+(i+1)+":");
			System.out.println("Id:");
			int id = sc.nextInt();
			
			while(hasId(list,id)) {
				System.out.println("Este id já existe: Tente novamente");
				id = sc.nextInt();
			} 
			
			System.out.println("Name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("salary");
			double salary = sc.nextDouble();
			//list.add(new Employee(id, name, salary));
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			
		}
		System.out.println("Digite o funcionario que tera aumento de salario");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if(pos == null) {
			System.out.println("Este funcionario não existe");
		}else {
			System.out.println("Qual a porcentagem");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
