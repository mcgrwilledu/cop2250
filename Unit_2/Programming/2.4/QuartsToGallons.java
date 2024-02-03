public class QuartsToGallons
{
	public static void
	main(String[] args)
	{
		final int QUARTS_IN_GALLONS = 4;

		int quartsNeeded = 18;
		
		System.out.println("A job that requires "
				+ quartsNeeded
				+ " quarts requires "
				+ quartsNeeded / QUARTS_IN_GALLONS
				+ " gallons plus "
				+ quartsNeeded % QUARTS_IN_GALLONS
				+ " quarts");
	}
}
