package com.wbl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ContentValidation {

    @Test
    public void validationReqresAPI() throws IOException {

        String URL = "https://reqres.in/api/users?page=2";

        HttpGet httpGet = new HttpGet(URL); // passing URL
        HttpClient httpClient = HttpClientBuilder.create().build(); //creating http client instance
        HttpResponse httpResponse = httpClient.execute(httpGet); //hitting URL

        String responseBody = EntityUtils.toString(httpResponse.getEntity(),"UTF-8");

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(responseBody);

        int pageNo = jsonNode.get("page").asInt();
        Assert.assertEquals(pageNo,2);
        System.out.println("pageNo : "+pageNo);

        int perPage = jsonNode.get("per_page").asInt();
        Assert.assertEquals(perPage,6);
        System.out.println("perPage : "+perPage);

        String name = jsonNode.get("data").get(3).get("first_name").asText();
        Assert.assertEquals(name,"Byron");
        System.out.println("name : "+name);

        int id = jsonNode.get("data").get(5).get("id").asInt();
        Assert.assertEquals(id,12);
        System.out.println("id : "+id);

        String link = jsonNode.get("data").get(4).get("avatar").asText();
        Assert.assertEquals(link,"https://s3.amazonaws.com/uifaces/faces/twitter/mrmoiree/128.jpg");
        System.out.println("link : "+link);
    }

    @Test
    public void validationDummyAPI() throws IOException {

        String URL = "http://dummy.restapiexample.com/api/v1/employees";

        HttpGet httpGet = new HttpGet(URL);
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpResponse httpResponse = httpClient.execute(httpGet);

        String responseBody = EntityUtils.toString(httpResponse.getEntity(),"UTF-8");
        System.out.println("response body : "+responseBody);
        System.out.println();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(responseBody);

        String status = jsonNode.get("status").asText();
        Assert.assertEquals("success",status);
        System.out.println("status : "+status);

        String id = jsonNode.get("data").get(5).get("id").asText();
        Assert.assertEquals("6",id);
        System.out.println("id :"+id);

        String name = jsonNode.get("data").get(10).get("employee_name").asText();
        Assert.assertEquals("Jena Gaines",name);
        System.out.println("name :"+name);

        String sal = jsonNode.get("data").get(18).get("employee_salary").asText();
        Assert.assertEquals("132000",sal);
        System.out.println("sal :"+sal);

        String age = jsonNode.get("data").get(22).get("employee_age").asText();
        Assert.assertEquals("21",age);
        System.out.println("age :"+age);
    }
}
