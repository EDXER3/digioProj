package com.example.digiotest.excelexporter;

public class RegisedSubjectExcelExporter {/*
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<Stu_sub> liststu_sub;

    public RegisedSubjectExcelExporter(List<Stu_sub> liststu_sub) {
        this.liststu_sub = liststu_sub;
        workbook = new XSSFWorkbook();
    }


    private void writeHeaderLine() {
        sheet = workbook.createSheet("Subject");

        Row row = sheet.createRow(0);

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
        int columnCount = 0;

        createCell(row, columnCount++, "subject ID", style);
        createCell(row, columnCount++, "name_student", style);
        createCell(row, columnCount++, "description", style);
        createCell(row, columnCount++, "credit", style);
        createCell(row, columnCount++, "time start", style);
        createCell(row, columnCount++, "time off", style);
        createCell(row, columnCount++, "teacher", style);
        createCell(row, columnCount++, "major", style);


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

    private void writeDataLines() {
        int rowCount = 1;

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);

        for (Stu_sub stu_sub : liststu_sub) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;

            createCell(row, columnCount++, subject.getId(), style);
            createCell(row, columnCount++, subject.getNameSubject(), style);
            createCell(row, columnCount++, subject.getDescription(), style);
            createCell(row, columnCount++, String.valueOf(subject.getCredit()), style);
            createCell(row, columnCount++, String.valueOf(subject.getTimeStart()), style);
            createCell(row, columnCount++, String.valueOf(subject.getTimeOff()), style);
            String teacher_name = subject.getTeacher().getFistName() + " " +subject.getTeacher().getLastName();
            createCell(row, columnCount++, teacher_name , style);
            createCell(row, columnCount++, subject.getTeacher().getMajor() , style);


        }
    }

    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();

        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

        outputStream.close();

    }*/
}
