import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		System.out.println("Digite quantos números devem ser somados");
		int N = sc.nextInt();
		int num = 0;
		for(int i = 0; i < N; i++)
		{
			System.out.println("Digite o "+ (i+1) +"° número");
			num =sc.nextInt();
			soma += num;
		}
		System.out.println("A soma total é " + soma);
		sc.close();
	}

}
