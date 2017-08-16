package com.howtodoinjava.demo.poi;
import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 11.2.2017 г..
 */
public class WriteFile {
    private final static String path = "/src/resources/";
    private final static String pathOut = "/src/resources/OutChars.txt";
    private final static String projectPath = System.getProperty("user.dir");
    public static void main(String[] args) throws IOException {

        List<Student> students= ReadingFile.getStudents();


        File file = new File(projectPath + path+"StudentData.xls");
        FileOutputStream outputStream = new FileOutputStream(file);

        PrintWriter print = new PrintWriter(outputStream);

        String tab = "\t";

        for (Student student : students) {
            StringBuilder sb = new StringBuilder();
            sb.append(student.getFacultyNumber()).append(tab).append(student.getFirstName()).append(tab)
                    .append(student.getLastName()).append(tab).append(student.getAge()).append(tab).append(student.getEmail())
                    .append(tab).append(student.getGroup()).append(tab).append(student.getPhone()).append(tab)
                    .append(student.getGrades().stream().map(c->c.toString()).collect(Collectors.joining(tab)));
            print.println(sb);
        }
        print.close();


//        try
//        {
//            FileInputStream excelFile = new FileInputStream(new File(projectPath + path+"StudentDataNew.xlsx"));
//
//            //Create Workbook instance holding reference to .xlsx file
//            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
//
//            //Get first/desired sheet from the workbook
//            XSSFSheet sheet = workbook.getSheetAt(0);
//
//            //Iterate through each rows one by one
//            Iterator<Row> rowIterator = sheet.iterator();
//            while (rowIterator.hasNext())
//            {
//                Row row = rowIterator.next();
//                //For each row, iterate through all the columns
//                Iterator<Cell> cellIterator = row.cellIterator();
//
//                while (cellIterator.hasNext())
//                {
//                    Cell cell = cellIterator.next();
//                    //Check the cell type and format accordingly
//                    switch (cell.getCellType())
//                    {
//                        case Cell.CELL_TYPE_NUMERIC:
//                            System.out.print(cell.getNumericCellValue() + "t");
//                            break;
//                        case Cell.CELL_TYPE_STRING:
//                            System.out.print(cell.getStringCellValue() + "t");
//                            break;
//                    }
//                }
//                System.out.println("");
//            }
//            excelFile.close();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
    }
}
