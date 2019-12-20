package exception;

import java.util.Scanner;

public class Age {
 
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter your age : ");
  int age = s.nextInt();
  
  try {
   if(age < 18) 
    throw new AgeException("Not valid");
   else
    System.out.println("Welcome to vote");
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
} 