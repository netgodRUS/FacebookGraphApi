package org.example;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class FacebookGraphApi {

    public static void main(String[] args) {
        String accessToken = "your_access_token";
        String apiUrl = "https://graph.facebook.com/v13.0/me?fields=id,name,email&access_token=" + accessToken;

        HttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(apiUrl);

        try {
            HttpResponse response = httpClient.execute(request);

            // Handle the response, parse JSON, etc.
            System.out.println(response.getStatusLine().getStatusCode());
            // Process the response body...

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


