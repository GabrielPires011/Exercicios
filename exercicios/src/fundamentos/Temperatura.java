package fundamentos;

public class Temperatura { 
	public static void main(String[] args) {
		final double X = 32;
		final double Y = 5.0 / 9.0;
		double CELSIUS = 0;
		double FAHRENHEIT = 86;
		
		CELSIUS =(FAHRENHEIT - X) * Y ; 
		
        System.out.println("O resultado é " + CELSIUS + "°C.");
        
		
	}
}
