import java.util.Scanner;

public class Dollars
{
	public static void
	main(String[] args)
	{
		final int twentyDenomination = 20;
		final int tenDenomination    = 10;
		final int fiveDenomination   = 5;
		final int oneDenomination    = 1;

		int ntwenties = 0;
		int ntens     = 0;
		int nfives    = 0;
		int nones     = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Dollars value: ");
		int dollar_value = input.nextInt();
		input.nextLine();

		ntwenties = dollar_value / twentyDenomination;
		ntens     = (dollar_value % twentyDenomination) / tenDenomination;
		nfives    = (dollar_value % tenDenomination) / fiveDenomination;
		nones     = (dollar_value % fiveDenomination) / oneDenomination;

		System.out.println("$"
				+ dollar_value
				+ " converted is "
				+ ntwenties 
				+ " $20s, "
				+ ntens 
				+ " $10s, "
				+ nfives 
				+ " $5s, and "
				+ nones 
				+ " $1s");
	}
}
