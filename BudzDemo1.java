
public class BudzDemo1 
{

	public static void main(String[] args) 
	{
	 int grossSalary = 19632;
  //   int netSalary = grossSalary -totalcharges;// We Can't call a Local function in main method.
	// System.out.println(netSalary);
	 
	 BudzDemo1 db1 = new BudzDemo1();// Even creating the Object doesn't help the compile time error
	 db1.housecharges();
	}
	
  void housecharges()
  {
	  int rent = 5000;
	  int childFee = 2000;
	  int totalcharges = rent+childFee;
	  System.out.println(totalcharges);
  }

}
