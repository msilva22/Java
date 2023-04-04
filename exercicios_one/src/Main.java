import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um valor ");
		num = sc.nextInt();
		int soma = num;
		
		while(num != 0) {
			System.out.println("Digite um valor ");
			num = sc.nextInt();
			soma += num;
			
		}

		sc.close();
		System.out.println("A soma total foi " + soma);

	}

}
