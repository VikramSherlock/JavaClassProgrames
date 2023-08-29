
public class MethodsDemo4 
{

	public static void main(String[] args)
	{
		System.out.println("Main method Starts");
		funC();
		System.out.println("Done Bro");
		
	}
	static void funA()
	{
	 System.out.println("funA of MethodsDemo4");
	 funC();
	}
	static void funB()
	{
		System.out.println("funB of MethodsDemo4");
		funA();
	}
	static void funC()
	{
		System.out.println("funC of MethodsDemo4");
		funB();
	}
	
}
