import java.util.Scanner;

public class InchConversion
{
	public static void
	main(String[] args)
	{
		double num_inches;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number of inches: ");
		num_inches = input.nextDouble();
		input.nextLine();

		convertToFeet(num_inches);
		convertToYards(num_inches);
	}

	public static void
	convertToFeet(double a)
	{
		System.out.println(a
		    + " inches converts to "
		    + a / 12
		    + " feet");
	}

	public static void
	convertToYards(double a)
	{
		System.out.println(a
		    + " inches converts to "
		    + a / (12 * 3)
		    + " yards");
	}
}
