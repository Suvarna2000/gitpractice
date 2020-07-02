package com.wbl;

import Utils.ExcelHelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class DummyRestApiTestExcel {

    @DataProvider(name="restdata100")
    public Object[][] testData100(){
        return ExcelHelper.getExcelData("RestData.xlsx","sheet1");
    }

    @DataProvider(name="restdata200")
    public Object[][] testData200(){
        return ExcelHelper.getExcelData("RestData.xlsx","sheet2");
    }

    @Test(dataProvider = "restdata100")
    public void getRequestReqres(String id,String firstName, String lastName,  String email ) {
        //{"id":7,"email":"michael.lawson@reqres.in","first_name":"Michael","last_name":"Lawson",
        // "avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/follettkyle/128.jpg"}

        //System.out.println("id : " +id);

        given().
                when().get("https://reqres.in/api/users?page=2").
                then().statusCode(200).
                //body("data.id",hasItems(id)).
                body("data.first_name",hasItems(firstName)).
                body("data.last_name",hasItems(lastName)).
                body("data.email",hasItems(email));

        //System.out.println("id : " +id);

    }

    @Test(dataProvider = "restdata200")
    public void getRequestDummy(String name,String sal, String age,  String id ) {
        //{"id":"1","employee_name":"Tiger Nixon","employee_salary":"320800","employee_age":"61","profile_image":""}

        //System.out.println("id : " +id);

        given().
                when().get("http://dummy.restapiexample.com/api/v1/employees").
                then().statusCode(200).

                body("data.employee_name",hasItems(name));
                //body("data.employee_salary",hasItems(sal)).
                //body("data.employee_age",hasItems(age));
                //body("data.id",hasItems(id)).

        //System.out.println("id : " +id);

    }

}