package com.wbl;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class DeleteRequestTest {

    @Test
    public void deleteRequest() throws IOException {

        String URL = "https://reqres.in/api/users/2";

        HttpDelete httpDelete = new HttpDelete(URL);
        HttpClient httpClient = HttpClientBuilder.create().build();

        HttpResponse httpResponse = httpClient.execute(httpDelete);

        int statusCode = httpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode,204);
        System.out.println(statusCode);
    }
}
