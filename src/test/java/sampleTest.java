import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class sampleTest
{
	@Test
	public void simpleTestpass()
	{
		int a=1;
		int b=2;
		assertTrue(a+b ==3);
		
	}
	public boolean simpleTestFail()
	{
		int a=2;
		int b=3;
		assertFalse(a+b ==6);
	}

	
 
}
