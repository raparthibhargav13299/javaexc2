/*for accepting firstname, middlename and lastname from the user in three different variables and concatenate the first character of firstname with second character of middlename and third character of lastname.*/
import java.util.Scanner;
public class trail
{
public static void main(String []args)
{
Scanner scan = new Scanner(System.in);
char firstname,middlename,lastname;
System.out.println("Enter your first name");
firstname = scan.next().charAt(0);

System.out.println("Enter your middle name");
middlename = scan.next().charAt(1);

System.out.println("Enter your last name");
lastname = scan.next().charAt(2);

System.out.println("Initials:"+firstname+middlename+lastname);
}
}