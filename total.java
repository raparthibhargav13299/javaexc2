/*java code for to accept student Details like (StudentID StudentName, StudentAge, Marks1,Marks2, Marks3) Calculate Total and Percentage. If percentage is greater than 50 then display PASS else display FAIL*/
import java.util.Scanner;
class total
{
public static void main(String []args)
{
int id,age;
double marks1,marks2,marks3,total,percentage;
String name;
Scanner scan = new Scanner(System.in);
System.out.println("Enter Your student id");
id = scan.nextInt();
System.out.println("Enter Your student name");
name = scan.next();
System.out.println("Enter Your student age");
age = scan.nextInt();
System.out.println("Enter Your student marks1");
marks1 = scan.nextInt();
System.out.println("Enter Your student marks2");
marks2 = scan.nextInt();
System.out.println("Enter Your student marks3");
marks3 = scan.nextInt();


total=marks1+marks2+marks3;
percentage=(total/(300.0))*100;
if(percentage>50)
{
   System.out.println("pass");
}
else
{
System.out.println("fail");
}
}
}