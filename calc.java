/* java code  for implementing the concept of menu driven calculator which will accept two numbers and perform the calculation based upon users choice like (+,-,*,/).*/
import java.util.Scanner;

class calc 
{

public static void main(String[] args) 
{
double first,second,result;
Scanner scan = new Scanner(System.in);
System.out.println("Enter first number: ");
first = scan.nextDouble();
System.out.println("Enter second number: ");
second = scan.nextDouble();
System.out.print("Enter an operator (+, -, *, /): ");
char operator = scan.next().charAt(0);
switch (operator) {
      case '+':
        result = first + second;
        break;

      case '-':
        result = first - second;
        break;

      case '*':
        result = first * second;
        break;

      case '/':
        result = first / second;
        break;

      default:
        System.out.printf("Error! operator is not correct");
        return;
    }

    System.out.println(first +  "" + operator + ""  + second + " = " + result);
  }
}