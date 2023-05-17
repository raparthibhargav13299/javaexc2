/* java codefor accepting radius and calculate the area of the circle.*/
import java.util.Scanner;
class area
{
public static void main(String []args)
{
int radius;
double area;
Scanner obj= new Scanner(System.in);
System.out.println("Enter radius");
radius=obj.nextInt();
area=3.14*radius*radius;
System.out.println(area);
}
}