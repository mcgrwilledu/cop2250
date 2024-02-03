import java.util.Scanner;

public class Insurance
{
	public static void
	main(String[] args)
	{
		int current;
		int birth;
		int premium;

		Scanner in = new Scanner(System.in);

		System.out.print("Current year: ");
		current = in.nextInt();
		in.nextLine();
		System.out.print("Birth year: ");
		birth = in.nextInt();
		in.nextLine();

		premium = calculatePremium(current, birth);

		System.out.println("The premium is $"
		    + premium);
	}

	public static int
	calculatePremium(int a, int b)
	{
		return ((a - b) / 10 + 15) * 20;
	}
}
