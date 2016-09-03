package Com.ERP.Master;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ERPLibrary 

{
	public static Properties Pr;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static String Expval,Actval;

	public String openApp(String Url) throws IOException
	{
		Pr=new Properties();
		fis=new FileInputStream("D:\\Abinaya\\ERP\\src\\Com\\ERP\\Properties\\Repo.properties");
		Pr.load(fis);
		Expval="Login";
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get(Url);
		Actval=driver.findElement(By.id(Pr.getProperty("Login"))).getText();
	    if (Expval.equalsIgnoreCase(Actval))
	    {
		//System.out.println("pass");
		  return "Pass";
	    }
	    else
	    {
	    	//System.out.println("Fail");
	       return "Fail";
	    }
	}

	public String Admlgn(String Un,String Pwd)
	{
		Expval="Administrator";
		driver.findElement(By.id(Pr.getProperty("Reset"))).click();
		driver.findElement(By.id(Pr.getProperty("Uname"))).sendKeys(Un);
		driver.findElement(By.id(Pr.getProperty("Pwd"))).sendKeys(Pwd);
		driver.findElement(By.id(Pr.getProperty("Login"))).click();
		 Actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
	 	    if(Expval.equalsIgnoreCase(Actval))
	 	       {
	 			//System.out.println("Stock accounting home page displayed");
	 	      return "pass";
	 	       }
	 	       else
	 	       {
	 	    	//System.out.println("Stock accounting home page not displayed");
	 	       return "Fail";
	 	       }
	}
	
	
	public String suplierscreation(String sno,String sn,String add,String city,String cntry,String cperson,String pno,String email,String mno,String notes)
    {
    	 Expval ="Add succeeded";
    	
driver.findElement(By.xpath(Pr.getProperty("Supplierslink"))).click();
driver.findElement(By.xpath(Pr.getProperty("SupplierAdd"))).click();
driver.findElement(By.id(Pr.getProperty("Suppliernumber"))).sendKeys(sno);
driver.findElement(By.id(Pr.getProperty("Suppliername"))).sendKeys(sn);
driver.findElement(By.id(Pr.getProperty("Address"))).sendKeys(add);
driver.findElement(By.id(Pr.getProperty("City"))).sendKeys(city);
driver.findElement(By.id(Pr.getProperty("Country"))).sendKeys(cntry);
driver.findElement(By.id(Pr.getProperty("Cperson"))).sendKeys(cperson);
driver.findElement(By.xpath(Pr.getProperty("Pnumber"))).sendKeys(pno);
driver.findElement(By.id(Pr.getProperty("Email"))).sendKeys(email);
driver.findElement(By.id(Pr.getProperty("Mobnumber"))).sendKeys(mno);
driver.findElement(By.id(Pr.getProperty("Notes"))).sendKeys(notes);
driver.findElement(By.id(Pr.getProperty("Create"))).click();
driver.findElement(By.xpath(Pr.getProperty("Addrecord"))).click();
driver.findElement(By.xpath(Pr.getProperty("SupplierCreation"))).click();



//System.out.println("Stock accounting home page displayed");
Actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
    if(Expval.equalsIgnoreCase(Actval))
{
	return "pass";
       }
       else
       {
    	//System.out.println("Stock accounting home page not displayed");
       return "Fail";
       } 
    }

	public String stockitems(String catname)
    {
    	Expval ="Add succeeded";
    
    	Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	    Sleeper.sleepTightInSeconds(5); 
	    driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
	    driver.findElement(By.xpath(Pr.getProperty("Catadd"))).click();
	    driver.findElement(By.xpath(".//*[@id='x_Category_Name']")).sendKeys(catname);
	    driver.findElement(By.id(Pr.getProperty("Categoryadd"))).click();
	   
	    driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    //System.out.println("Stock accounting home page displayed");
	    Actval=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
	    driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		     
	    if(Expval.equalsIgnoreCase(Actval))
	    {
	    	return "pass";
	           }
	           else
	           {
	        	//System.out.println("Stock accounting home page not displayed");
	           return "Fail";
	           } 
    
    }

	public String stockitemsuom(String cid,String cdesc)
    {
    	 Expval ="Add succeeded";
    
    	Actions act1 = new Actions(driver);
	    act1.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	    Sleeper.sleepTightInSeconds(5);
    	driver.findElement(By.xpath(Pr.getProperty("UOM"))).click();
		driver.findElement(By.xpath(Pr.getProperty("UOMadd"))).click();
		 driver.findElement(By.id(Pr.getProperty("uomid"))).sendKeys(cid);
		   driver.findElement(By.id(Pr.getProperty("uomdesc"))).sendKeys(cdesc);
		   driver.findElement(By.id(Pr.getProperty("uomcreate"))).click();
		 
		   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		   //System.out.println("Stock accounting home page displayed");
		    Actval=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
		    driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		        if(Expval.equalsIgnoreCase(Actval))
		    {
		    	return "pass";
		           }
		           else
		           {
		        	//System.out.println("Stock accounting home page not displayed");
		           return "Fail";
		           } 
    }   
		  public void logout()
		      
		  {  driver.findElement(By.linkText("Logout")).click();
		  }
				
		   public void closeapp()
		   { 
		   driver.close();
    }
}
          





    
    
    
    
    
    
    
    
















