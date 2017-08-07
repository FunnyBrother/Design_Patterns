package Flyweight;

import java.lang.reflect.Type;
import java.util.Dictionary;
import java.util.*;

public class UnitImagesFactory {
    public static Map<Unit, List> skills = new HashMap<>();
    public static List<String> CreateDragonSkills() {
        if(!skills.containsKey(new Dragon())) {
            skills.put(new Dragon(), Arrays.asList("..."));
        }
        return skills.get(new Dragon());
    }
    public static List<String> CreateGoblinSkills() {
        if(!skills.containsKey(new Goblin())) {
            skills.put(new Goblin(), Arrays.asList("---"));
        }
        return skills.get(new Goblin());
    }
}
