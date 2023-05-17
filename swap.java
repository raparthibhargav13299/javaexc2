/*to swap two numbers without using third variable.*/
import java.util.Scanner;
class swap
{
public static void main(String []args)
{
int num1,num2;
Scanner scan = new Scanner(System.in);
System.out.println("Enter first number");
num1= scan.nextInt();
System.out.println("Enter second number");
num2= scan.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("first number is " +num1);
System.out.println("second number is " +num2);
}
}