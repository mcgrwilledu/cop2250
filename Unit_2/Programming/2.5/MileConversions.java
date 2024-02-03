public class MileConversions
{
	public static void
	main(String[] args)
	{
		final int INCHES_IN_MILE = 63360;
		final int FEET_IN_MILE   = 5280;
		final int YARDS_IN_MILE  = 1760;

		int yards  = 0;
		int feet   = 0;
		int inches = 0;

		int miles = 27;

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
