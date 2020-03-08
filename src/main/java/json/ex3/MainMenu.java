package json.ex3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MainMenu {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            MenuItemResponse menu = objectMapper.readValue(new File("menu.json"), MenuItemResponse.class);
            menu.getMenuItems().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
