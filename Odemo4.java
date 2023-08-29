// Local variable with NPDT
public class Odemo4
{  
	int x;
	A a1; // does NPDT Variable take any default value?

	public static void main(String[] args) 
	{
		Odemo4 d1 = new Odemo4();
		System.out.println(d1.x);
		System.out.println(d1.a1);
		System.out.println(d1.a1.i);
		

	}

}

// For NPDT reference Variable default value is "NULL".
