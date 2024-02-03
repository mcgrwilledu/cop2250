import java.util.Scanner;

public class InchesToFeetInteractive
{
	public static void
	main(String[] args)
	{
		final int InchesInFoot = 12;

		int nfeet   = 0;
		int ninches = 0;
		int inches  = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Inches: ");
		inches = input.nextInt();
		input.nextLine();

		nfeet   = inches / InchesInFoot;
		ninches = inches % InchesInFoot;

		System.out.println(inches
				+ " inches converts to "
				+ nfeet
				+ " feet and "
				+ ninches
				+ " inches.");
	}
}
