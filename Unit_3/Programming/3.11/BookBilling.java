import java.util.Scanner;

public class BookBilling
{
	public static void
	main(String[] args)
	{
		int quantity;
		double coopin;
		double sprice;
		double qprice;
		double dprice;

		Scanner in = new Scanner(System.in);

		System.out.print("Quantity ordered: ");
		quantity = in.nextInt();
		in.nextLine();
		System.out.print("Coupon value $");
		coopin = in.nextDouble();
		in.nextLine();

		sprice = computeBill();
		qprice = computeBill(quantity);
		dprice = computeBill(quantity, coopin);
	}

	public static double
	computeBill()
	{
		final double taxRate = 0.08;
		final double bookRate = 14.99;

		System.out.println("One book is $"
		    + ((1.0 + taxRate) * bookRate));

		return ((1.0 + taxRate) * bookRate);
	}

	public static double
	computeBill(int qty)
	{
		final double taxRate = 0.08;
		final double bookRate = 14.99;

		System.out.println(qty
		    + " books with no coupon are $"
		    + ((1.0 + taxRate) * bookRate * qty));

		return ((1.0 + taxRate) * bookRate * qty);
	}

	public static double
	computeBill(int qty, double coopin)
	{
		final double taxRate = 0.08;
		final double bookRate = 14.99;

		double cost;
		double tax;

		cost = qty * bookRate;
		cost -= coopin;
		tax = cost * taxRate;
		cost += tax;

		System.out.println(qty
		    + " books with a coupon worth $"
		    + coopin
		    + " are $"
		    + (cost));

		return (cost);
	}
}
