package ImpositionOf23thAugust;

public class StaticVariableDemo2 
{
	int i = 20;
	 static int j = 30;
	public static void main(String[] args)
	{
		funA(20);
		funB(200l);
		funC(20.336f);
        funD(10.2333);
	    funE('d');
		
				
	}

 static	int funA(int a )	
	{
		return a;
	  
	}
 
 static long funB(long l)
   {
	return l;
	 
   }
 
 static float funC(float c)
 {
	return c;
	 
 }
 
 static double funD(double d)
 {
	return d;
	 
 }
 
 static char funE(char e)
 {
	return e;
	 
 }
}