public class Temperatures
// program which converts temperatures in Celcius to Fahrenheit
// written by Wayne Summers
{
	public static void main(String[] args)
	{
		System.out.println("Temperature conversions");

		computeFahrenheit(30);

		double celcius = 25;
		computeFahrenheit(celcius);

	}
	
	public static void computeFahrenheit(double celciusTemp)
	{
		double fahrenheitTemp;

		fahrenheitTemp = 9 / 5 * celciusTemp + 32;

		System.out.println("Celcius temperature =" + celciusTemp);
		System.out.println("temperature in Fahrenheit =" + fahrenheitTemp);
	}
}