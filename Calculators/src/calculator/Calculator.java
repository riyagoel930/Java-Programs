package calculator;

import additionProg.Addition;
import divProg.Division;
import extraProg.Cube;
import extraProg.Square;
import mulProg.Product;
import subProg.Subtraction;

public class Calculator {
	public static void main(String[]agrs)
	{
		Addition a1=new Addition();
		int res=a1.add(12,4);
		System.out.println(res);
		
		Subtraction s=new Subtraction();
		int num1=s.sub(12, 6);
		System.out.println(num1);
		
		Division d=new Division();
		int res1=d.div(8, 2);
		System.out.println(res1);
		
		Product p=new Product();
		int res2=p.pro(3, 7);
		System.out.println(res2);
		
		Cube c=new Cube();
		int res3=c.getCube(3);
		System.out.println(res3);
		
		
		
		
	}
	public  int method(int a) {
		return a;
		
	}
}
