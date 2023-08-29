
public class ObjectDemo3 
{     int a = 10;
    boolean b = true;
   static int  c = 20;

	public static void main(String[] args) 
	{
		System.out.println(c);
		
		//boolean b1 = new ObjectDemo3(); // cannot convert from ObjectDemo3 to boolean
		//int i = new ObjectDemo3();  // cannot convert from ObjectDemo3 to int
		
		ObjectDemo3 o1 = new ObjectDemo3();
		System.out.println(o1.a);
		System.out.println(o1.b);


	}

}
