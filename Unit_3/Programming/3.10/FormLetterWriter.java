import java.util.Scanner;

public class FormLetterWriter
{
	public static void
	main(String[] args)
	{
		String given_name;
		String sur_name;

		Scanner in = new Scanner(System.in);

		System.out.print("First name: ");
		given_name = in.nextLine();
		System.out.print("Last name: ");
		sur_name = in.nextLine();

		displaySalutation(given_name);
		displaySalutation(given_name, sur_name);
	}

	public static void
	displaySalutation(String given)
	{
		System.out.println("Dear "
		    + given
		    + ",");
		System.out.println("\tThank you for your recent order.");
	}

	public static void
	displaySalutation(String given, String sur)
	{
		System.out.println("Dear "
		    + given
		    + " "
		    + sur
		    + ",");
		System.out.println("\tThank you for your recent order.");
	}
}
