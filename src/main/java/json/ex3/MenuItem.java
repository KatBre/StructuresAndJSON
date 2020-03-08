package json.ex3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(of = {"id", "title"})
public class MenuItem {
    private int id;
    private String title;
    private String restaurantChain;
    private String servingSize;
    private String readableServingSize;
    private String image;
    private String imageType;
}
