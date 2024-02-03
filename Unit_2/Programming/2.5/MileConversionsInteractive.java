import java.util.Scanner;

public class MileConversionsInteractive
{
	public static void
	main(String[] args)
	{
		final int INCHES_IN_MILE = 63360;
		final int FEET_IN_MILE   = 5280;
		final int YARDS_IN_MILE  = 1760;

		int miles  = 0;
		int yards  = 0;
		int feet   = 0;
		int inches = 0;

		Scanner userInput = new Scanner(System.in);

		System.out.print("Number of Miles: ");
		miles = userInput.nextInt();
		userInput.nextLine();

		yards  = miles * YARDS_IN_MILE;
		feet   = miles * FEET_IN_MILE;
		inches = miles * INCHES_IN_MILE;

		System.out.println(miles
				+ " miles is equivalent to "
				+ yards
				+ " yards");
		System.out.println(miles
				+ " miles is equivalent to "
				+ feet
				+ " feet");
		System.out.println(miles
				+ " miles is equivalent to "
				+ inches
				+ " inches");
	}
}
