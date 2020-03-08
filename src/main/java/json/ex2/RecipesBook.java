package json.ex2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString(of = {"id", "title"})
public class RecipesBook {
    private int id;
    private String title;
    private String image;
    private String imageType;
    private int usedIngredientCount;
    private int missedIngredientCount;
    private List<Ingredient> missedIngredients;
    private List<Ingredient> usedIngredients;
    private List<Ingredient> unusedIngredients;
    private int likes;
}
