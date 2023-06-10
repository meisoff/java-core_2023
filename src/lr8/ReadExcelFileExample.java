package lr8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        // Read Excel file
        String filePath = "example/example.xlsx";

        boolean exitLoop = false;

        while (!exitLoop) {
            try {
                FileInputStream inputStream = new FileInputStream(filePath);

                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

                // Проверка существования запрашиваемого листа
                XSSFSheet sheet = workbook.getSheet("Goods");
                if (sheet == null) {
                    System.out.println("Лист 'Goods' не найден в файле Excel. Убедитесь, что имя листа указано корректно.");
                    System.out.println("Желаете повторить попытку? (y/n)");

                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.nextLine();
                    if (!choice.equalsIgnoreCase("y")) {
                        exitLoop = true;
                    }

                    workbook.close();
                    inputStream.close();
                    continue;
                }

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.println(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                workbook.close();
                inputStream.close();

                exitLoop = true;

            } catch (Exception e) {
                System.out.println("Ошибка при чтении файла Excel:");
                if (e.getMessage() != null) {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Подробная информация об ошибке:");
                    e.printStackTrace();
                }

                System.out.println("Желаете повторить попытку? (y/n)");

                Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();
                if (!choice.equalsIgnoreCase("y")) {
                    exitLoop = true;
                }
            }
        }
    }
}
