
public class MethodsDemo2
{

	public static void main(String[] args)
	{
	 System.out.println("Main method of MethodsDemo3");	
	 funC(); // Calling the function or INVOKING or Executing
	 // funA();// Cannot make a static reference to the non-static method funA() from the type MethodsDemo2
	 //funB();// Cannot make a static reference to the non-static method funB() from the type MethodsDemo2
	
	  
	 MethodsDemo2 m1 = new MethodsDemo2();
	 m1.funA();
	 m1.funB();
	 System.out.println("Done Bro");
	 
    } 
	void funA()
	{
		System.out.println("funA of MethodsDemo2");
	}
	
	void funB()
	{
		System.out.println("funB of MethodsDemo2");
	}
	
	 static void funC()
	{
		System.out.println("funA of MethodsDemo2");
	}
}
