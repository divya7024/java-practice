package packages;

import java.util.Scanner;

public class Division
{  
       public static void main(String arg[])
    {  
              try
              {
                     int a,b,c;
                     Scanner KB=new Scanner(System.in);
                     
                     System.out.println("Enter Two Numbers ");
                     a=KB.nextInt();
       
                     
                     b=KB.nextInt();
       
                     c=a/b;
                     System.out.println("The Quotient of "+a+ "/" +b+ "=" +c);
              }
              catch(ArithmeticException e)
              {
                     System.out.println("DivideByZeroException caught:"+e.getMessage());
              }
              finally {
              System.out.println("Inside finally block");
       }
}}
