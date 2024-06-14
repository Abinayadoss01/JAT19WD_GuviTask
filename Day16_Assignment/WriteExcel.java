package ReadandWriteExcel;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel {


	public static void main(String[] args) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet Sheet1 = book.createSheet();
		
		Object[] [] data = {				
				{"Name","Age","City"},
				{"Abinaya",20,"NKL"},
				{"Rajesh",23,"CHN"},
				{"Shan",43,"Salem"}
				
				};
		
		int rowCount = 0;
		for(Object [] row1 : data) {
			XSSFRow row = Sheet1.createRow(rowCount++);
			
		
		int ColumnCount = 0;
		for(Object col : row1) {
			XSSFCell cell = row.createCell(ColumnCount++);
			
			if(col instanceof String) {
				cell.setCellValue ((String) col);
			}
			else if (col instanceof Integer){
				cell.setCellValue ((Integer) col);	
			}
		
		}
		}
		try {
			FileOutputStream File1 = new FileOutputStream("C:\\Users\\Lenovo\\workspace\\Abinaya\\Day16_Assignment\\src\\main\\java\\ReadandWriteExcel\\WriteExcel.xlsx");
			book.write(File1);
		} catch (Exception e) {
			 System.out.println("error");
			e.printStackTrace();
		}
		book.close();
	}

}

