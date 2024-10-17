class Second
{
	/*111
	  111
	  111*/
	public static void main(String[] args)
	{
	/*for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++){
	System.out.print(1);
	}
	System.out.println();
	}*/
	
//-------------------------------------------------------------------------
                 /*111
                   222
                   333*/
	/*for(int i=1;i<=3;i++)
	{
	for(int j=1;j<=3;j++){
	
	System.out.print(i+"");
	}
	System.out.println();
	}*/ 


//-----------------------------------------------------------------------
                 /*1234
                   1234
                   1234*/
        /*for(int i=1;i<=3;i++)
	{
	for(int j=1;j<=4;j++){
	
	System.out.print(j+"");
	}
	System.out.println();
	}*/

//------------------------------------------------------------------------
         /*123
           456
           789*/
	/*int num=1;
        for(int i=1;i<=3;i++)
	{
	for(int j=1;j<=3;j++)
	{
	System.out.print(num+"");
	num++;
	}
	System.out.println();
	}*/
	
//------------------------------------------------------------------------
         /*AAA
           BBB*/
	/*char ch=65;
	 for(int i=0;i<=1;i++)
	{
	for(int j=0;j<=2;j++)
	{
	System.out.print((char)(ch+i)+"");
	}
	System.out.println();
	}*/
	 
//------------------------------------------------------------------------
 	/*AB
          AB*/
	/*char ch=65;
        for(int i=0;i<2;i++)
	{
	for(int j=1;j<=2;j++){
	
	System.out.print((char)(ch+j-1)+"");
	}
	System.out.println();
	} */
//-------------------------------------------------------------------------
	/*ABC
          BEF
          GHI*/
	/*char ch=65;
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<=2;j++){
	
	System.out.print((char)(ch+(i*3)+j));
	}
	System.out.println();
	}*/
//-----------------------------------------------------------------------
	/*A
	  B 
	  C
          D
          E
          F
          G*/
	/*char ch=65;
	for(int i=0;i<=6;i++)
	{
	for(int j=1;j<=1;j++){
	
	System.out.print((char)(ch+i)+"");
	}
	System.out.println();
	}*/
//-------------------------------------------------------------------------
	/*V
	  U
	  T
	  S
	  R
	  Q
 	  P*/
	/*char ch=118;
	for(int i=0;i<7;i++)
	{
	
	System.out.print((char)(ch-i)+"");
	}
	System.out.println();
	*/
//--------------------------------------------------------------------------
        /*a
          c
          e
          g
          f*/
        /*char ch=65;
        for(int i=1;i<=8;i++)
	{i=i+1;
	System.out.print((char)(ch+i));
	}   
	System.out.println();  
	 */
//--------------------------------------------------------------------------
	/*z
	  x
	  v
	  t
	  r
	  p
 	  n*/
	/*char ch=124;
	for(int i=1;i<13;i++)
	{i++;
	System.out.println((char)(ch-i)+"");
	}
	System.out.println();
	}*/

//---------------------------------------------------------------------------
	/*Hy Hy Hy
	  Hy Hy Hy*/
	/*for(int i=1;i<3;i++)
	{
	for(int j=1;j<=3;j++)
	{
	System.out.print("Hy");
	}
	System.out.println();
	}*/
//----------------------------------------------------------------------------
	/* ***
	   ***
           *** */
  	/*for(int i=1;i<4;i++)
	{
	for(int j=1;j<=3;j++)
	{
	System.out.print("*");
	}
	System.out.println();
	}*/
//----------------------------------------------------------------------------
	/* ##
	   ##
	   ##
	   ## */
	/*for(int i=1;i<5;i++)
	{
	for(int j=1;j<=2;j++)
	{
	System.out.print("#");
	}
	System.out.println();
	}*/
//---------------------------------------------------------------------------
	//A to Z
	/*char ch=65;
	for(int i=0;i<=25;i++)
	{
	System.out.print((char)(ch+i));
	} */
//-----------------------------------------------------------------------------	
	//a to z
	/*char ch=97;
	for(int i=0;i<=25;i++)
	{
	System.out.print((char)(ch+i));
	}*/
//-------------------------------------------------------------------------------
	//a to z-
	char ch=97;
	for(int i=0;i<=40;i++)
	{
	System.out.print((char)(ch+i));
	}
//------------------------------------------------------------------------------
}
}