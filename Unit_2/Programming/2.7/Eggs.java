import java.util.Scanner;

public class Eggs
{
	public static void
	main(String[] args)
	{
		final int EggsInDozen = 12;
		final int CostPerDozenInCents = 325;
		final int CostPerSingleInCents = 45;

		int costEggsInCents = 0;
		int neggs           = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Number of Eggs: ");
		neggs = input.nextInt();
		input.nextLine();

		costEggsInCents = (CostPerDozenInCents * (neggs / EggsInDozen)
				+ CostPerSingleInCents * (neggs % EggsInDozen));

		/* closer to expected output, but doesn't work well with 0 pennies output */
		System.out.println("You Ordered "
				+ neggs
				+ " eggs. That's "
				+ neggs / EggsInDozen
				+ " dozen at $"
				+ CostPerDozenInCents / 100.0
				+ " per dozen and "
				+ neggs % EggsInDozen
				+ " loose eggs at "
				+ CostPerSingleInCents
				+ " cents each for a total of $"
				+ costEggsInCents / 100.0
				+ ".");
		/* uses modulus arithmetic to make pretty printing of dollars and cents */
		/*
		System.out.println("You ordered "
				+ neggs
				+ " eggs. That's "
				+ neggs / EggsInDozen
				+ " dozen at $"
				+ CostPerDozenInCents / 100
				+ "."
				+ (CostPerDozenInCents % 100) / 10
				+ CostPerDozenInCents % 10
				+ " per dozen and "
				+ neggs % EggsInDozen
				+ " loose eggs at "
				+ CostPerSingleInCents
				+ " cents each for a total of $"
				+ costEggsInCents / 100
				+ "."
				+ (costEggsInCents % 100) / 10
				+ costEggsInCents % 10
				+ ".");
		 */
		/* uses printf to make pretty printing of dollars and cents */
		/*
		System.out.printf("You ordered %d eggs. "
				+ "That's %d dozen at $%.2f per dozen "
				+ "and %d loose eggs at %d cents each "
				+ "for a total of $%.2f."
				, neggs
				, neggs / EggsInDozen
				, CostPerDozenInCents / 100.0
				, neggs % EggsInDozen
				, CostPerSingleInCents
				, costEggsInCents / 100.0);
		System.out.println();
		 */
	}
}
