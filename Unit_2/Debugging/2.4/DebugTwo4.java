/* comment to deal with task runner foolishness! */
import java.util.Scanner;

public class DebugTwo4
{
	public static void
	main(String[] args)
	{
		double cost;

		final double TAX = 0.06;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter cost of purchase >> ");
		cost = input.nextDouble();
		input.nextLine();

		System.out.println("Cost is $" + cost);
		System.out.println("With " + (TAX * 100) + "% tax,");
		System.out.println("   the total is $" + (cost + (cost * TAX)));
	}
}
