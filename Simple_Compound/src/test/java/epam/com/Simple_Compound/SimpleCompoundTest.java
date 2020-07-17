package epam.com.Simple_Compound;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SimpleCompoundTest 
{
    /**
     * Rigorous Test :-)
     */
	SimpleCompound s;
	@Before
	public void init()
	{
		s=new SimpleCompound();
	}
    @Test
    public void test()
    {
    	assertEquals(120,s.simpleInterest(6000,1,2),0);
		assertEquals(1200,s.compoundInterest(6000,20,1),0);
    }
}
