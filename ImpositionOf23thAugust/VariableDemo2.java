package ImpositionOf23thAugust;

public class VariableDemo2
{
  int i = 20;
  static int j = 30;
public static void main(String[] args)
{
	VariableDemo2 P1 = new VariableDemo2();
	
	VariableDemo2 d1 =  new VariableDemo2();
	
	d1.funA(P1);d1.funA(null);d1.funA(new VariableDemo2());
	d1.funB(P1);d1.funB(null);d1.funB(new VariableDemo2());
	d1.funC(P1);d1.funC(null);d1.funC(new VariableDemo2());
	d1.funD(P1);d1.funD(null);d1.funD(new VariableDemo2());
	d1.funE(P1);d1.funE(null);d1.funE(new VariableDemo2());
			
}

void funA(VariableDemo2 P1)	
{
  
}

void funB(VariableDemo2 P1)	
{
  
}

void funC(VariableDemo2 P1)	
{
  
}

void funD(VariableDemo2 P1)	
{
  
}

void funE(VariableDemo2 P1)	
{
  
}

}
