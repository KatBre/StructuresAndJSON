package json.ex2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Ingredient {
    private int id;
    private double amount;
    private String unit;
    private String unitLong;
    private String unitShort;
    private String aisle;
    private String name;
    private String original;
    private String originalString;
    private String originalName;
    private List<String> metaInformation;
    private List<String> meta;
    private String extendedName;
    private String image;

}
