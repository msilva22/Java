package application;

import java.util.Locale;
import java.util.Scanner;

import services.ServicoDeJuros;
import services.TaxaJurosUS;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantia: ");
		double quantia = sc.nextDouble();
		System.out.println("Meses: ");
		int meses = sc.nextInt();
		
		ServicoDeJuros juros = new TaxaJurosUS (1.0);
		double pagamento = juros.pagamento(quantia, meses);
		
		System.out.println("Pagamneto depois " + meses + " meses");
		System.out.println(String.format("%.2f",pagamento));
		
		sc.close();

	}

}
