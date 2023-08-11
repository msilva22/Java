package services;

import java.security.InvalidParameterException;

public interface ServicoDeJuros {
	
	double getTaxaDeJuros();
	default double pagamento(double quantia, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Quantidades de meses deve ser maior que zero");
		}
		return quantia * Math.pow(1.0 + getTaxaDeJuros() / 100.0, meses);
	}
}
