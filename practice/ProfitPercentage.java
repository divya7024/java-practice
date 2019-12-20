import java.util.*;
class ProfitPercentage
{ 
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter the number of dozens of toys purchased ");
		int X = s.nextInt();		
		System.out.println("Enter the price per dozen ");
		int Y = s.nextInt();		
		System.out.println("enter the selling price of 1 toy ");
		int Z = s.nextInt();
		float cp = Y/12f;
		float p = Z-cp;
		float pPercent = (p/cp)*100;
		System.out.println("Sam's profit percentage is "+pPercent);
	}
}
