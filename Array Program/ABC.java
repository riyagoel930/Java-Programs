class ABC
{
 	public static void main(String[] args)
	{
	int[] a={12,45,67,8};
	char[] ch={'a','b','c'};
	byte[] b={1,3,4};
	short[] c={1,3,4,5};
	float[] f={1.2f,2.4f,4};
	double[] d={1.3,4.6,5.4,7.6,4.0,6.0};

	System.out.println("Reference Address or object Reference of Int: " +a);  //[I@4517d9a3
	System.out.println("Reference Address or object Reference of byte: " +b); //[B@7adf9f5f
	System.out.println("Reference Address or object Reference of char: " +ch); // [C@85ede7b
	System.out.println("Reference Address or object Reference of short: " +c); // [S@5674cd4d
	System.out.println("Reference Address or object Reference of float: " +f); //[F@63961c42
	System.out.println("Reference Address or object Reference of double: " +d); //[D@65b54208
	
	int g=a.length;
	System.out.println("legth of integer is : "+g);
	System.out.println(a[0]); //12
	System.out.println(a[1]); //45
	System.out.println(a[2]); //67
	System.out.println(a[3]); //8
	
	int i=ch.length;
	System.out.println("legth of char is : "+i);
	System.out.println(ch[0]); //a
	System.out.println(ch[1]); //b
	System.out.println(ch[2]); //c
	
	int j=b.length;
	System.out.println("legth of byte is : "+j);
	System.out.println(b[0]); //a
	System.out.println(b[1]); //b
	System.out.println(b[2]); //c
	
	int l=c.length;
	System.out.println("legth of short is : "+l);
	System.out.println(c[0]); //a
	System.out.println(c[1]); //b
	System.out.println(c[2]); //c
	
	int m=f.length;
	System.out.println("legth of float is : "+m);
	System.out.println(f[0]); //a
	System.out.println(f[1]); //b
	System.out.println(f[2]); //c
	
	int n=d.length;
	System.out.println("legth of double is : "+n);
	System.out.println(d[0]); //a
	System.out.println(d[1]); //b
	System.out.println(d[2]); //c
	
	

	//length: here length is a variable. it refer to how many elements present in the array.
	System.out.println("Length of the array: " + a.length);   //4

	String s="Riya";
	int e=s.length();
	System.out.println(e); //4
	
	//for(int k=0;k<=d.length-1;k++){
	//for(int k=0;k<6;k++){
	//for(int k=0;k<d.length;k++){ //to print array
	/*for(int k=d.length-1;k>=0;k--){ //reverse the array
		if(d[k]==5.4){
	System.out.println("Length of the value:  " +k);
	}
	System.out.println("Print array using for loop: " +d[k]);
	}*/ 
	/*int k=0;
	while(k<d.length)
	{
	System.out.println(d[i]);
	i++;
	}
	}*/
	

	}
}
	