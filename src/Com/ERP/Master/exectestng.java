package Com.ERP.Master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exectestng extends Newtestngtest
{
@Test(dataProvider="Udata")
public void Uom(String Uid,String Udes)
{
SL.stockitemsuom(Uid,Udes);
}

@DataProvider

public Object[][] Udata()
{
	Object[][] obj= new Object[3][2];
	
	obj[0][0]="B789";
	obj[0][1]="mall";
	obj[1][0]="K234";
	obj[1][1]="mill";
	obj[2][0]="P098";
	obj[2][1]="risky";
	
	return obj;
	}





}