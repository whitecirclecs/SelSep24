package inheritance;

public class HR extends Management{
	
	
	int bonus = 12000;
	
	public static void main(String[] args) {
		HR John = new HR();
		System.out.println("Total annual compensation of John = $" + (John.annualSalary + John.bonus));
	}

}
