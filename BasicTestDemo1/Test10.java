package BasicTestDemo1;

public class Test10 
{
	int minBalance;

	public static void main(String[] args) 
	{
		

	}
	int getBalance()
	{
		System.out.println("funA of Test10");
		minBalance = 2000;
		return minBalance;
	}

}

//As we can see in above code , getBalance( ) can act as Method signature 
//and as well as a Variable we can call it in the main method because as it 
//is a Return datatype function and the minBalance  value of 2000 is return to the 
//getBalance () with writing the Return keyword.
//In order to call the Non-Static  Loacal variable of other function into main method we need to create an object to it of Test10
//{ Test10 WE = new Test10();}
//. And then assigning
 //{ int minBalance = WE.getBalance();} with this we assigned the minBalance value from getBalance() and we can print the minBalance by writing the 
//System.out.println(minBalance) value and  the output of this code is 2000;
