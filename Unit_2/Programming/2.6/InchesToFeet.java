public class InchesToFeet
{
	public static void
	main(String[] args)
	{
		final int InchesInFoot = 12;

		int nfeet   = 0;
		int ninches = 0;
		int inches  = 211;

		nfeet   = inches / InchesInFoot;
		ninches = inches % InchesInFoot;

		System.out.println(inches
				+ " inches converts to "
				+ nfeet
				+ " feet and "
				+ ninches
				+ " inches.");
	}
}
