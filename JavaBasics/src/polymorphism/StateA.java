package polymorphism;

public class StateA implements ICentralGovtTaxes{
	
	public void electricityTax() {
		System.out.println("Electricity tax = 15%");
	}
	
	public void fuelTax() {
		System.out.println("Fuel Tax = 10%");
	}
	
	public void roadTax() {
		System.out.println("Road Tax = 12%");
	}
	

}
