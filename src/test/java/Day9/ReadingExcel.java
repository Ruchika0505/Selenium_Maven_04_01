package Day9;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//reading data --fileInputstream
//Excel File-->Workbook-->Sheets---->Rows--->Cells

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file= new FileInputStream(System.getProperty("user.dir") + "\\ExcelFiles\\data.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file); //apache poi
		
		XSSFSheet sheet =workbook.getSheet("Sheet1"); //name	
		
		//XSSFSheet sheet =workbook.getSheetAt(0); //index
		
		int rows=sheet.getLastRowNum(); //row no
		int col=sheet.getRow(1).getLastCellNum(); //col no
		
		System.out.println("The no of rows are :" + rows);
		System.out.println("The no of col are :" + col);
		
		for(int r=0;r<=rows;r++)   //rows
		{
			XSSFRow	currentRow=sheet.getRow(r); //0,1,2,3,4,5
			
			for(int c=0;c<col;c++) //col 0,1,2,3
			{
				
//				XSSFCell cellValue=currentRow.getCell(c);
//				String cell=cellValue.toString();
				
				String cellValue=currentRow.getCell(c).toString();
				System.out.print(cellValue + "    ");
				
			}
			
			System.out.println(); //formatting
		}
		
		workbook.close();
		file.close();
	
	}
}
