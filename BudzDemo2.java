
public class BudzDemo2
{

	public static void main(String[] args) 
	{
		int grossSalary = 10000;
		BudzDemo2 bd1 = new BudzDemo2();
		// int netsalary = grossSalary - housecharges();
		int netsalary = grossSalary - bd1.housecharges();
		System.out.println(netsalary);
	}
	
  int housecharges()
  {
	  int rent = 1000;
	  int childFee = 2000;
	  int totalcharges = rent+childFee;
	  System.out.println(totalcharges);
	  return   totalcharges;
  }

}
