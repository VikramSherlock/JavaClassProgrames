
public class Test10
{   
	int minBalance;

	public static void main(String[] args)
	{
		Test10 WE = new Test10();
		int minBalance = WE.getBalance();
         System.out.println(minBalance);

	}
	
   int getBalance()
   {
	   System.out.println("funA of Test10");
	   
	   int minBalance = 2000;
	    return minBalance;
   }

}
