package java11;
import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://www.durgasoft.com")).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code");
        System.out.println(response.statusCode());
        System.out.println("Headers");
        System.out.println(response.headers());
        /*System.out.println("BodyData");
        System.out.println(response.body());*/
    }
}
