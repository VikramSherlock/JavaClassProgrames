
public class Odemo8B 
{

	void fun1(A a1)
	{
		System.out.println(a1);
		if(a1!=null)
		{
			a1.i = a1.i+1;
			a1.j = a1.j+2;
			
		}
		System.out.println("end of fun1");
	}
	public static void main(String[] args) 
	{
		Odemo8B d1 = new Odemo8B();
		 int a1 = 20;
	//	d1.fun1(a1);
	//	System.out.println(a1.i);
	//	System.out.println(a1.j);
	}

}

//"a1" is NOT a ClassA datatype.So Compile time Error.