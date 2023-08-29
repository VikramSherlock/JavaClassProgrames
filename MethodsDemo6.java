
public class MethodsDemo6 
{

	public static void main(String[] args) 
	{
     System.out.println("Main method of MethodsDemo6");
     funB();
     System.out.println("Done ProjectK");
		

	}
  void funA()
  {
	  System.out.println("funA of MethodsDemo6");
  }
  
 static void funB()
  {
	System.out.println("funB of MethodswDemo6");  
	 MethodsDemo6 m1 = new MethodsDemo6();
     m1.funA();
  }
	
	 
}
