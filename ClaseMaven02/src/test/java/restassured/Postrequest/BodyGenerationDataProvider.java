package restassured.Postrequest;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import restassured.User;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;


public class BodyGenerationDataProvider {

    @DataProvider(name = "users-excel")
    public Iterator<Object[]> usersReadByExcelDataProvider(){

        List<User> usersList = readExcelFile();
        List<Object[]> usersRequestPayloads = new ArrayList<>();

        for(User user: usersList){
            JSONObject userInfo = new JSONObject();
            userInfo.put("username", user.getUsername());
            userInfo.put("firstname", user.getFirstname());
            userInfo.put("lastname", user.getLastname());
            userInfo.put("email", user.getEmail());

            usersRequestPayloads.add(new Object[]{userInfo});
        }

        return usersRequestPayloads.iterator();

    }

        @Test
        public List readExcelFile() {
            Map<String, Integer> columnas = new HashMap<>();
            User user;
            List<User> usersInformation = new ArrayList<>();

            try{
                FileInputStream excelFile = new FileInputStream( new File("resources/api/users.xlsx"));
                XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
                XSSFSheet excelSheet = workbook.getSheetAt(0);

                for (Cell celda: excelSheet.getRow(0)) {
                    columnas.put(celda.getStringCellValue(), celda.getColumnIndex());
                }

                System.out.println(columnas.toString());

                for (int i = 1; i < excelSheet.getLastRowNum(); i++) {
                    Row fila = excelSheet.getRow(i);
                    String username = fila.getCell(columnas.get("username")).getStringCellValue();
                    String firstname = fila.getCell(columnas.get("firstname")).getStringCellValue();
                    String lastname = fila.getCell(columnas.get("lastname")).getStringCellValue();
                    String email = fila.getCell(columnas.get("email")).getStringCellValue();

                    user = new User(username, firstname, lastname, email);

                    System.out.println(user.toString());
                    System.out.println("################################");
                }

                workbook.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            return usersInformation;
        }

}


