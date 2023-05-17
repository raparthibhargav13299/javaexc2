/* java code for displaying the list of prime numbers in given range.*/
import java.util.Scanner;
class prime
{
public static void main(String []args)
{
int num1, num2,i,j;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a minimum no");
num1 = scan.nextInt();
System.out.println("Enter a maximum no");
num2= scan.nextInt();
System.out.println("Prime numbers between "+num1+" and "+num2+" are : ");
int count;
for(i=num1;i<=num2;i++)
 {
   count=0;
   for(j=1;j<=i;j++)
   {
      if(i%j==0)
        count++;
    }

if(count==2)
  System.out.println(i);
 }
}
}