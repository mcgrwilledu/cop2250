import java.util.Scanner;

public class PaintCalculator
{
	public static void
	main(String[] args)
	{
		double h;
		double l;
		double w;
		double price;

		Scanner input = new Scanner(System.in);

		System.out.print("Room length: ");
		l = input.nextDouble();
		input.nextLine();
		System.out.print("Room width: ");
		w = input.nextDouble();
		input.nextLine();
		System.out.print("Room height: ");
		h = input.nextDouble();
		input.nextLine();

		price = computeArea(l, w, h);
		System.out.println("The price to paint the room is $"
		    + price
		    + ".");
	}

	public static double
	computeArea(double l, double w, double h)
	{
		double area;
		double gallons;
		double price;

		final double costPerGallon = 32.00;

		area = 2 * h * (l + w);

		gallons = computeGallons(area);
		System.out.println("You will need "
		    + gallons
		    + " gallons");

		price = gallons * costPerGallon;

		return price;
	}

	public static double
	computeGallons(double area)
	{
		final double areaPerGallon = 350.0;
		double gallons;

		gallons = area / areaPerGallon;

		return gallons;
	}
}
