package lr8;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;

public class WriteExcelFileExample {
    public static void main(String[] args) {
        // Create new book Excel

        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create new list in the book
        XSSFSheet sheet = workbook.createSheet("Goods");

        // Write data in cells
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Good");
        headerRow.createCell(1).setCellValue("Characteristics");
        headerRow.createCell(2).setCellValue("Price");

        Row datarow1 = sheet.createRow(1);
        datarow1.createCell(0).setCellValue("Book");
        datarow1.createCell(1).setCellValue("Fantastic");
        datarow1.createCell(2).setCellValue(20);

        Row datarow2 = sheet.createRow(2);
        datarow2.createCell(0).setCellValue("Computer");
        datarow2.createCell(1).setCellValue("Ryzen 3500U 3.5 GHz, 8GB RAM, 500GB SSD");
        datarow2.createCell(2).setCellValue(700);

        // Write the book Excel in file
        try {
            String filePath = "example/example.xlsx";
            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

            System.out.println("Data success wrote in file: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
