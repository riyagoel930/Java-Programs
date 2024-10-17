import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Byte Number: ");
	byte a=sc.nextByte();

	System.out.println("Short Number: " );
	short b=sc.nextShort();

	System.out.println("Integer Number: ");
	int c=sc.nextInt();

	System.out.println("Long Number: ");
	long  d =sc.nextLong();

	System.out.println("Float Number: ");
	float e= sc.nextFloat();

	System.out.println("Double Number: ");
	double f = sc.nextDouble();

	System.out.println("char : ");
	char g = sc.next().charAt(0);

	System.out.println("Boolean: ");
	boolean i =sc.nextBoolean();

	System.out.println("String sing word: " );
	String j=sc.next();

	System.out.println("String multi word: ");
	String k=sc.nextLine();

	System.out.println("Byte Number: " + a);
	System.out.println("Short Number: " + b);
	System.out.println("Integer Number: " + c);
	System.out.println("Long Number: " + d);
	System.out.println("Float Number: " + e);
	System.out.println("Double Number: " + f);
	System.out.println("char : " + g);
	System.out.println("Boolean: " + i);
	System.out.println("String sing word: " + j);
	System.out.println("String multi word: " + k);
	}
}