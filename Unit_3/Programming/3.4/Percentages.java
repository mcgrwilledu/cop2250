import java.util.Scanner;

public class Percentages
{
	public static void
	main(String[] args)
	{
		double num_a;
		double num_b;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num_a = input.nextDouble();
		input.nextLine();
		System.out.print("Enter another number: ");
		num_b = input.nextDouble();
		input.nextLine();

		computePercent(num_a, num_b);
		computePercent(num_b, num_a);
	}

	public static void
	computePercent(double a, double b)
	{
		double ab_rate = a / b;
		System.out.println(a
		    + " is "
		    + ab_rate * 100
		    + "% of "
		    + b);
	}
}
