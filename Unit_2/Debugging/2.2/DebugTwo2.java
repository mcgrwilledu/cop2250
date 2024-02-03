/* comment to deal with task runner foolishness! */
import java.util.Scanner;

public class DebugTwo2
{
	public static void main(String args[])
	{
		int a;
		int b;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer >> ");
		a = input.nextInt();
		input.nextLine();
		System.out.print("Enter another integer >> ");
		b = input.nextInt();
		input.nextLine();

		System.out.println("The sum is " + (a + b));
		System.out.println("The difference is " + (a - b));
		System.out.println("The product is " + (a * b));
	}
}
