package com.wbl;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class PutRequestTest {

    @Test
    public void postRequest() throws IOException {

        String URL = "https://reqres.in/api/users/2";

        HttpPut httpPut = new HttpPut(URL);
        HttpClient httpClient = HttpClientBuilder.create().build();

        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("Content-Type","application/json");

        JSONObject json = new JSONObject();
        json.put("name","Morpheus");
        json.put("job","Developer");

        //String jsonString = json.toJSONString();
        StringEntity stringEntity = new StringEntity(json.toJSONString());

        //this is payload
        httpPut.setEntity(stringEntity);

        //for all Headers
        for(Map.Entry<String,String> entry : hashMap.entrySet()){
            httpPut.addHeader(entry.getKey(), entry.getValue());
        }
        HttpResponse httpResponse = httpClient.execute(httpPut);//sending post request



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
