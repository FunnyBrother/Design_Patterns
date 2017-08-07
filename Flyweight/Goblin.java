package Flyweight;

import java.util.ArrayList;
import java.util.Arrays;

class Goblin extends Unit {
    public Goblin() {
        name = "Goblin";
        health = 8;
        skill = UnitImagesFactory.CreateGoblinSkills();
    }
}
