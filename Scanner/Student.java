import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name =sc.next();
	
	System.out.println("Enter your roll: ");
	int roll =sc.nextInt();

	System.out.println("Enter your age: ");
	int age =sc.nextInt();

	System.out.println("Enter your address: ");
	String add = sc.next();

	System.out.println("Enter your gender: ");
	char gender=sc.next().charAt(0);

	System.out.println("Details of the student: ");
	System.out.println("Name of student: " +name);
	System.out.println("Age of student: " +age);
	System.out.println("Address of student: " +add);
	System.out.println("Gender of student: " +gender);
	}
}

