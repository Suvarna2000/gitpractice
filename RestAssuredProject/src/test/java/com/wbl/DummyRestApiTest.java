package com.wbl;

import Utils.ExcelHelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class DummyRestApiTest {

    @Test
    public void getRequestDummy1() {
        //{"id":"1","employee_name":"Tiger Nixon","employee_salary":"320800","employee_age":"61","profile_image":""}

        given().
                when().get("http://dummy.restapiexample.com/api/v1/employees").
                then().statusCode(200).
                body("data.id[0]",equalTo("1")).
                body("data.employee_name",hasItems("Tiger Nixon")).
                body("data.employee_salary[0]",equalTo("320800")).
                body("data.employee_age[0]",equalTo("61"));
    }

    @Test
    public void getRequestDummy2() {
        //{"id":"2","employee_name":"Garrett Winters","employee_salary":"170750","employee_age":"63","profile_image":""}
        given().
                when().get("http://dummy.restapiexample.com/api/v1/employees").
                then().statusCode(200).
                body("data.id[1]",equalTo("2")).
                body("data.employee_name",hasItems("Garrett Winters")).
                body("data.employee_salary",hasItems("170750")).
                body("data.employee_age[1]",equalTo("61")); //actual age 63
    }

    @Test
    public void getRequestDummy3() {
        //{"id":"5","employee_name":"Airi Satou","employee_salary":"162700","employee_age":"33","profile_image":""}
        given().
                when().get("http://dummy.restapiexample.com/api/v1/employees").
                then().statusCode(200).
                body("data.id[4]",equalTo("5")).
                body("data.employee_name",hasItems("Airi Satou")).
                body("data.employee_salary",hasItems("162700")).
                body("data.employee_age[4]",equalTo("33"));
    }

    @Test
    public void getRequestDummy4() {
        //{"id":"8","employee_name":"Rhona Davidson","employee_salary":"327900","employee_age":"55","profile_image":""}
        given().
                when().get("http://dummy.restapiexample.com/api/v1/employees").
                then().statusCode(200).
                body("data.id[7]",equalTo("8")).
                body("data.employee_name",hasItems("Rhona Davidson")).
                body("data.employee_salary",hasItems("327900")).
                body("data.employee_age[7]",equalTo("55"));
    }

    @Test
    public void getRequestDummy5() {
        //{"id":"13","employee_name":"Charde Marshall","employee_salary":"470600","employee_age":"36","profile_image":""}
        given().
                when().get("http://dummy.restapiexample.com/api/v1/employees").
                then().statusCode(200).
                body("data.id[12]",equalTo("13")).
                body("data.employee_name",hasItems("Charde Marshall")).
                body("data.employee_salary",hasItems("470600")).
                body("data.employee_age[12]",equalTo("36"));
    }

    @Test
    public void getRequestDummy6() {
        //{"id":"17","employee_name":"Paul Byrd","employee_salary":"725000","employee_age":"64","profile_image":""}
        given().
                when().get("http://dummy.restapiexample.com/api/v1/employees").
                then().statusCode(200).
                body("data.id[17]",equalTo("17")). //actual id 16
                body("data.employee_name",hasItems("Paul Byrd")).
                body("data.employee_salary",hasItems("170750")).
                body("data.employee_age[16]",equalTo("64"));
    }

    @Test
    public void getRequestDummy7() {
        //{"id":"21","employee_name":"Jenette Caldwell","employee_salary":"345000","employee_age":"30","profile_image":""}
        given().
                when().get("http://dummy.restapiexample.com/api/v1/employees").
                then().statusCode(200).
                body("data.id[20]",equalTo("21")).
                body("data.employee_name",hasItems("Jenette Caldwell")).
                body("data.employee_salary",hasItems("345000")).
                body("data.employee_age[20]",equalTo("30"));
    }

    @Test
    public void getRequestDummy8() {
        //{"id":"24","employee_name":"Doris Wilder","employee_salary":"85600","employee_age":"23","profile_image":""}
        given().
                when().get("http://dummy.restapiexample.com/api/v1/employees").
                then().statusCode(200).
                body("data.id[23]",equalTo("24")).
                body("data.employee_name",hasItems("Doris Wilder")).
                body("data.employee_salary",hasItems("85600")).
                body("employee_age",equalTo("23"));  //did't write the word data, so actual value is null.
    }
}