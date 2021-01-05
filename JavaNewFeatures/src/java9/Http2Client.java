package java9;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Http2Client {
    public static void main(String[] args) throws Exception {
        String url = "https://www.redbus.in/info/aboutus";
        sendGetAsyncRequest(url);

    }
    public static void sendGetAsyncRequest(String url) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder(new URI(url)).GET().build();
        HttpResponse resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        processResponse(resp);

    }
    public static void processResponse(HttpResponse resp) {
        System.out.println("Status Code: "+ resp.statusCode());
        System.out.println("Response Body: "+ resp.body());
        HttpHeaders header = resp.headers();
        Map<String, List<String>> map = header.map();
        System.out.println("Response Headers");
        map.forEach((k,v) -> System.out.println("\t"+k+":"+v));
    }
}
