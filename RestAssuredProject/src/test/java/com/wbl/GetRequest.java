package com.wbl;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

public class GetRequest {

    @Test
    public void getRequestMethod() {
        RestAssured.baseURI = "https://reqres.in/";   //"https://api.talentscreen.io";
        String endURL = "api/users/2";   //"v1/subjects/5";
        RequestSpecification req = RestAssured.given();
        Response res = req.request(Method.GET,endURL);

        //status code
        int statusCode = res.getStatusCode();
        System.out.println("status code : "+statusCode);
        Assert.assertEquals(statusCode,200);

        //response payload
        String jsonPayload = res.asString();
        System.out.println("JSON payload is : "+jsonPayload);

        //response headers
        System.out.println("JSON Headers : "+res.getHeaders());

    }

    @Test
    public void postRequestMethod() {
        RestAssured.baseURI = "https://reqres.in/";   //"https://api.talentscreen.io";
        String endURL = "api/users";
        RequestSpecification req = RestAssured.given();

        req.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("id",7);
        json.put("name","QA");
        json.put("job","QA batch instructor");

        String stringjsondata = json.toJSONString();
        req.body(stringjsondata);
        Response res = req.request(Method.POST,endURL);

        int statusCode = res.getStatusCode();
        System.out.println("status code : "+statusCode);
        Assert.assertEquals(statusCode,201);

        //response payload
        String jsonPayload = res.asString();
        System.out.println("JSON payload is : "+jsonPayload);

        //response headers
        System.out.println("JSON Headers : "+res.getHeaders());

    }

    @Test
    public void putRequestMethod() {
        RestAssured.baseURI = "https://reqres.in/";    //"https://api.talentscreen.io";
        String endURL = "api/users/2";
        RequestSpecification req = RestAssured.given();

        req.header("Content-Type","application/json");
        JSONObject json = new JSONObject();
        json.put("id",100);
        json.put("first_name","Joey");
        json.put("email","joey.weaver@reqres.in");

        String stringjsondata = json.toJSONString();
        req.body(stringjsondata);
        Response res = req.request(Method.PUT,endURL);

        int statusCode = res.getStatusCode();
        System.out.println("status code : "+statusCode);
        Assert.assertEquals(statusCode,200); //200 for created and updated

        //response payload
        String jsonPayload = res.asString();
        System.out.println("JSON payload is : "+jsonPayload);

        //response headers
        System.out.println("JSON Headers : "+res.getHeaders());

    }
}

