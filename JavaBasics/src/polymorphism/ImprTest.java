package polymorphism;

public class ImprTest {
	
	//AbstractClass obj = new ChildClass();
	
	public static void main(String[] args) {
		ImprovisedCentralTaxes taxC = new ImprStateC();
		
		taxC.electricityTax();
		taxC.fuelTax();
		taxC.roadTax();
	}

}
