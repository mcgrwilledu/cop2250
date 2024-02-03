import java.util.Scanner;

public class BookstoreCredit
{
	public static void
	main(String[] args)
	{
		double gpa;
		String name;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		name = input.nextLine();
		System.out.print("Enter your GPA: ");
		gpa = input.nextDouble();
		input.nextLine();

		computeDiscount(name, gpa);
	}

	public static void
	computeDiscount(String name, double gpa)
	{
		System.out.println("Student: "
		    + name
		    + " GPA: "
		    + gpa
		    + " Discount: "
		    + gpa * 10);
	}
}
