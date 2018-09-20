public class CtoFTester{
	public static void main(String[] args) {
		System.out.println( (Integer.parseInt(args[0]) * 1.8 + 32) + " degrees Fahrenheit.");
		System.out.println( ( (Integer.parseInt(args[0]) - 32) * (5.0 / 9) ) + " degrees Celsius.");
	}
}
