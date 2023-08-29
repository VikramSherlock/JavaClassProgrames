
public class MethodsDemo3 
{

	public static void main(String[] args) 
	{
     System.out.println("Main method of MethodsDemo3");
     funB();
     System.out.println("Done Bro");
		
	}
	static void funA()
	{
		System.out.println("funA of MethodsDemo3");
	}
	static void funB()
	{
		System.out.println("funB of MethodsDemo3");
		funA();
	}
	
	
}



// DeBugging Process //                                                                ***********Console Output*************
// main()                                                                               ------------------------------------------------
// { System.out.println("Main method of MethodsDemo3");                                      Main method of MethodsDemo3
//  funB()                                                                                   funB of MethodsDemo3
//    { System.out.println("funB of MethodsDemo3");                                          funA of MethodsDemo3
//      funA()                                                                               Done Bro
//      { System.out.println("funA of MethodsDemo3");
//      }// funA close
//    } funB close
//    System.out.println("Done Bro");
//  }
//
//
//
