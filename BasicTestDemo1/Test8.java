package BasicTestDemo1;

public class Test8 
{
  static int a = 1;
	public static void main(String[] args) 
	{
		funA();
		System.out.println(a);
		

	}
	static void funA()
	{
		a = a+1;
	}

}
//The output of this Code is 2.
//Because as we have a global variable for a Variable. 
//And when the JVM executes the static varaible operation
//then the value of Variable is 1 and with the debigging
//process i came to a conclusion of output value is 2 like 
//{ as a = 1 in globally and we try to print a value as already
//it has 1 value with operation of a = a+1;1+1;2;