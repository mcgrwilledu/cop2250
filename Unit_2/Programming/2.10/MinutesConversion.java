import java.util.Scanner;

public class MinutesConversion
{
	public static void
	main(String[] args)
	{
		final double HoursInDay = 24.0;
		final double MinutesInHour = 60.0;

		int minutes  = 0;
		double hours = 0;
		double days  = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("number of minutes: ");
		minutes = input.nextInt();
		input.nextLine();

		hours = minutes / MinutesInHour;
		days = minutes / (MinutesInHour * HoursInDay);

		System.out.println(minutes
				+ " minutes equals "
				+ hours
				+ " hours or "
				+ days
				+ " days");
	}
}
