package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCarge;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCarge) {
		super(name, hours, valuePerHour);
		this.additionalCarge = additionalCarge;
	}

	public OutsourcedEmployee() {
	}

	public Double getAdditionalCarge() {
		return additionalCarge;
	}

	public void setAdditionalCarge(Double additionalCarge) {
		this.additionalCarge = additionalCarge;
	}
	@Override
	public double payment() {
		return super.payment() + additionalCarge * 1.1;
	}

}
