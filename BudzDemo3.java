
public class BudzDemo3
{

	public static void main(String[] args) 
	{
		int grossSalary = 10000;
		BudzDemo3 bd1 = new BudzDemo3();
		int netsalary = grossSalary - bd1.housecharges();
		System.out.println(netsalary);
		
		int taxcal = 30*bd1.housecharges();
		System.out.println(taxcal);
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
