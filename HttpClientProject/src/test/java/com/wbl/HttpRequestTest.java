package com.wbl;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;

public class HttpRequestTest {

    @Test
    public void getRequestReqresAPI() throws IOException {
        String URL = "https://reqres.in/api/users?page=2"; //initializing the url

        HttpGet httpGet = new HttpGet(URL); //passing url
        HttpClient httpClient = HttpClientBuilder.create().build(); //creating http client instance
        HttpResponse httpResponse = httpClient.execute(httpGet); //hitting url

        int statusCode = httpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode,200);
        System.out.println(statusCode);

        String responseBody = EntityUtils.toString(httpResponse.getEntity(),"UTF-8");
        System.out.println();
        System.out.println(responseBody);

        Header[] allHeader = httpResponse.getAllHeaders();
        HashMap<String,String> headers = new HashMap<String,String>();

        for(Header h:allHeader) {
            headers.put(h.getName(),h.getValue());
        }
        System.out.println();
        System.out.println(headers);
    }

    @Test
    public void getRequestDummyAPI() throws IOException {
        String URL = "http://dummy.restapiexample.com/api/v1/employees"; //initializing the url

        HttpGet httpGet = new HttpGet(URL); //passing url
        HttpClient httpClient = HttpClientBuilder.create().build(); //creating http client instance
        HttpResponse httpResponse = httpClient.execute(httpGet); //hitting url

        int statusCode = httpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode,200);
        System.out.println(statusCode);

        String responseBody = EntityUtils.toString(httpResponse.getEntity(),"UTF-8");
        System.out.println();
        System.out.println(responseBody);

        Header[] allHeader = httpResponse.getAllHeaders();
        HashMap<String,String> headers = new HashMap<String,String>();

        for(Header h:allHeader) {
            headers.put(h.getName(),h.getValue());
        }
        System.out.println();
        System.out.println(headers);
    }

}
