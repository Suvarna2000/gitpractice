package com.wbl;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
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

public class PostRequestTest {

    @Test
    public void postRequest() throws IOException {

        String URL = "https://reqres.in/api/users";

        HttpPost httpPost = new HttpPost(URL);
        HttpClient httpClient = HttpClientBuilder.create().build();

        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("Content-Type","application/json");

        JSONObject json = new JSONObject();
        json.put("name","Smith");
        json.put("job","Tester");
        json.put("id","45");

        //String jsonString = json.toJSONString();
        StringEntity stringEntity = new StringEntity(json.toJSONString());

        //this is payload
        httpPost.setEntity(stringEntity);

        //for all Headers
        for(Map.Entry<String,String> entry : hashMap.entrySet()){
            httpPost.addHeader(entry.getKey(), entry.getValue());
        }
        HttpResponse httpResponse = httpClient.execute(httpPost);//sending post request



        int statusCode = httpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode,201);
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
