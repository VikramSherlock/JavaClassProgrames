
public class MethodsDemo7A 
{

	public static void main(String[] args)
	{
	  MethodsDemo7A PK = new MethodsDemo7A();
	  PK.funB();
		
	  MethodsDemo7A NTR = new MethodsDemo7A();
	  NTR.funB();
		
	}
	
	void funA()
	{
		System.out.println("FunA of MethodsDemo7A");
	}


	void funB()
	{
		System.out.println("FunB of MethodsDemo7A");
		funA(); // funA calling from funB CURRENT OBJECT
	}
}
