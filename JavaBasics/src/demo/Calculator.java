package demo;

public class Calculator {	
	
	//Defining the add method
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void subtract(int a, int b) {
		System.out.println(a-b);
	}
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		subtract(20,5);
	}

}
