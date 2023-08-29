
public class MethodsDemo5 
{

	public static void main(String[] args) 
	{
     System.out.println("Main method of MethodsDemo5");
     MethodsDemo5 m1 = new MethodsDemo5();
     m1.funB();
		

	}
  static void funA()
  {
	  System.out.println("funA of MethodsDemo5");
  }
  
 void funB()
  {
	System.out.println("funB of MethodswDemo5");  
	funA();
  }
	
	 
}
