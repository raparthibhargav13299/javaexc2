/* java code for accepting three numbers and display the lowest number out of three numbers.*/
import java.util.Scanner;
class smallest
{
public static void main(String []args)
{
int num1,num2,num3;
Scanner scan = new Scanner(System.in);
System.out.println("Enter first number");
num1= scan.nextInt();
System.out.println("Enter second number");
num2= scan.nextInt();
System.out.println("Enter third number");
num3= scan.nextInt();
if(num1 < num2 && num1 < num3)
	{
		System.out.println( "num1 is the smallest");
	}
else if(num2 < num3 && num2 < num1)
	{
		System.out.println( "num2 is the smallest");
	}
else
	{
		System.out.println( "num3 is the smallest");
	}	
}
}
