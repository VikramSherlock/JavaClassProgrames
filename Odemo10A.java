
public class Odemo10A 
{
   public static void main(String[] args)
	{
		Odemo10A d2 = new Odemo10A();
		Odemo10A P2 = new Odemo10A();
		
		Ramesh x = d2.funA();
		System.out.println(x);
		System.out.println(d2.funA());
		
		Ramesh y = d2.funB();
		System.out.println(y);
		System.out.println(d2.funB());
		
		Ramesh z = d2.funB();
		System.out.println(z);
		System.out.println(d2.funC());
	}
	
   Ramesh funA()
	{
		Ramesh o = new Ramesh();
		return o;
		
	}
	
	Ramesh funB()
	{
	
		return new Ramesh();

	}
	
	Ramesh funC()
	{
		return null;
	}
}
