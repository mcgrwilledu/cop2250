import java.util.Scanner;

public class JobPricing
{
	public static void
	main(String[] args)
	{
		String job_name;
		double materials_cost;
		double work_hours;
		double travel_hours;
		double job_price;

		Scanner in = new Scanner(System.in);

		System.out.print("Job name: ");
		job_name = in.nextLine();
		System.out.print("Materials cost: ");
		materials_cost = in.nextDouble();
		in.nextLine();
		System.out.print("Hours worked: ");
		work_hours = in.nextDouble();
		in.nextLine();
		System.out.print("Hours travel: ");
		travel_hours = in.nextDouble();
		in.nextLine();

		job_price = computePrice(materials_cost, work_hours, travel_hours);

		System.out.println("The price for "
		    + job_name
		    + " is $"
		    + job_price);
	}

	public static double
	computePrice(double mat, double work, double travel)
	{
		final double workRate = 35.00;
		final double travelRate = 12.00;

		return (mat + (workRate * work) + (travelRate * travel));
	}
}
