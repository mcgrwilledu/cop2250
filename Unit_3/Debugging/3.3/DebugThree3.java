import java.util.Scanner;

public class DebugThree3
{
	public static void
	main(String args[])
	{
		String name;

		name = getName();

		displayGreeting(name);           
	}

	public static String
	getName()
	{
		String name;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter name: ");
		name = in.nextLine();

		return name;
	}

	public static void
	displayGreeting(String name)
	{
		System.out.println("Hello, "
		    + name
		    + "!");
	}
}
