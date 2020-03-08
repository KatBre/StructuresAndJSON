package json.ApiCalls;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import json.api1.GoldQuotation;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static HttpClient HTTP_CLIENT = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me start date in format YYYY-MM-DD");
        String startDate = scanner.nextLine();
        System.out.println("Give me end date in format YYYY-MM-DD");
        String endDate = scanner.nextLine();
        System.out.println("Give me code");
        String code = scanner.nextLine();
        System.out.println("Give me table");
        String table = scanner.nextLine();
        System.out.println("What do you want to calculate");
        System.out.println(" - 1 - average");
        System.out.println(" - 2 - maximum deviation");
        System.out.println(" - 3 - minimum and maximum");
        int choice = scanner.nextInt();

        String uri = "http://api.nbp.pl/api/exchangerates/rates/" + table + "/"
                + code + "/" + startDate + "/" + endDate + "/?format=json";


        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> resp = null;
        try {
            resp = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String responseBody = resp.body();

        ObjectMapper mapper = new ObjectMapper();


        switch (choice) {
            case 1:
                List<GoldQuotation> quotations = mapper.readValue(responseBody,
                        new TypeReference<List<GoldQuotation>>() {
                        }
                );

        }

    }
}
