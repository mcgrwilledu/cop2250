import java.util.Scanner;

public class ChiliToGoProfit {
	public static void
	main(String[] args)
	{
		final int priceForAdultInCents = 700;
		final int priceForChildInCents = 400;
		final int costForAdultInCents  = 435;
		final int costForChildInCents  = 310;
		final double centsToDollar     = 100;

		int nchild = 0;
		int nadult = 0;
		int subtotalAdult = 0;
		int subtotalChild = 0;
		int subtotalAll   = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Number of adult meals: ");
		nadult = input.nextInt();
		input.nextLine();
		System.out.print("Number of child meals: ");
		nchild = input.nextInt();
		input.nextLine();

		subtotalAdult = (priceForAdultInCents - costForAdultInCents) * nadult;
		subtotalChild = (priceForChildInCents - costForChildInCents) * nchild;
		subtotalAll   = subtotalAdult + subtotalChild;

		/* closer to expected output, doesn't print 0 pennies output well... */
		System.out.println(nadult
				+ " meals were ordered at $"
				+ priceForAdultInCents / centsToDollar
				+ " each.");
		System.out.println("\tTotal profit is $"
				+ subtotalAdult / centsToDollar);
		System.out.println(nchild
				+ " meals were ordered at $"
				+ priceForChildInCents / centsToDollar
				+ " each.");
		System.out.println("\tTotal profit is $"
				+ subtotalChild / centsToDollar);
		System.out.println("Grand Total profit for all meals is $"
				+ subtotalAll / centsToDollar);

		/* uses modulus arithmetic to pretty print dollars and cents */
		/* also works for cengage
		System.out.println(nadult
				+ " meals were ordered at $"
				+ priceForAdultInCents / 100
				+ "."
				+ (priceForAdultInCents % 100) / 10
				+ priceForAdultInCents % 10
				+ " each.");
		System.out.println("\tTotal profit is $"
				+ subtotalAdult / 100
				+ "."
				+ (subtotalAdult % 100) / 10
				+ subtotalAdult % 10);
		System.out.println(nchild
				+ " meals were ordered at $"
				+ priceForChildInCents / 100
				+ "."
				+ (priceForChildInCents % 100) / 10
				+ priceForChildInCents % 10
				+ " each.");
		System.out.println("\tTotal profit is $"
				+ subtotalChild / 100
				+ "."
				+ (subtotalChild % 100) / 10
				+ subtotalChild % 10);
		System.out.println("Grand Total profit for all meals is $"
				+ subtotalAll / 100
				+ "."
				+ (subtotalAll  % 100) / 10
				+ subtotalAll % 10);
		 */
	}
}
