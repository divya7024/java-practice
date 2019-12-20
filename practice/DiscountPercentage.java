import java.util.Scanner;
class DiscountPercentage
{
	public static void main(String arg[])
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Price of item 1 : ");
			float a = Float.parseFloat(s.nextLine());
			System.out.println("price of item 2 :");
			float b = Float.parseFloat(s.nextLine());
			System.out.println("Discount in percentage : ");
			int d = Integer.parseInt(s.nextLine());
			float c = a+b;
			float p = c/10;
			float D = c-p;
			System.out.println("Price of item 1 : "+a);
			System.out.println("price of item 2 :"+b);
			System.out.println("Discount in percentage : "+d);
			System.out.println("Total amount : $"+c);
			System.out.println("Discount amount : $"+D);
			System.out.println("Saved amount : $"+p);
		}
}