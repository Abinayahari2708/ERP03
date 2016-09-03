package Com.ERP.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomhomepage 

{
	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
	WebElement supplier;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement supcreate;
	@FindBy(id="x_Supplier_Number")
	WebElement supno;
	@FindBy(id="x_Supplier_Name")
	WebElement supname;
	@FindBy(id="x_Address")
	WebElement addr;
	@FindBy(id="x_City")
	WebElement supcity;
	@FindBy(id="x_Country")
	WebElement supcountry;
	@FindBy(id="x_Contact_Person")
	WebElement supcperson;
	@FindBy(id="x__Email")
	WebElement supemail;
	@FindBy(id="x_Mobile_Number")
	WebElement supmobno;
	@FindBy(id="x_Notes")
	WebElement supnotes;
	@FindBy(id="btnAction")
	WebElement supadd;
	@FindBy(xpath=".//*[@id='x_Phone_Number']")
	WebElement supphno;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement supaddrec;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	WebElement supsuccess;
	
	
	
	
	
	/*@FindBy(xpath=".//*[@id='mi_a_purchases']/a")
    WebElement purchase;*/
	
	public void sup(String sno,String sn,String add,String city,String cntry,String cperson,String pno,String email,String mno,String notes)
	{
		supplier.click();
		supcreate.click();
		supno.sendKeys(sno);
		supname.sendKeys(sn);
		addr.sendKeys(add);
		supcity.sendKeys(city);
		supcountry.sendKeys(cntry);
		supcperson.sendKeys(cperson);
		supemail.sendKeys(email);
		supphno.sendKeys(pno);
		supmobno.sendKeys(mno);
		supnotes.sendKeys(notes);
		supadd.click();
		supaddrec.click();
		supsuccess.click();
		
		}
	
	
	/*public void purch()
	
	{
		purchase.click();
		
	}*/
}


