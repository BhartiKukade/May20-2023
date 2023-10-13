//package Utlis;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//
//
//public class Utility {
//	public static String getDataFromExcelsheet(String filepath,String sheet,int row,int cell){
//		
//		String data = "";
//		FileInputStream file = new FileInputStream(filepath);
//		WorkbookFactory.create(file).createSheet(sheet).getRow(row).getCell(cell)
//		try {
//			data=.getStringCellValue();
//		} catch (EncryptedDocumentException e) {
//			double value =.g
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	   return data;
//	}
//
//}
