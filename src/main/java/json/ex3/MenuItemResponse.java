package json.ex3;

import json.ex1.RecipeResult;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class MenuItemResponse {
    private String type;
    private List<MenuItem> menuItems;
    private int offset;
    private int number;
    private int totalMenuItems;
    private int processingTimeMs;
    private long expires;
}
