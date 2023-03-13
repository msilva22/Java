package entities;

public class ImportedProduct extends Product {
	
	private Double custumsFee;
	
	public ImportedProduct(String name, Double price, Double custumsFee) {
		super(name, price);
		this.custumsFee = custumsFee;
	}
	
	

	public Double getCustumsFee() {
		return custumsFee;
	}



	public void setCustumsFee(Double custumsFee) {
		this.custumsFee = custumsFee;
	}



	public double totalPrice() {
		return getPrice() + custumsFee;
	}

	@Override
	public String priceTag() {
		return getName() 
				+ " $ "
				+  String.format("%.2f ", totalPrice()) 
				+  "( Customs fee: $ " 
				+ String.format("%.2f", custumsFee) 
				+ ")";
	}
	

}
