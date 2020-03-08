package json.api1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Main {
    private final static HttpClient HTTP_CLIENT = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

    public static void main(String[] args) {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://api.nbp.pl/api/cenyzlota/last/100/?format=json"))
                .build();

        try {
            HttpResponse<String> resp = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

            String responseBody = resp.body();

            ObjectMapper mapper = new ObjectMapper();
            List<GoldQuotation> quotations = mapper.readValue(responseBody,
                    new TypeReference<List<GoldQuotation>>() {
                    }
            );

            quotations.forEach(System.out::println);

            DoubleSummaryStatistics doubleSummaryStatistics = quotations.stream()
                    .mapToDouble(goldQuotation -> goldQuotation.getCena())
                    .summaryStatistics();
            System.out.println(doubleSummaryStatistics);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }


}
