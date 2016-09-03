package Com.ERP.Master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class notepadexec 
{
	
public static void main(String[] args) throws IOException
	
	{
		        ERPLibrary SL=new ERPLibrary();
				String Res=SL.openApp("http://webapp.qedgetech.com");
		         System.out.println(Res);
		         Res=SL.Admlgn("admin","master");
			     System.out.println(Res);

{
	   //Filepath
		 
	String fpath="D:\\Abinaya\\ERP\\src\\Com\\ERP\\Testdata\\Uom.txt";
		 
		 //create text file for results
		 
		 String rpath="D:\\Abinaya\\ERP\\src\\Com\\ERP\\Results\\uomres.txt";
		 String Sd;
		 FileReader fr= new FileReader(fpath);
		 BufferedReader br= new BufferedReader(fr);
		 String sread=br.readLine();
		 System.out.println(sread);
		 
		 FileWriter fw= new FileWriter(rpath);
		 BufferedWriter bw= new BufferedWriter(fw);
		 bw.write(sread+"@@@"+"Results");
		 bw.newLine();
		 while ((Sd=br.readLine())!=null) 
		 
		 {
			System.out.println(Sd);
			String Sr[]=Sd.split("###");
			   String Uid= Sr[0];
			   System.out.println(Uid);
			   String Udes= Sr[1];
			   System.out.println(Udes);
			   Res= SL.stockitemsuom(Uid, Udes);
			   System.out.println(Res);
			   bw.write(Uid+"$$$"+Udes+"%%%"+Res);
			   bw.newLine();
			   
		
		 }
	bw.close();
	br.close();
	
	
	
}
}
}