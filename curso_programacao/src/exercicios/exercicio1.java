package exercicios;

import java.util.Locale;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.println(product1 + ", which price is $ " + price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %s%n%n",
				age, code, gender);
		System.out.println("Measue with eight decimal pleaces: " + measure);
		System.out.printf("Roudedf (three decimal places): %.3f%n", measure );
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		
		
		
		
		
	}

}
