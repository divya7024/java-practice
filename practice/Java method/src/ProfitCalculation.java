import java.util.Scanner;
public class ProfitCalculation {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		profit p=new profit();
		
		System.out.println("Enter the number of dozens of toys purchased ");
		int X = s.nextInt();
		
		System.out.println("Enter the price per dozen ");
		int Y = s.nextInt();
		
		System.out.println("enter the selling price of 1 toy ");
		int Z = s.nextInt();
		
		float pp=p.calculateProfit(X,Y,Z);
		System.out.printf("Sam's Profit percentage is %.2f percent \n", pp);

	}

}
