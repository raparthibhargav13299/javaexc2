/*for accepting a number and check whether number is perfect square or not.*/
import java.util.Scanner;
class square
{
public static void main(String []args)
{
int num,i,f=0;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
num= scan.nextInt();
for (i=0;i<=num;i++);
{
    if(i*i==num)
    {
        f=1;
    }   

if (f==1)
{
        System.out.println("the number is a perfect square"); 
}
else
{
   System.out.println("the number is not a perfect square"); 
}
}
}
}