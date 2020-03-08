package json.ex1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString(of = {"id", "title"})
public class RecipeResult {
    private  int id;
    private String title;
    private int readyInMinutes;
    private int servings;
    private String image;
    private List<String> imageUrls;
}
