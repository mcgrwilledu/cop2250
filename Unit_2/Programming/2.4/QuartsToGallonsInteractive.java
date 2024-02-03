import java.util.Scanner;

public class QuartsToGallonsInteractive
{
	public static void
	main(String[] args)
	{
		final int QUARTS_IN_GALLONS = 4;

		int quartsNeeded = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Number of quarts: ");
		quartsNeeded = input.nextInt();
		input.nextLine();

		System.out.println("A job that requires "
				+ quartsNeeded
				+ " quarts requires "
				+ quartsNeeded / QUARTS_IN_GALLONS
				+ " gallons plus "
				+ quartsNeeded % QUARTS_IN_GALLONS
				+ " quarts");
	}
}
