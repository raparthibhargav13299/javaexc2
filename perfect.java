/*java code accepting a number and check whether number is perfect square or not.*/
import java.util.Scanner;
class perfect
{
public static void main(String []args)
{
int num,sum=0;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
num = scan.nextInt();
for(int i = 1; i < num; i++)
{
if(num % i == 0)
     {
        sum = sum + i;
     }
}
if(sum == num)
{
    System.out.println("Given number is Perfect");
}
else
{
    System.out.println("Given number is not Perfect");
}  
}
}