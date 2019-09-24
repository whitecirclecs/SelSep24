package polymorphism;

public class StateB implements ICentralGovtTaxes {
	
	public void electricityTax() {
		System.out.println("Electricity tax = 10%");
	}
	
	public void fuelTax() {
		System.out.println("Fuel Tax = 5%");
	}
	
	public void roadTax() {
		System.out.println("Road Tax = 7%");
	}

}
