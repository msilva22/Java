package services;

public class TaxaJurosUS implements ServicoDeJuros{
	private double taxaDeJuros;

	public TaxaJurosUS(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	@Override
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

}
