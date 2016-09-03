package Com.ERP.Master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Execexcel 

{
	
public static void main(String[] args) throws IOException
	
	{
		        ERPLibrary SL=new ERPLibrary();
				String Res=SL.openApp("http://webapp.qedgetech.com");
		         System.out.println(Res);
		         Res=SL.Admlgn("admin","master");
			     System.out.println(Res);

	/*FileInputStream fis= new FileInputStream("D:\\Abinaya\\ERP\\src\\Com\\ERP\\Testdata\\Uom1.xlsx");
	
	             XSSFWorkbook wb= new XSSFWorkbook(fis);
	             XSSFSheet ws= wb.getSheet("UOmData");
	            int rc=ws.getLastRowNum();
	     	    System.out.println(rc);
	     	    
	     	    for (int i = 1; i <= rc; i++) 
	     	    
	     	    {
	     	    	XSSFRow wr=ws.getRow(i);
		    	    XSSFCell wc=wr.getCell(0);
		    	    XSSFCell wc1=wr.getCell(1);
		    	    XSSFCell wc2=wr.createCell(2);
		    	    String Uid=wc.getStringCellValue();
		    	    String Udes=wc1.getStringCellValue();
		    	    Res=SL.stockitemsuom(Uid, Udes);
		             System.out.println(Res);
		             wc2.setCellValue(Res);
	     	    	  
				}
	

	    	    FileOutputStream fos=new FileOutputStream("D:\\Abinaya\\ERP\\src\\Com\\ERP\\Results\\ExcelRes.xlsx");
	    	    wb.write(fos);
	    	    wb.close();*/
	
    
FileInputStream fis1= new FileInputStream("D:\\Abinaya\\ERP\\src\\Com\\ERP\\Results\\stockcat.xlsx");

XSSFWorkbook wb= new XSSFWorkbook(fis1);
XSSFSheet ws= wb.getSheet("Catdata");
int rc=ws.getLastRowNum();
for (int i = 1; i <= rc; i++) 
{
	XSSFRow wr=ws.getRow(i);
   XSSFCell wc=wr.getCell(0);
   XSSFCell wc1=wr.createCell(1);
   String catname=wc.getStringCellValue();
    Res=SL.stockitems(catname);
    System.out.println(Res);
    wc1.setCellValue(Res);
	  
}
 

FileOutputStream fos1=new FileOutputStream("D:\\Abinaya\\ERP\\src\\Com\\ERP\\Results\\Catres.xlsx");
wb.write(fos1);
wb.close();
}
    






}
	
	
	
	
	
	
	
	
	
	
	
	
	
