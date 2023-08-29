package BasicTestDemo0;

public class Test10
{ 
  int a;

	public static void main(String[] args)
	{
		Test10 t1 = new Test10();
		t1.a = 10;
		
		
		Test10 t2 = new Test10();
		t2.a = t1.a+5;
		System.out.println(t2.a);

	}

}

// Output is 15 bcaz from t1 Variable of object Test10
// t1.a =10;
// t2 is another variable from Object of Test10
//t1.a+5;(10)+5;15
// t2.a = t1.a+5;=15;