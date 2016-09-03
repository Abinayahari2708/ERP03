package Com.ERP.Master;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pomexec 

{    @Test
	public void lgnexec()
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		
		
		Pomloginpage lp=PageFactory.initElements(driver,Pomloginpage.class );
		lp.adminlgn("admin","master");

		pomhomepage hp= PageFactory.initElements(driver,pomhomepage.class);
hp.sup("sup-1234","saerf","sergjmk","hyd","india","thyuik","7465122852","asdfghn","123456784","azsxrf");
	
	
	}



}
