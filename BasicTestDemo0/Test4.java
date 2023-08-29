package BasicTestDemo0;

public class Test4 
{
 static int RBG = 10;

	public static void main(String[] args) 
	{
		int technologies = 20;
		RBG = technologies;
		System.out.println(RBG);
		
	
	}

}
// The Output is 20
// earlier in class level RBG = 10;
// In Main method RBG = technologies but technologies = 20;
// so RBG = 10;
