public class CtoFTester{
	public static void celsiusToFahrenheit(String[] args) {
		System.out.println( (Integer.parseInt(args[0]) * 1.8 + 32) + " degrees Fahrenheit.");
	}
	public static void fahrenheitToCelsius(String[] args) {
		System.out.println( ( (Integer.parseInt(args[0]) - 32) * (5.0 / 9) ) + "degrees Celsius.");
	}
}
