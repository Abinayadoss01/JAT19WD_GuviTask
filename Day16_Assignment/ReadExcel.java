package ReadandWriteExcel;


import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Lenovo\\workspace\\Abinaya\\Day16_Assignment\\src\\main\\java\\ReadandWriteExcel\\StudentDetails.xlsx");
		
		XSSFSheet Sheet1 = book.getSheetAt(0);
		int rowCount = Sheet1.getLastRowNum();
		int columnCount = Sheet1.getRow(0).getLastCellNum();
		for (int i=1;i<=rowCount;i++) {
			XSSFRow row = Sheet1.getRow(i);
			for(int j=0;j<columnCount;j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
		book.close();
}
	

}
