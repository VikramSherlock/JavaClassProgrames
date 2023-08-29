package ImpositionOf23thAugust;

public class StaticVariableDemo2B 
{ 
	int i = 265;
	int j = 369;

	 public static void main (String[] args)
	 {
	  funA(20);
	  funB(200l);
	  funC(1.366f);
	  funD(10.23);
	  funE(true);
	 
	 }
	 
 static int funA(int z)
  {
	 
	 
	return z;
  }
 
 static long funB(long b)
 {
	 
	 return b;
 }
 
 static float funC(float c)
 {
	 
	 return c;
 }
 
 static double funD(double d)
 {
	 
	 return d;
 }
 
 static boolean funE(boolean e)
 {
	 
	 return e;
 }
}
