
public class MethodsDemo7
{

	public static void main(String[] args) 
	{
     System.out.println("Main method of MethodsDemo7");
     MethodsDemo7 m1 = new MethodsDemo7();
     m1.funB();
     System.out.println("Done Salaar");
		

	}
  void funA()
  {
	  System.out.println("funA of MethodsDemo7");
  }
  
 static void funB()
  {
	System.out.println("funB of MethodswDemo7");  
	 MethodsDemo7 m1 = new MethodsDemo7();
     m1.funA();
  }
	
	 
}
