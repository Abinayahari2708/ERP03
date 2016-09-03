package Com.ERP.Master;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class testngdemo 

{    @Test(priority=1)
	public void xyz() 
	{
		AssertJUnit.assertEquals("Gmail", "Gmail");
		
		}
    @Test(priority=3,enabled=false)
	public void abc() 
	{
	   	AssertJUnit.assertEquals("Facebook", "Facebook");
	}
       @Test(priority=2)
	public void pqr() {
		AssertJUnit.assertEquals("Naukri", "Naukri");
		
	}
	
	
}
