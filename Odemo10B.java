
public class Odemo10B 
{

	public static void main(String[] args)
	{
		Odemo10B d1 = new Odemo10B();
		A  x = d1.getA(4);
		System.out.println(x);
		int i = d1.getA(7).j;
		System.out.println(i);
	//	A x3 = d1.getA(7).funA();
	//	int b = d1.getA(7).funA();
	//	int c = d1.getA(7);
	}


	A getA(int x)
	{
		A a1 = new A();
		a1.i = x;
		a1.j = x+1;
		return a1;
	}

}
