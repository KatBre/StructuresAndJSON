package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import structures.ex1.Person;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person person =  new Person("Maria", "Konik", 54);

        //klasa dokonująca mapowania/serializacji json->obiekt obiekt->json
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // konwersja obiektu do formatu json(string)
            String result = objectMapper.writeValueAsString(person);

            //wypisanie na ekran
            System.out.println(result);

            //zapis do pliku
            objectMapper.writeValue(new File("person.json"), person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
