import java.util.Scanner;

public class ElectionStatistics
{
	public static void
	main(String[] args)
	{
		final double percent = 100.0;

		double firstPartyVotes        = 0;
		double secondPartyVotes       = 0;
		double thirdPartyVotes        = 0;
		double totalVotes             = 0;
		double firstPartyVotePercent  = 0;
		double secondPartyVotePercent = 0;
		double thirdPartyVotePercent  = 0;
		String firstPartyName         = "";
		String secondPartyName        = "";
		String thirdPartyName         = "";

		Scanner input = new Scanner(System.in);

		System.out.print("Enter name for first party: ");
		firstPartyName = input.nextLine();
		System.out.print("Enter number of votes received: ");
		firstPartyVotes = input.nextInt();
		input.nextLine();
		System.out.print("Enter name for second party: ");
		secondPartyName = input.nextLine();
		System.out.print("Enter number of votes received: ");
		secondPartyVotes = input.nextInt();
		input.nextLine();
		System.out.print("Enter name for third party: ");
		thirdPartyName = input.nextLine();
		System.out.print("Enter number of votes received: ");
		thirdPartyVotes = input.nextInt();
		input.nextLine();

		totalVotes = firstPartyVotes + secondPartyVotes + thirdPartyVotes;
		firstPartyVotePercent = (firstPartyVotes * percent) / totalVotes;
		secondPartyVotePercent = (secondPartyVotes * percent) / totalVotes;
		thirdPartyVotePercent = (thirdPartyVotes * percent) / totalVotes;

		System.out.println("The "
				+ firstPartyName
				+ " got "
				+ firstPartyVotePercent
				+ " percent of the vote");
		System.out.println("The "
				+ secondPartyName
				+ " got "
				+ secondPartyVotePercent
				+ " percent of the vote");
		System.out.println("The "
				+ thirdPartyName
				+ " got "
				+ thirdPartyVotePercent
				+ " percent of the vote");
	}
}
