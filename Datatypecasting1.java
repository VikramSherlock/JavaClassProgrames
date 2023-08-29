
public class Datatypecasting1
{

	public static void main(String[] args) 
	{
		int a = 10;
		float f1 = a; // Implicit Data type casting
		System.out.println(f1);
		
		long k = 30000;
		float f2 = k;  // Implicit Data type casting
		System.out.println(k);

		double d = 10;
		
	//	int b = f2;
	//	int b = int (f2); // Explicit Data type casting // cannot convert from float to int
		
		
//		int c = 10.23;
//		int c = int (c);
//		System.out.println(c);// Explicit Data type casting// cannot convert from double to int
		
//		float f3 = 10.237876789;
//		float f3 = (float) 10.237876789;
//		System.out.println(f3); //cannot convert from double to float
		
		float f4 = (float) 10.23;
		System.out.println(f4);
		
		float f5 = 10.23f; // (float)10.23;
		long m = 320000l;// (long)320000;
		
		
		
	}

}
