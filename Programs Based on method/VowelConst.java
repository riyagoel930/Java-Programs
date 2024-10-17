class VowelConst
{
	public static void Vowel(char ch) 
    { 
        if ( ch == 'A' || ch == 'E' || ch == 'I'
            || ch == 'O' || ch == 'U') 
            System.out.println("It is a Vowel.");   
    } 
   
    public static void main(String[] args) 
    {  
        Vowel('I'); 
    } 
}