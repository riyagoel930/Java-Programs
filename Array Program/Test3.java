class Test3
{
 	public static void main(String[] args)
	{

	int [] a;
	a=new int[3];
	System.out.println("Reference of integer: "+a); //[I@372f7a8d
	
        /*System.out.println(a[0]); //0
	System.out.println(a[1]);
	System.out.println(a[2]);*/

	for(int d:a)
	{
	System.out.println(d);
	}

	a[0]=9;
	a[2]=443;
	

	for(int d:a)
	{
	System.out.println(d);
	}
//-------------------------------------------------------------------------------------
	/*double []b;
	boolean []c;
	a=new int[3];
	b=new int[3];
	c=new int[3];
	System.out.println(a); //[I@372f7a8d

	System.out.println(a[0]); //0
	System.out.println(b[0]);
	System.out.println(c[0]);

	

	String[] a;
	s=new String[3];*/
	//String[]=new String[4];*/

	}


}




//9 arrray---number dt
//declare the array,create object