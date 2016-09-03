package Com.ERP.Master;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class execclass {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException
	
	{
		        ERPLibrary SL=new ERPLibrary();
				String Res=SL.openApp("http://webapp.qedgetech.com");
		         System.out.println(Res);
		         Res=SL.Admlgn("admin","master");
			     System.out.println(Res);
		
			     
			     SL.suplierscreation("12", "C78", "ASDFG", "HYD", "IND", "QWER", "1234565", "erghh", "sdfg1234", "fghhjj");
	
	             SL.stockitems("SSS");
	             
	             SL.stockitemsuom("123", "yyy");
	             
	             SL.logout();
	        
	             SL.closeapp();
	
	}

	
	
	    }
          







		
	


