public class CtoFTester{
	public static void main(String[] args) {
		celsiusToFahrenheit(args[0]);
		fahrenheitToCelsius(args[0]);
	}
	
	public static void celsiusToFahrenheit(String temp) {
		System.out.println( (Integer.parseInt(temp) * 1.8 + 32) + " degrees Fahrenheit.");
	}

	public static void fahrenheitToCelsius(String temp) {
			System.out.println( ( (Integer.parseInt(temp) - 32) * (5.0 / 9) ) + " degrees Celsius.");
	}
}
