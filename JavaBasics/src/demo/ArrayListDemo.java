package demo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Paris");
		cities.add("London");
		cities.add("New york");
		cities.add("New Delhi");
		
		for (String t : cities) {
			System.out.println(t);
		}
		
		System.out.println("Total elements in the list = "  + cities.size());
		System.out.println("Index of London = " + cities.indexOf("London"));
		System.out.println("Element at index 1 = " + cities.get(1));
		System.out.println("Is Tokyo present in the list = " + cities.contains("Tokyo"));
		
	}

}
