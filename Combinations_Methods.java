
public class Combinations_Methods 
{
  static int funA() // Static-Primitive-Return
  {
	  int a=10;
	  return a;
  }
  
  static void funD()// Static-Primitive-NON_Return
  {
	  int i = 20;
	  System.out.println(i);
	   
  }
 
 static int funC()
  {
	   int k = 20;
	  return k;
  }
  
 static Combinations_Methods funF(Combinations_Methods a)
   {
	    
	   return a;
   }
   
 static int addNumbers()
  {
	  
	 return 20;
  }
  
  
  static void funE() //Static-Non Primitive-NON_Return
  {
	  int a=10;
	  System.out.println(a);
	  
  }
  void funR()
  {
	  Combinations_Methods d1= new Combinations_Methods();
	  return d1;
	 
  }
  
	public static void main(String[] args)
	{
	   Combinations_Methods d1 = new Combinations_Methods();
       Combinations_Methods a1 = Combinations_Methods.funF(d1);
       System.out.println(a1);
	}

}
