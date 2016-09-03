package Com.ERP.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pomloginpage 
{
	
	@FindBy(id="username")
	WebElement Uname;
	
	@FindBy(id="password")
	WebElement Pwd;
	
	@FindBy(id="btnsubmit")
	WebElement login;
	
	@FindBy(id="btnreset")
	WebElement reset;
	
	public void adminlgn(String Un,String Pswd)
	{
	reset.click();
	Uname.sendKeys(Un);
	Pwd.sendKeys(Pswd);
	login.click();	
		
		
	}

}
