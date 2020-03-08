package json.ex1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class RecipesResponse {
    private List<RecipeResult> results;
    private String baseUri;
    private int offset;
    private int number;
    private int totalResults;
    private int processingTimeMs;
    private long expires;

    @JsonProperty("isStale") // musimy zrobic taki zapis, zgodnie z tendencja nazewnictwa, bo metoda by sie nazywała "isisStale"
    private boolean stale;
}
