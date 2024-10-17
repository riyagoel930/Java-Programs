class ABC
{
	public static boolean upper(char ch){	
	if(ch>='A' && ch<='Z'){
	return true;
	}
	return false;
	}
	
	public static void main(String[] args)
	{
	System.out.println(upper('B'));
	}
}

