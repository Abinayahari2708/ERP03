package Com.ERP.Master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class execcatng extends Newtestngtest
{@Test(dataProvider="Stckcat")
	public void Categories(String catname)
	{
		SL.stockitems(catname);
	}

   @DataProvider
   
   public Object[][] Stckcat()
   {
   	Object[][] obj= new Object[3][1];
   	
   	obj[0][0]="Prest";
   	obj[1][0]="Drest";
   	obj[2][0]="Crest";
  
   	return obj;
   	}



}
