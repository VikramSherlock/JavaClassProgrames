
public class VariableDemo4 
{  int i = 10;
 static int j = 20;
 
	public static void main(String[] args) 
	{
		System.out.println(j);
		j = 30;
		System.out.println(j);
		int j = 40;
		System.out.println(j);
		
		//System.out.println(k);
		//System.out.println(i); To get Non-static variable need to declare a Variable to it and 
		               // create a new object so that values will get into assigned variable
		
		VariableDemo4 v1 = new VariableDemo4();
		System.out.println(v1.i);
		
	}

}
