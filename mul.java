/* java code for accepting a number and display the multiplication table of the given number.*/
import java.util.Scanner;
class mul
{
public static void main(String []args)
{
int num;
Scanner obj= new Scanner(System.in);
System.out.println("Enter a Number");
num=obj.nextInt();
for (int i=1;i<=10;i++)
{
   System.out.println(""+num+" X "+i+" = "+(num*i));
  
}
}
}