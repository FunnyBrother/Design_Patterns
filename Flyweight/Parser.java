package Flyweight;

import java.util.*;

public class Parser {
    public List<Unit> ParseHTML() {
        List<Unit> units = new ArrayList<>();
        for(int i = 0; i < 150; i++)
            units.add(new Dragon());
        for(int i = 0; i < 500; i++)
            units.add(new Goblin());
        System.out.println("Dragons and Goblins are parsed from HTML page");
        return units;
    }
}
