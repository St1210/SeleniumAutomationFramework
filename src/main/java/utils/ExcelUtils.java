package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static Workbook workbook;
	private static Sheet sheet;

	// Load Excel file and sheet
	public static void loadExcel(String filePath, String sheetName) throws IOException {

		FileInputStream fileInputStream = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fileInputStream);
		sheet = workbook.getSheet(sheetName);
		fileInputStream.close();
	}

	// Get cell data as String
	public static String getCellData(int row, int col) {

		Cell cell = sheet.getRow(row).getCell(col);

		if (cell == null) {
			return "";
		}

		if (cell.getCellType() == CellType.STRING) {
			return cell.getStringCellValue();
		} else if (cell.getCellType() == CellType.NUMERIC) {
			return String.valueOf(cell.getNumericCellValue());
		} else if (cell.getCellType() == CellType.BOOLEAN) {
			return String.valueOf(cell.getBooleanCellValue());
		} else {
			return "";
		}
	}
	
	public static int getRowCount() {
		return sheet.getPhysicalNumberOfRows(); 
	}
	
	public static void closeExcel() throws IOException {
		
			workbook.close();
	
	}
}
