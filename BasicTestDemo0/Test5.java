package BasicTestDemo0;

public class Test5 
{
 static int RBG = 10;

	public static void main(String[] args) 
	{
		int technologies = RBG;
		RBG = 30;
		System.out.println(technologies);
		
	
	}

}

// The Output is 10
// RBG value is 10 but technologies = RBG
// RBG assigned with int of 30
// But techno;ogies =10;
