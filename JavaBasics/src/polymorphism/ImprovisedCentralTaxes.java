package polymorphism;

public abstract class ImprovisedCentralTaxes {
	
	public abstract void electricityTax();
	
	public abstract void fuelTax();
	
	public void roadTax() {
		System.out.println("Road tax = 10%");
	}

}
