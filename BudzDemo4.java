
public class BudzDemo4
{

	public static void main(String[] args) 
	{
		int grossSalary = 10000;
		BudzDemo4 bd1 = new BudzDemo4();
		
		int charges = bd1.housecharges();
		
		int netsalary = grossSalary - charges;
		System.out.println(netsalary);
		
		int taxcal = 30 * charges;
		System.out.println(taxcal);
	}
	
  int housecharges()
  {
	  System.out.println("house charges is Invoking");
	  int rent = 1000;
	  int childFee = 2000;
	  int totalcharges = rent+childFee;
	  System.out.println(totalcharges);
	  return   totalcharges;
  }

}
