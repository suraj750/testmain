package libarires;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class 
{

//	public static String getdata(int row, int col) throws EncryptedDocumentException, IOException
//	{
//		
//	    FileInputStream file=new FileInputStream("C:\\Users\\SDH\\Desktop\\DataProvider.xlsx");
//	        
//	           String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(col).getStringCellValue();
//
//	           return data;
//	}
//	
	
	public static Object[][] gettestdata(String sheetname) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\SDH\\Desktop\\DataProvider.xlsx");
		org.apache.poi.ss.usermodel.Sheet sheet = WorkbookFactory.create(file).getSheet(sheetname);
		    
		     Object[][] data =new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		     for(int i=0; i< sheet.getLastRowNum();i++)
		     {
		    	 for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) 
		    	 
		    	 {
					
		    		data[i][j]=sheet.getRow(i+1).getCell(j).toString(); 
		    		 
				 }
		    	 
		    	 
		     }
		return data;
	}
	
	
}
