class EligibleToVote
{
	
	public static boolean vote(int age) {
	if(age>=18){
	return true;
	}
	return false;
	}
	
	public static void main(String[] args)
	{
	System.out.println(vote(19));
	}
}

