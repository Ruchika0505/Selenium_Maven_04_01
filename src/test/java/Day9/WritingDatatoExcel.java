package Day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Writing data --fileInputstream
//Excel File-->Workbook-->Sheets---->Rows--->Cells

public class WritingDatatoExcel {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+ "\\ExcelFiles\\myfile.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook();
		
		XSSFSheet sheet= workbook.createSheet("Sheet1");
		
		//without for loop
		
		/*XSSFRow row1 =sheet.createRow(0);
		
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("1234");
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 =sheet.createRow(1);
		row2.createCell(0).setCellValue("John");
		row2.createCell(1).setCellValue("core");
		row2.createCell(2).setCellValue("java");*/
		
		
		//with for loop
		
		Scanner sc=new Scanner(System.in);
		
		
		for(int r=0;r<3;r++)
		{
			XSSFRow currentRow =sheet.createRow(r); //0
			
			for(int c=0;c<2;c++)
			{
				//currentRow.createCell(c).setCellValue("Welcome"); //same data in every cell
				
			System.out.println("enter the value of cell");
			String data=sc.next();
			currentRow.createCell(c).setCellValue(data);
				
			}
		}
		
		workbook.write(file); //writing on the file
		workbook.close();
		file.close();
		
		System.out.println("writing of file is completed");

	}

}
