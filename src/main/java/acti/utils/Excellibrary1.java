package acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellibrary1 {
	
	XSSFWorkbook wb;

	public Excellibrary1 (String excelPath) { // creating a constructor to load the excel file

			try {
				File file = new File(excelPath);
				FileInputStream fls = new FileInputStream(file);
				wb = new XSSFWorkbook(fls);
				
			} 
			
			catch (Exception e) {
				
				System.out.println("unable to load the excel file Please check" + e.getMessage());
			}
	}

		

		private XSSFWorkbook XSSFWorkbook(FileInputStream fls) {
		// TODO Auto-generated method stub
		return null;
	}



		// this method is used to return the active number of rows
		public int getRowCount(int sheetnum) {
					
			return wb.getSheetAt(sheetnum).getLastRowNum()+1; //if are returning any value the void will become data type as int i.e public int
			 
		}
		
		// this method is used to get the rowcount by sheetname
		
		public int getRowCount(String sheetname) {
			
			return wb.getSheet(sheetname).getLastRowNum()+1;
			 
		}
		
		//this method is used to get the celldata by using sheet index
		
		public String getCellData(int sheetnum,int row,int col)
		{
			return wb.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
		}
		
		//this method is used to get the celldata by using sheetname
		
		public String getCellData(String sheetname,int row,int col)
		{
			return wb.getSheet(sheetname).getRow(row).getCell(col).toString();
		}

	}



