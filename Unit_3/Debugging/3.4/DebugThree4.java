import java.util.Scanner;

public class DebugThree4
{
	public static void
	main(String[] args)
	{
		final double RATE = 75.84;

		int credits1;
		int credits2;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter credits for first student >> ");
		credits1 = in.nextInt();
		in.nextLine();
		System.out.print("Enter credits for second student >> ");
		credits2 = in.nextInt();
		in.nextLine();

		computeTuitionBill(credits1, RATE, 1);
		computeTuitionBill(credits2, RATE, 2);
	}

	public static void
	computeTuitionBill(int c, double rate, int student)
	{
		System.out.println("Total due for student #"
		    + student
		    + " is $"
		    + (rate * c));
	}
}
