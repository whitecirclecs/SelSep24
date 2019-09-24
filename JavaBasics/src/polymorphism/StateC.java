package polymorphism;

public class StateC implements ICentralGovtTaxes{
	
	public void electricityTax() {
		System.out.println("Electricity tax = 25%");
	}
	
	public void fuelTax() {
		System.out.println("Fuel Tax = 20%");
	}
	
	public void roadTax() {
		System.out.println("Road Tax = 22%");
	}

}
