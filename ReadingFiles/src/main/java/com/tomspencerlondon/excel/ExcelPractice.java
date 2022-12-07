package com.tomspencerlondon.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelPractice {

  public static void main(String[] args) {
    readExcelSheet(0, "./src/main/resources/Student.xls");
    System.out.println();
    readExcelSheet(1, "./src/main/resources/Student.xls");
  }

  private static void readExcelSheet(int sheetNumber, String pathname) {
    File file = new File(pathname);
    try (FileInputStream fileInputStream = new FileInputStream(file)) {
      HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
      HSSFSheet sheet = workbook.getSheetAt(sheetNumber);
      HSSFFormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();

      int count = 0;
      for (Row row : sheet) {
        for (Cell cell : row) {
          switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
            case NUMERIC -> System.out.print(cell.getNumericCellValue() + "\t\t");
            case STRING -> System.out.print(cell.getStringCellValue() + "\t\t");
          }
        }
        System.out.println();
        count++;
      }

      System.out.println("Row Count: " + count);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}