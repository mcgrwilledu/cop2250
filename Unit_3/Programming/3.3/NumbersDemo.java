import java.util.Scanner;

public class NumbersDemo
{
	public static void
	main(String[] args)
	{
		int num_a;
		int num_b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer number: ");
		num_a = input.nextInt();
		input.nextLine();
		System.out.print("Enter another integer number: ");
		num_b = input.nextInt();
		input.nextLine();
		
		displayTwiceTheNumber(num_a);
		displayTwiceTheNumber(num_b);
		displayNumberPlusFive(num_a);
		displayNumberPlusFive(num_b);
		displayNumberSquared(num_a);
		displayNumberSquared(num_b);
	}
	
	public static void
	displayTwiceTheNumber(int a)
	{
		System.out.println((a + a));
	}
	
	public static void
	displayNumberPlusFive(int a)
	{
		System.out.println((a + 5));
	}
	
	public static void
	displayNumberSquared(int a)
	{
		System.out.println((a * a));
	}
}
