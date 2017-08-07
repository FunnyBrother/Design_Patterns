package Chain_of_Responsibility;

import java.util.HashMap;
import java.util.*;

public class Food {
    private HashMap<String, List<String>> ingradients = new HashMap<>();
    private String nameOfFood;

    public Food(String key, List<String> value) {
        ingradients.put(key, value);
    }

    public String getNameOfFood() {
        return nameOfFood;
    }
    public boolean containsIs(String key) {
        nameOfFood = key;
        if(ingradients.equals(key)) {
            return true;
        }
        return false;
    }

}
