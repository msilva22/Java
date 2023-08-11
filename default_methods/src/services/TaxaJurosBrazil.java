package services;

public class TaxaJurosBrazil implements ServicoDeJuros {
	private double taxaDeJuros;

	public TaxaJurosBrazil(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	@Override
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

}
