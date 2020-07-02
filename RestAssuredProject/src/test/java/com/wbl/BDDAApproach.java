package com.wbl;

        import javafx.beans.binding.When;
        import org.json.simple.JSONObject;
        import org.testng.annotations.Test;

        import java.util.HashMap;
        import java.util.Map;

        import static io.restassured.RestAssured.given;
        import static io.restassured.RestAssured.when;
        import static org.hamcrest.Matchers.equalTo;
        import static org.hamcrest.Matchers.hasItems;

public class BDDAApproach {

    @Test
    public void getRequest() {
        given().
                when().get("https://reqres.in/api/users?page=2").
                //then().assertThat().log().all();
                //      then().assertThat().statusCode(201).log().all();
                        then().
                statusCode(200).
                body("data.id[1]",equalTo(8)).
                body("data.first_name",hasItems("Michael","Lindsay"));
    }

    @Test
    public void postRequest() {
        /*Map<String,Object> map= new HashMap<String,Object>();
        map.put("name","disney");
        map.put("job","entertainment");

        System.out.println(map);*/

        JSONObject json = new JSONObject();
        json.put("name","disney");
        json.put("job","entertainment");

        given().
                header("Content-Type","application/json").
                body(json.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().statusCode(201);
    }

    @Test
    public void putRequest() {

        JSONObject json = new JSONObject();
        json.put("name","walt");
        json.put("job","entertainment");

        given().
                header("Content-Type","application/json").
                body(json.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().statusCode(200).log().all();
    }

    @Test
    public void patchRequest() {

        JSONObject json = new JSONObject();
        json.put("name","walt");
        json.put("job","entertainment");

        given().
                header("Content-Type","application/json").
                body(json.toJSONString()).
                when().
                patch("https://reqres.in/api/users/2").
                then().statusCode(200).log().all();
    }

    @Test
    public void deleteRequest() {

        when().
                delete("https://reqres.in/api/users/2").
                then().statusCode(204).log().all();
    }
}
