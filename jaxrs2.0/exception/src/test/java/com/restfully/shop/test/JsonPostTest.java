package com.restfully.shop.test;


import com.alibaba.fastjson.JSON;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;


public class JsonPostTest {
    /**
     * Performs HTTP post.
     * @param url http resource to post
     * @return string response
     */
    protected String post(String url, Object myJsonObject) {
        HttpClient httpClient = new DefaultHttpClient();

        String responseBody = null;
        try {
            HttpPost httpPost = new HttpPost(url);
            StringEntity stringEntity = new StringEntity(JSON.toJSONString(myJsonObject));
            httpPost.setEntity(stringEntity);
            httpPost.setHeader("Content-type", "application/json");

            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String response = httpClient.execute(httpPost, responseHandler);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
        return responseBody;
    }
}
