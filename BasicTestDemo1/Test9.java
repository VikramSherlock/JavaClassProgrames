package BasicTestDemo1;

public class Test9
{
	static int a = 10;

	public static void main(String[] args) 
	{
		Test9 t1 = new Test9();
		System.out.println(t1.a);
		
	}
   void funA()
   {
	  a = a+1; 
   }
}

//The output of this code is 10. Because we are just calling the 
//value of "a" from "t1" Variable of Test9 Object.
//After the Test9 Object created all the Non-static functions
//would called in to the Object and then assigned to variable
//of "t1". Now with the debugging process we came to conclusion 
//of printing the value as it is assigned as Global Variable we
//would be access the value of a as 10.