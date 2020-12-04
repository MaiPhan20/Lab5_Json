package lab5;

import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName","Dang");
        employeeDetails.put("lastName","Kim Thi");
        employeeDetails.put("website","codelean.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee",employeeDetails);

        //Second Employee

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName","Dang");
        employeeDetails2.put("lastName","Kim Thi");
        employeeDetails2.put("website","codelean.vn");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee",employeeDetails2);

        // add employee to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        //write JSON file
        try(FileWriter file = new FileWriter("employees.json")){
            file.write(employeeList.toJSONString());
            file.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
