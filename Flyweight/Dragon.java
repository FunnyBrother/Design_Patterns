package Flyweight;

import java.util.ArrayList;
import java.util.Arrays;

class Dragon extends Unit{
    public Dragon() {
        name = "Dragon";
        health = 40;
        skill = UnitImagesFactory.CreateDragonSkills();
    }
}
