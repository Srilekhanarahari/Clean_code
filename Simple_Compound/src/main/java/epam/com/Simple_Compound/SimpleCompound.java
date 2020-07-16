package epam.com.Simple_Compound;

/**
 * Hello world!
 *
 */
public class SimpleCompound 
{
	double simpleInterest(double principle,double rate,int time)
	{
		double simpleinterest=((principle*rate*time)/100);
		return simpleinterest;
	}
	double compoundInterest(double principle,double rate,int time)
	{
	  double  compoundinterest=principle * Math.pow(1.0+rate/100.0,time) - principle;
	  return compoundinterest;
	}
}
