package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		//Class obj = new Class()
		//Interface obj = new ImplementingClass()
		
		ICentralGovtTaxes taxC = new StateC();
		ICentralGovtTaxes taxB = new StateB();
		ICentralGovtTaxes taxA = new StateA();
		
		//WebDriver driver = new ChromeDriver();
		
		taxC.electricityTax();
		taxC.fuelTax();
		taxC.roadTax();
	}

}
