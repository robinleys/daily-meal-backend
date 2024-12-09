package be.robinleys.daily_meal_backend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Recipe {
    private long id;
    private String name;

    public Recipe(long id) {
        this.id = id;
    }

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
