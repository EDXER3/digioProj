package com.example.digiotest.excelexporter;

import com.example.digiotest.model.Stu_sub;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Subject_StudentExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<Stu_sub> listStu_sub;
    private int countAllRegis =0;
    private String name_subject="";

    public Subject_StudentExcelExporter(List<Stu_sub> listStu_sub,String name_subject) {
        this.listStu_sub = listStu_sub;
        this.name_subject= name_subject;
        workbook = new XSSFWorkbook();
    }


    private void writeLine() {



                    sheet = workbook.createSheet(name_subject);
                    CellStyle style = workbook.createCellStyle();
                    XSSFFont font = workbook.createFont();
                    font.setBold(true);
                    font.setFontHeight(16);
                    style.setFont(font);

                    int first_row = 0, last_row = 0, first_col = 0, last_cal = 2;
                    createCell(sheet.createRow(first_row), first_col, name_subject, style);
                    sheet.addMergedRegion(new CellRangeAddress(first_row, last_row, first_col, last_cal));

                    Row row = sheet.createRow(1);
                    int columnCount = 0;

                    createCell(row, columnCount++, "Student ID", style);
                    createCell(row, columnCount++, "Name", style);
                    createCell(row, columnCount++, "Year", style);

                    int rowCount = 2;

                    CellStyle style_Data = workbook.createCellStyle();
                    XSSFFont font_Data = workbook.createFont();
                    font_Data.setFontHeight(14);
                    style_Data.setFont(font_Data);

                    for (Stu_sub stu_sub : listStu_sub) {

                            row = sheet.createRow(rowCount++);
                            columnCount = 0;
                            createCell(row, columnCount++, stu_sub.getsubjectId().getId(), style_Data);
                            String student_name = stu_sub.getstudentId().getFistName() + " " + stu_sub.getstudentId().getLastName();
                            createCell(row, columnCount++, student_name, style_Data);
                            createCell(row, columnCount++, stu_sub.getstudentId().getYear(), style_Data);


                    }




    }

        private void createCell(Row row, int columnCount, Object value, CellStyle style) {
            sheet.autoSizeColumn(columnCount);
            Cell cell = row.createCell(columnCount);
            if (value instanceof Integer) {
                cell.setCellValue((Integer) value);
            } else if (value instanceof Boolean) {
                cell.setCellValue((Boolean) value);
            }else {
                cell.setCellValue((String) value);
            }
            cell.setCellStyle(style);
        }

    

    public void export(HttpServletResponse response) throws IOException {
        writeLine();
        

        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

        outputStream.close();

    }



}
