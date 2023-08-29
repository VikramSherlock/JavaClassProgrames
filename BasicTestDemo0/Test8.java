package BasicTestDemo0;

public class Test8 
{

	public static void main(String[] args)
	{
	
		Test8 t1 = new Test8();
		
		Test8 t2 = new Test8();
		
		t2 = t1;
		
		System.out.println(t2);	
	}

}
// Output is "BasicTestDemo0.Test8@15db9742"