package com.tsoft.bot.frontend.utility;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


import java.io.IOException;


public class CallerJSON {


    public static void main(String[] args) {

        try {
            String result = blockIP("1.1.1.1");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String blockIP(String ip) throws IOException {

        String result = "";

        HttpPost post = new HttpPost("https://api.us-east.apiconnect.ibmcloud.com/telefonica-del-peru-development/topen/webviews/v1/users/me/phone-numbers/920957951/webviews/account_topup_external_payment");
        post.addHeader("Content-Type", "application/json");
        post.addHeader("X-IBM-Client-Id", "e70e694e-46e7-4de2-82ce-e98fd25c4ff0");
        post.addHeader("X-IBM-Client-Secret", "J6hQ2tM0cW2xB6nW6bB7jJ3dU1eT4lQ0aV6rJ4nH7tX3rF8sU2");
        post.addHeader("x-user-id", "5435");
        post.addHeader("x-client-id", "43543");
        post.addHeader("x-scope", "4535");
        post.addHeader("x-identifier-bound-scope", "435443");
        post.addHeader("x-consents", "4334");
        post.addHeader("x-purpose", "343345");
        post.addHeader("x-authorization-id", "43");
        post.addHeader("x-device-id", "23432");
        post.addHeader("x-activated-roles", "3242");
        post.addHeader("x-token-info", "453443");

        String block = "{\"target\":\"ip\",\"value\":\"" + ip + "\"}";

        StringBuilder entity = new StringBuilder();
        entity.append("{");
        entity.append("\"callback_url\": \"https://novum.com/endtest?state=2\",");
        entity.append("\"nonce\": \"4zg86i78-7060-4590-9f9-4d967f79bf143\",");
        entity.append("\"payload\": {\n" +
                "        \"msisdn\": \"51920953950\"\n" +
                "    }");
        entity.append("}");

        // send a JSON data
        post.setEntity(new StringEntity(entity.toString()));

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {

            result = EntityUtils.toString(response.getEntity());
        }
        return result;

    }

}
