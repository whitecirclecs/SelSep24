package inheritance;

public class Mechanical extends Management {

	
	int bonus = 10000;
	
	public static void main(String[] args) {
		Mechanical Tim = new Mechanical();
		System.out.println("Total annual compensation of Tim = $ " + (Tim.annualSalary + Tim.bonus));
		Tim.day();
		
	}
	
	
}
