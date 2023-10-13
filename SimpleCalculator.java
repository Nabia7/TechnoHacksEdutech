// Author = Nabia

import java.util.Scanner;

public class SimpleCalculator {
     public static void main(String[] args)
  {
    Scanner s1 = new Scanner(System.in);
    System.out.println("1.Addition ");
    System.out.println("2.Subtraction ");
    System.out.println("3.Multiplication ");
    System.out.println("4.Division ");
    System.out.println("5.Remainder ");
    System.out.println("--------------------------- ");
    System.out.println("Enter First Number  : ");
    double num1 = s1.nextDouble();
    System.out.println("Enter Second Number : ");
    double num2 = s1.nextDouble();
    
    System.out.println("Enter your choice to Perform Operation (1-5) : ");
    int choice = s1.nextInt();
    switch(choice)
    {
      case 1:
      System.out.println("Sum of "+num1+" + "+num2+" = "+(num1+num2));
      break;
      case 2:
      System.out.println("Sub of "+num1+" - "+num2+" = "+(num1-num2));
      break;
      case 3:
      System.out.println("Mul of "+num1+" * "+num2+" = "+(num1*num2));
      break;
      case 4:
      System.out.println("Div of "+num1+" / "+num2+" = "+(num1/num2));
      break;
      case 5:
      System.out.println("Rem of "+num1+" % "+num2+" = "+(num1%num2));
      break;
      default:
      System.out.println("Invalid Choice !!");
      
    }
    s1.close();
  }
}
