/*java code  for accepting a five digit number and check whether the number is palindrome or not.*/
import java.util.Scanner;
class palindrome
{
public static void main(String []args)
{
int rev=0,rem;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
int num = scan.nextInt();
int temp=num;
while(temp!=0) 
{
   rem=temp%10;
   rev=rev*10+rem;
   temp=temp/10;
}
if(rev==num)
{
  System.out.println("Given no is palindrome");
}
else
{
  System.out.println("Given no is not palindrome");
}
}
}