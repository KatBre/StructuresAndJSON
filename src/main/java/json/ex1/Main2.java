package json.ex1;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.ex1.RecipesResponse;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            RecipesResponse response = objectMapper.readValue(new File("recipies.json"), RecipesResponse.class);
            response.getResults().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
